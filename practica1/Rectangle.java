
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Figure{
    private double base; 
    private double height;
    
    public Rectangle(double x, double y, double b, double h){
        super(x, y);
        base = b;
        height = h;
    }
    
    public String toString() {
        return "Rectangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    
    public boolean equals(Object o){
        if (!(o instanceof Rectangle)){
            return false;}
        
        Rectangle r = (Rectangle) o;
        return super.equals(r) && this.base == r.base && this.height == r.height;
    }
    
    public double area(){
        return base * height;
    }
    
    public double perimeter(){
        return 2 * (base + height);
    }
}
