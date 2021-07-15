//CarViewer.java
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Mehmet Hekimoğlu
 * @since 15.05.2021
 * This class will show the painted cars on the screen
 */
public class CarViewer
{
    /**
     * This class will show the cars on the screen. On of them is one top left and the other one is one bottom right.
     */
    public void viewCars()
    {
        
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarComponent component = new CarComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    /**
     * This class will show two cars moving on the screen in time.
     */
    public void viewCarsMoving(){
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two cars moving");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CarComponent component = new CarComponent();
        frame.add(component);
        
        frame.setVisible(true);
        class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent event){
                component.moveCar(5,0);
                component.repaint();
            }
        }
        ActionListener listener  = new TimerListener();
        int Delay = 50;
        Timer t = new Timer(Delay,listener);
        t.start();
        
    }
    
}