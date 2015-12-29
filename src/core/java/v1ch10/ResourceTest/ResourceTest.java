package core.java.v1ch10.ResourceTest; /**
   @version 1.30 2000-05-12
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ResourceTest
{  
   public static void main(String[] args)
   {  
      ResourceTestFrame frame = new ResourceTestFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.show();
   }
}

/**
   A frame with a panel that has components demonstrating
   resource access from a JAR file.
*/
class ResourceTestFrame extends JFrame 
{  
   public ResourceTestFrame()
   {  
      setTitle("ResourceTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      setContentPane(new AboutPanel());
   }

   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 300;  
}

/**
   A panel with a text area and an "About" button. Pressing
   the button fills the text area with text from a resource.
*/
class AboutPanel extends JPanel
{  
   public AboutPanel()
   {  
      setLayout(new BorderLayout());

      // add text area
      textArea = new JTextArea();
      add(new JScrollPane(textArea), BorderLayout.CENTER);

      // add About button
      URL aboutURL = AboutPanel.class.getResource("about.gif");
      JButton aboutButton = new JButton("About", 
         new ImageIcon(aboutURL));
      aboutButton.addActionListener(new AboutAction());
      add(aboutButton, BorderLayout.SOUTH);
   }

   private JTextArea textArea;

   private class AboutAction implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         try
         {  
            // read text from resource into text area
            InputStream in = AboutPanel.class.
               getResourceAsStream("about.txt");
            BufferedReader reader = new BufferedReader(new
               InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null)
               textArea.append(line + "\n");
         } 
         catch(IOException exception) 
         { 
            exception.printStackTrace(); 
         }
      }
   }
}

