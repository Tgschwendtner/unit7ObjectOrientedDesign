import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        setLayout(new BorderLayout());
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas);
        this.setSize(600,600);
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setVisible( true );
        
        
        
         

    }
    
    public static void main (String[] args )
    {
        DrawingEditor scene = new DrawingEditor();
    }
    
}

