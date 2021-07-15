 
// section 2.10
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 * This class is used to draw an Alien Face using java.awt class.
 * The alien face has eliptic head, green circular eyes, a nose and a mouth.
 * It generates a component.
 * @author Mehmet Hekimoğlu
 */
public class FaceComponent extends JComponent
{  
    /**
     * This function draws the alien face.
     */
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;

      // Draw the head
      Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
      g2.draw(head);

      // Draw the eyes
      g2.setColor(Color.GREEN);
      // Rectangle eye = new Rectangle(25, 70, 15, 15);
      Ellipse2D.Double eye = new Ellipse2D.Double(25, 70, 15, 15);
      g2.fill(eye);
      Ellipse2D.Double eye2 = new Ellipse2D.Double(70, 70, 15, 15);
      g2.fill(eye2);

      // Draw the mouth
      Line2D.Double mouth = new Line2D.Double(30, 120, 80, 120);
      g2.setColor(Color.RED);
      g2.draw(mouth);
      // Draw the nose
      Line2D.Double nose = new Line2D.Double(55, 80, 55, 110);
      g2.setColor(Color.BLACK);
      g2.draw(nose);

      // Draw the greeting
      g2.setColor(Color.BLUE);
      g2.drawString("Hello, World!", 5, 175);
   }
}
