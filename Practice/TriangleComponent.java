import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
public class TriangleComponent extends JComponent
{
    private double point1x;
    private double point1y;
    private double point2x;
    private double point2y;
    private double point3x;
    private double point3y;
    private int county;
    private int countx;
    private int count;
    public TriangleComponent()
    {
        Ellipse2D dot = new Ellipse2D.Double();
        Line2D line = new Line2D.Double();
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if ( count == 0 )
        {
            
        }
        else if ( count == 1 )
        {
            Ellipse2D dot1 = new Ellipse2D.Double(point1x , point1y, 2,2);
            g2.draw(dot1);
            
        }
        else if ( count == 2 )
        {
            
            //draws line from dot 1 to point2x and y
            Line2D line1 = new Line2D.Double(  point1x,  point1y,  point2x,  point2y );
            g2.draw(line1);
            
        }
        else if ( count == 3 )
        {
            
            //draws line from dot 1 to point3x and y + a line from point2x and y 
            Line2D line1 = new Line2D.Double( point1x, point1y, point2x, point2y );
            Line2D line2 = new Line2D.Double( point1x, point1y, point3x, point3y );
            Line2D line3 = new Line2D.Double( point2x, point2y, point3x, point3y );
            g2.draw(line1);
            g2.draw(line2);
            g2.draw(line3);
            
        }
        else
        {
            count = 0;
        }
    }
    public void savePointx(double x)
    {
        countx++;
        count++;
        if ( countx == 0 )
        {
            
        }
        else if ( countx == 1 )
        {
            point1x = x;
            
        }
        else if ( countx == 2 )
        {
            point2x = x;
            
            
        }
        else if ( countx == 3 )
        {
            point3x = x;
            
           
        }
        else
        {
            countx = 0;
           
        }
    }
    public void savePointy(double y)
    {
        county++;
        if ( county == 0 )
        {
            
        }
        else if ( county == 1 )
        {
            point1y = y;
            
            
        }
        else if ( county == 2 )
        {
            point2y = y;
            
            
        }
        else if ( county == 3 )
        {
            point3y = y;
            
           
        }
        else
        {
            county = 0;
            
        }
    }
}
