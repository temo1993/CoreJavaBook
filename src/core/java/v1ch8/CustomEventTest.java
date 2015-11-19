package core.java.v1ch8;

/**
 @version 1.30 2000-06-03
 @author Cay Horstmann
 */

import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Random;

public class CustomEventTest
{
    public static void main(String[] args)
    {
        CustomEventFrame frame = new CustomEventFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame with a panel that displays falling raindrops
 */
class CustomEventFrame extends JFrame
{
    public CustomEventFrame()
    {
        setTitle("CustomEventTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add frame to panel

        CustomEventPanel panel = new CustomEventPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}

/**
 A panel that displays falling rain drops
 */
class CustomEventPanel extends JPanel
{
    public CustomEventPanel()
    {
        y = 0;
        circles = new ArrayList();

        Timer t = new Timer(100);
        TimerAction listener = new TimerAction();
        t.addTimerListener(listener);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        // translate the origin to create illusion of falling drops
        g2.translate(0, y);

        // draw all circles
        for (Object circle : circles) g2.draw((Ellipse2D) circle);
    }

    private ArrayList circles;
    private int y;

    private class TimerAction implements TimerListener
    {
        public void timeElapsed(TimerEvent event)
        {
            if (getWidth() == 0) return; // panel not yet shown

            // add another circle
            int x = generator.nextInt(getWidth());
            Ellipse2D circle = new Ellipse2D.Double(x, -y,
                    SIZE, SIZE);
            circles.add(circle);

            // shift up the origin
            y++;

            repaint();
        }

        private Random generator = new Random();
        private static final int SIZE = 9;
    }
}

/**
 A custom event class.
 */
class TimerEvent extends AWTEvent
{
    public TimerEvent(Timer t) { super(t, TIMER_EVENT); }
    public static final int TIMER_EVENT
            = AWTEvent.RESERVED_ID_MAX  + 5555;
}

/**
 A custom event listener interface.
 */
interface TimerListener extends EventListener
{
    public void timeElapsed(TimerEvent event);
}

/**
 A custom timer class that is the source of timer events.
 */
class Timer extends JComponent implements Runnable
{
    public Timer(int i)
    {
        listenerList = new EventListenerList();
        interval = i;
        Thread t = new Thread(this);
        t.start();
    }

    /**
     Adds a timer listener
     @param listener the listener to add
     */
    public void addTimerListener(TimerListener listener)
    {
        listenerList.add(TimerListener.class, listener);
    }

    /**
     Removes a timer listener
     @param listener the listener to remove
     */
    public void removeTimerListener(TimerListener listener)
    {
        listenerList.remove(TimerListener.class, listener);
    }


    /**
     Posts a new timer event every <code>interval</code>
     milliseconds.
     */
    public void run()
    {
        while (true)
        {
            try { Thread.sleep(interval); }
            catch(InterruptedException e) {}

            TimerEvent event = new TimerEvent(this);

            EventQueue queue
                    = Toolkit.getDefaultToolkit().getSystemEventQueue();
            queue.postEvent(event);
        }
    }

    public void processEvent(AWTEvent event)
    {
        if (event instanceof TimerEvent)
        {
            EventListener[] listeners = listenerList.getListeners(
                    TimerListener.class);
            for (EventListener listener : listeners)
                ((TimerListener) listener).timeElapsed(
                        (TimerEvent) event);
        }
        else
            super.processEvent(event);
    }

    private int interval;
    private EventListenerList listeners;
}

