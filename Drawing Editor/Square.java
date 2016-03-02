import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
public class Square extends Shape
{
    
    public Square()
    {
        super(center,radius,color);
    }
    public boolean isInside()
    {
        return true;
    }
    
    public void draw(Graphics2D g2)
    {
        square = new Rectangle2D.Double(centerPointX,centerPointY,radius,radius);
        g2.setColor(color);
        g2.draw(square);
        g2.fill(square);
    }

}
