package core.java.v1ch9;

/**
 @version 1.31 2002-07-06
 @author Cay Horstmann
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderTest
{
    public static void main(String[] args)
    {
        BorderFrame frame = new BorderFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame with radio buttons to pick a border style.
 */
class BorderFrame extends JFrame
{
    public BorderFrame()
    {
        setTitle("BorderTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Lowered bevel",
                BorderFactory.createLoweredBevelBorder());
        addRadioButton("Raised bevel",
                BorderFactory.createRaisedBevelBorder());
        addRadioButton("Etched",
                BorderFactory.createEtchedBorder());
        addRadioButton("Line",
                BorderFactory.createLineBorder(Color.BLUE));
        addRadioButton("Matte",
                BorderFactory.createMatteBorder(
                        10, 10, 10, 10, Color.BLUE));
        addRadioButton("Empty",
                BorderFactory.createEmptyBorder());

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder
                (etched, "Border types");
        buttonPanel.setBorder(titled);

        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(2, 1));
        contentPane.add(buttonPanel);
        contentPane.add(demoPanel);
    }

    public void addRadioButton(String buttonName, final Border b)
    {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(event -> {
            demoPanel.setBorder(b);
            validate();
        });
        group.add(button);
        buttonPanel.add(button);
    }

    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 200;

    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;
}
