package core.java.v1ch7;

/**
 @version 1.30 2000-05-02
 @author Cay Horstmann
 */

import javax.swing.*;
import java.awt.*;

public class NotHelloWorld
{
    public static void main(String[] args)
    {
        NotHelloWorldFrame frame = new NotHelloWorldFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame that contains a message panel
 */
class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        setTitle("NotHelloWorld");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame

        NotHelloWorldPanel panel = new NotHelloWorldPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}

/**
 A panel that displays a message.
 */
class NotHelloWorldPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawString("Not a Hello, World program",
                MESSAGE_X, MESSAGE_Y);
    }

    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
}
