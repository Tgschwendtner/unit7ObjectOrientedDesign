import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    private JButton PickColor;
    private JButton AddCircle;
    private JButton AddSquare;
    private DrawingPanel panelThing;
    private JPanel colorPanel;
    public ControlPanel( DrawingPanel panelThing )
    {
        this.colorPanel = new JPanel();
        this.panelThing = panelThing;
        
        
        PickColor = new JButton ( "Pick a Color" );
        this.add ( PickColor );
        
        colorPanel.setBackground(Color.WHITE);

        this.add (colorPanel);

        AddSquare = new JButton ( "Add Square" );
        this.add ( AddSquare );

        AddCircle = new JButton ( "Add Circle" );
        this.add ( AddCircle );

        ClickListener listener = new ClickListener();

        this.PickColor.addActionListener( listener );
        this.AddSquare.addActionListener( listener );
        this.AddCircle.addActionListener( listener );

    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed( ActionEvent event )
        {
            if (event.getActionCommand().equals("Add Circle"))
            {
                //System.out.println("We added a circle");
                panelThing.addCircle();
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                //System.out.println("We added a Square");
                panelThing.addSquare();
            }
            else if (event.getActionCommand().equals("Pick a Color"))
            {
                //System.out.println("You picked a new color");
                panelThing.setColor();
                colorPanel.setBackground(panelThing.getColor());
                
            }
            else
            {
                System.out.println("Nothing Happened");
            }

        }

    }
    
}
