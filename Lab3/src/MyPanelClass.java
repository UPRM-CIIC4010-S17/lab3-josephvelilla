import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x1, y1, width, height);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        g.setColor(Color.BLUE);
                        g.drawRect(x1, y1, width, height);
                        //Draw a second border
                        g.setColor(Color.black.white);
                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
                        //Draw a line left to right
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        //Draw a second line right to left
                        g.setColor(Color.WHITE);
                        g.drawLine(width, 0, 0, height);
                        //Draw an Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.drawOval((width)/2 - 55/2, (height)/2 - 55/2, 55, 55);
                        //Fill the Oval
                        g.setColor(Color.BLUE);
                        g.fillOval((width)/2 - 55/2, (height)/2 - 55/2, 55, 55);
                        
                        
            }
}