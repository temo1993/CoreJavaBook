package core.java.v1ch2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class WelcomeApplet extends JApplet
{
    public void init()
    {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JLabel label = new JLabel(getParameter("greeting"),
                SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 18));
        contentPane.add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();

        JButton cayButton = new JButton("Cay Horstmann");
        cayButton.addActionListener(makeURLActionListener(
                "http://www.horstmann.com"));
        panel.add(cayButton);

        JButton garyButton = new JButton("Gary Cornell");
        garyButton.addActionListener(makeURLActionListener(
                "mailto:gary@thecornells.com"));
        panel.add(garyButton);

        contentPane.add(panel, BorderLayout.SOUTH);
    }

    private ActionListener makeURLActionListener(final String u)
    {
        return new
                ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        try
                        {
                            getAppletContext().showDocument(new URL(u));
                        }
                        catch(MalformedURLException e)
                        {
                            e.printStackTrace();
                        }
                    }
                };
    }
}


