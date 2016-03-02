import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JComponent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    ArrayList<Shape> shapes;
    Color color;
    Shape square;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        color = Color.BLUE;
    }
    
    public void addCircle()
    {
        //Shape.addShape(Circle);
    }
    
    public void addSquare()
    {   
        square = new Square(200,150,100,this.color);
        shapes.add(square);
        //Square.draw();
        
    }
   
    public void paintComponent(Graphics g)
    {
        
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void setColor()
    {
        color = JColorChooser.showDialog(this, "Color Chooser" , this.color);
    }

}
