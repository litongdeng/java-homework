package lesson11;

public class Person {
    String name;
    int age;
    int energyLevel = 100; // default level is 100
    Point location;

    void walk(int steps) {
        System.out.println(name + " has walked " + steps + " steps.");
        for (int i = 0; i <= steps; i++) {
            energyLevel--;
            if (energyLevel < 0) {
                seeDoctor();
            }
        }
    }

    void meet(Person p) {
//        Point.staticTravelTo(location, p.location);
        int stepsTaken =
                location.travelTo(p.location);
        walk(stepsTaken);
    }

    void seeDoctor() {
        System.out.println(name + " passed out due to overexertion and had to be brought to a hospital via ambulance. ");
        energyLevel = 100;
        System.out.println(name + "'s energy level has been restored. Good luck out there m'boi. ");
    }

    public static void main(String[] argv) {
        Person p = new Person(); // p and p2 are both instances/objects of the class "person"
        p.age = 15;
        p.name = "Charles";
        p.location = new Point();
        p.location.x = 2;
        p.location.y = 10;

        Person p2 = new Person();
        p2.name = "Tony";
        p2.age = 14;
        p2.location = new Point();
        p2.location.x = 4;
        p2.location.y = 8;

        p.meet(p2);

//        p.walk(145);
//        p2.walk(4);
    }
}
