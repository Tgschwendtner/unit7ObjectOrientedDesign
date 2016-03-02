import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.Color;
public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    public Shape(Point2D.Double center , double radius , Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public Point2D.Double getCenter()
    {
        return this.center;
    }

    public double getRadius()    
    {
        return this.radius;
    }

    public void move()
    {
        
    }

    public void setRadius()
    {
        
    }

    public  boolean isInside()
    {
        return true;
    }

    public  boolean isOnBorder()
    {
        return true;
    }

    public  void draw()
    {
    }
    
}

