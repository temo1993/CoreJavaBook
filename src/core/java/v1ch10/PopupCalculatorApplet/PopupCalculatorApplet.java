package core.java.v1ch10.PopupCalculatorApplet; /**
   @version 1.30 2000-05-12
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopupCalculatorApplet extends JApplet
{  
   public void init()
   {  
      // create a frame with a calculator panel
      
      frame = new JFrame();
      frame.setTitle("Calculator");
      frame.setSize(200, 200);
      frame.getContentPane().add(new CalculatorPanel());

      // add a button that pops up or hides the calculator
      
      JButton calcButton = new JButton("Calculator");
      getContentPane().add(calcButton);

      calcButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent evt)
            {  
               if (frame.isVisible()) frame.setVisible(false);
               else frame.show();
            }
         });
   }

   private JFrame frame;
}



