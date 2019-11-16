package lesson11;

public class LineSegment {
    Point endpoint1 = new Point();
    Point endpoint2 = new Point();

    public static void main(String[] argv) {
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
        // Calling function containsPoint()
        System.out.println(segment.containsPoint(testPoint));
        System.out.println(segment.containsPoint(testPoint2));
    }

    boolean containsPoint(Point p) {
        int slope = (endpoint2.y - endpoint1.y) / (endpoint2.x - endpoint1.x);
        if ((p.y - endpoint2.y)/(endpoint2.x - p.x) == slope) {
            return true;
        }
        return false;
    }
}
