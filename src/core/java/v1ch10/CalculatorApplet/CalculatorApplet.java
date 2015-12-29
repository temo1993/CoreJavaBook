package core.java.v1ch10.CalculatorApplet; /**
   @version 1.30 2000-05-12
   @author Cay Horstmann
*/

import java.awt.*;
import javax.swing.*;

public class CalculatorApplet extends JApplet
{  
   public void init()
   {  
      Container contentPane = getContentPane();
      CalculatorPanel panel = new CalculatorPanel();
      contentPane.add(panel);
   }
}




