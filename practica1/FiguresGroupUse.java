
/**
 * class FiguresGroupUse.
 * 
 * @author LTP 
 * @version 2018-19
 */
public class FiguresGroupUse {
    public static void main(String[] args) {
        FiguresGroup g = new FiguresGroup();
        Circle c1 = new Circle(10, 5, 3.5);
        g.add(c1);
        Triangle t1 = new Triangle(10, 5, 6.5, 32);
        g.add(t1);
        System.out.println(g);
        System.out.println(c1.area());
        System.out.println(t1.area());
        
        FiguresGroup a = new FiguresGroup();
        a.add(new Circle(9, 5, 3.5));
        a.add(new Triangle(10, 5, 6.5, 32));
        System.out.println(a.equals(g));
    }
}