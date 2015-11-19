package core.java.v1ch9;

/**
 @version 1.31 2002-07-10
 @author Cay Horstmann
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButtonTest
{
    public static void main(String[] args)
    {
        RadioButtonFrame frame = new RadioButtonFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.show();
    }
}

/**
 A frame with a sample text label and radio buttons for
 selecting font sizes.
 */
class RadioButtonFrame extends JFrame
{
    public RadioButtonFrame()
    {
        setTitle("RadioButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        Container contentPane = getContentPane();

        // add the sample text label

        label = new JLabel(
                "The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN,
                DEFAULT_SIZE));
        contentPane.add(label, BorderLayout.CENTER);

        // add the radio buttons

        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small", 8);
        addRadioButton("Medium", 12);
        addRadioButton("Large", 18);
        addRadioButton("Extra large", 36);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    /**
     Adds a radio button that sets the font size of the
     sample text.
     @param name the string to appear on the button
     @param size the font size that this button sets
     */
    public void addRadioButton(String name, final int size)
    {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        // this listener sets the label font size

        ActionListener listener = evt -> {
            // size refers to the final parameter of the
            // addRadioButton method
            label.setFont(new Font("Serif", Font.PLAIN,
                    size));
        };

        button.addActionListener(listener);
    }

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 200;

    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;

    private static final int DEFAULT_SIZE = 12;
}
