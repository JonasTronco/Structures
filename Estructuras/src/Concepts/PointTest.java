package Concepts;

/**
 *
 * @author Wilson Soto
 * Reference Data Types
 */
class PointTest {

    public static void main(String[] args) {
        
        Point point1 = new Point();
        Point point2 = new Point(10, 20);
        Point point3 = point1;
        
        System.out.println("point1=" + point1);
        System.out.println("point2=" + point2);
        System.out.println("point3=" + point3);
        System.out.println(point1 == point3);
        point1.move(5, 5);
        System.out.println("point1=" + point1);
        System.out.println("point2=" + point2);
        System.out.println("point3=" + point3);
        System.out.println(point1 == point3);
       
    }
}