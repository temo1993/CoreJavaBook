package core.java.v1ch7;

/**
 @version 1.31 2001-07-06
 @author Cay Horstmann
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageTest
{
    public static void main(String[] args)
    {
        ImageFrame frame = new ImageFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame with an image panel
 */
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        setTitle("ImageTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame

        ImagePanel panel = new ImagePanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}

/**
 A panel that displays a tiled image
 */
class ImagePanel extends JPanel
{
    public ImagePanel()
    {
        // acquire the image
      /*
      image = Toolkit.getDefaultToolkit().getImage
         ("blue-ball.gif");
      MediaTracker tracker = new MediaTracker(this);
      tracker.addImage(image, 0);
      try { tracker.waitForID(0); }
      catch (InterruptedException exception) {}
      */
        try
        {
            image = ImageIO.read(new File("blue-ball.gif"));
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (image == null) return;

        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);

        // draw the image in the upper-left corner

        g.drawImage(image, 0, 0, null);

        // tile the image across the panel

        for (int i = 0; i * imageWidth <= getWidth(); i++)
            for (int j = 0; j * imageHeight <= getHeight(); j++)
                if (i + j > 0)
                    g.copyArea(0, 0, imageWidth, imageHeight,
                            i * imageWidth, j * imageHeight);
    }

    private Image image;
}

