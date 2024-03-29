package lesson11;

public class Point {
    int x, y; //by default, all variables that aren't explicitly stated as public nor private are accessible by classes in the same package.
    public String name;

    public static void main(String[] argv) {
        Point pt1, pt2 = new Point();
        pt1 = new Point();

        pt1.x = 3;
        pt1.y = 10;

        pt2.x = 5;
        pt2.y = 7;

        System.out.println("Travelling from pt1 to pt2");
        pt1.travelTo(pt2); // Call a non-static function upon an instance
        System.out.println("Travelling from pt2 to pt1");
        staticTravelTo(pt2, pt1); // Static function

        // HOMEWORK
        LineSegment segment = new LineSegment();
        // Endpoint 1 = (3,4)
        segment.endpoint1.x = 3;
        segment.endpoint1.y = 4;
        // Endpoint 2 = (5,5)
        segment.endpoint2.x = 5;
        segment.endpoint2.y = 5;

        // Test Point = (7,6)
        Point testPoint = new Point();
        testPoint.x = 7;
        testPoint.y = 6;
        // Test Point #2 = (9,88)
        Point testPoint2 = new Point();
        testPoint2.x = 9;
        testPoint2.y = 88;

        // Calling the "onLine" function
        System.out.println(testPoint.onLine(segment));
        System.out.println(testPoint2.onLine(segment));
    }

    int travelTo(Point destination) {
        if (x < destination.x) {
            System.out.print("Walked east ");
        } else {
            System.out.print("Walked west ");
        }
        System.out.println(Math.abs(destination.x - x) + " steps");

        if (y < destination.y) {
            System.out.print("Walked north ");
        } else {
            System.out.print("Walked south ");
        }
        System.out.println(Math.abs(destination.y - y) + " steps");
        return Math.abs(destination.x - x) + Math.abs(destination.y - y);
    }

    boolean onLine(LineSegment line) {
        double slope = (line.endpoint2.y - line.endpoint1.y) / (line.endpoint2.x - line.endpoint1.x);
        if ((y - line.endpoint2.y) / (x - line.endpoint2.x) == slope) {
            return true;
        }
        return false;
    }

    static void staticTravelTo(Point from, Point to) {
        from.travelTo(to);
    }
}
