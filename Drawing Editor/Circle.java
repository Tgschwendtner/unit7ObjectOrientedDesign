import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class Circle extends Shape

{
    
    public Circle()
    {
        super(center,radius,color);
    }
    
    public boolean isInside()
    {
        return true;
    }
    
    public void draw(Graphics2D g2)
    {
        //circle = new Rectangle2D.Double(100,100,100,100);
        //g2.setColor(color);
        //g2.draw(circle);
        //g2.fill(circle);
    }

}
