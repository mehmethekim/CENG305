import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
This program displays the growth of an investment.
 */
public class PopulationViewer
{
private static final int FRAME_WIDTH = 400;
private static final int FRAME_HEIGHT = 100;



    public void viewNames(Population population)
    {
            JFrame frame = new JFrame();
            
            // The button to trigger the calculation
            JButton button = new JButton("Show next person in the population");
            
            // The application adds interest to this bank account
            
            
            // The label for displaying the results
            final JLabel label = new JLabel("Person name: " + population.getOrder());
            
            // The panel that holds the user-interface components
            JPanel panel = new JPanel();
            panel.add(button);
            panel.add(label);
            frame.add(panel);
            
            
            class IncreaseOrderOfPersonListener implements ActionListener
            {
                //TODO
            }
            
            ActionListener listener = new IncreaseOrderOfPersonListener();
            button.addActionListener(listener);
            
            frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
     }
}