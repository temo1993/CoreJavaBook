package core.java.v1ch8;

/**
 @version 1.40 2002-07-07
 @author Cay Horstmann
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MulticastTest
{
    public static void main(String[] args)
    {
        MulticastFrame frame = new MulticastFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame with buttons to make and close secondary frames
 */
class MulticastFrame extends JFrame
{
    public MulticastFrame()
    {
        setTitle("MulticastTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame

        MulticastPanel panel = new MulticastPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}

/**
 A panel with buttons to create and close sample frames.
 */
class MulticastPanel extends JPanel
{
    public MulticastPanel()
    {
        // add "New" button

        JButton newButton = new JButton("New");
        add(newButton);
        final JButton closeAllButton = new JButton("Close all");
        add(closeAllButton);

        ActionListener newListener = event -> {
            BlankFrame frame
                    = new BlankFrame(closeAllButton);
            frame.show();
        };

        newButton.addActionListener(newListener);
    }
}

/**
 A blank frame that can be closed by clicking a button.
 */
class BlankFrame extends JFrame
{
    /**
     Constructs a blank frame
     @param closeButton the button to close this frame
     */
    public BlankFrame(final JButton closeButton)
    {
        counter++;
        setTitle("Frame " + counter);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(SPACING * counter, SPACING * counter);

        closeListener = event -> {
            closeButton.removeActionListener(closeListener);
            dispose();
        };
        closeButton.addActionListener(closeListener);
    }

    private ActionListener closeListener;
    public static final int DEFAULT_WIDTH = 200;
    public static final int DEFAULT_HEIGHT = 150;
    public static final int SPACING = 40;
    private static int counter = 0;
}
