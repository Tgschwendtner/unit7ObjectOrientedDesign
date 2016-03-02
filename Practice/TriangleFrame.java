import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.util.Arrays;
/**
This frame contains a moving rectangle.
 */
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private TriangleComponent scene;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            double x = event.getX();
            double y = event.getY();
            scene.savePointx(x);
            scene.savePointy(y);
            scene.repaint();
        }

        // Do-nothing methods
        public void mouseReleased(MouseEvent event) 
        {
        }

        public void mouseClicked(MouseEvent event) 
        {
        }

        public void mouseEntered(MouseEvent event) 
        {
        }

        public void mouseExited(MouseEvent event) 
        {
        }
    }
    
    public TriangleFrame()
    {
        scene = new TriangleComponent();
        add(scene);

        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}