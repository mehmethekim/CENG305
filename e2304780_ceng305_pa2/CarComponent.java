//CarComponent.java
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
This component draws two car shapes.
*/
public class CarComponent extends JComponent
{
    
    private int x;
    private int y;
    public Car car1 = new Car(0,0);
    public Car car2 = new Car(300 - 60,400-80);
     public void paintComponent(Graphics g)
     {
         
            
         Graphics2D g2 = (Graphics2D) g;



        
         car1.draw(g2);
         car2.draw(g2);
        
     }
     /**
      * This fucntion will move the painted cars on the screen by the given amount.
      * @param1 amount of value in x direction to be moved on the screen.
      * @param2 amount of value in y direction to be moved on the screen.
      */
     public void moveCar(int x_move,int y_move){
         car1.move(x_move,y_move);
         repaint();
         car2.move(-x_move,y_move);
         repaint();
         
        }
}



