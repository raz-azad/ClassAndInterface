package helloworld;


/// Object
// all class if not specify extend, extend from Object class
// If Object is used to store reference or object
// before cast it to a type always check with instanceof


import java.util.ArrayList;

/// abstract
// abstract indicates the class needs to be inherited to be used
// abstract can be used with method to indicate
// the method needs to be overridden
// (the derived class have to provide an implementation)
// if a method marked as abstract, the class is abstract as well
// the class should marked abstract as well
// Note: order of public and abstract does not matter
public class Flight {
    /// static
    // static is same within all class instance
    // it can be accessed by only static method
    // static import and static initialization is there as well.
    // Note: Avoid static fields if possible
    private static int maxPassengerPerFlight;
    private int passenger;
    private short seats;



    /// initialization block
    {
        // can have multiple initialization block
        // first this runs (close to source file)

        // initialization block is called by all constructor
    }

    {
        // second this one runs.
    }

    /// overloading
    public Flight() {
        // default constructor
        passenger = 12; // pilot + crew
    }

    public Flight(int aPassenger) {
        passenger = aPassenger;
    }

    public Flight(int aPassenger, short aSeats) {
        /// constructor chain
        // one constructor can call another constructor
        this(aPassenger);
        seats = aSeats;
    }

    public void addPassenger() {
        ++passenger;
    }

    /// widening (implicit conversion)
    // when called with (short) the compiler do widening conversion
    // this is no true for narrowing. (needs to be explicitly declared)
    public void addPassenger(long aPassenger) {
        passenger += aPassenger;
    }

    public int getPassenger() {
        return passenger;
    }

    /// Variable length parameter list
    public void addFlights(int aPassenger, Flight... aFlights) {
        // second parameter aFlights takes multiple Flight reference
        // the compiler converts aFlights into an array
        // variable length parameter list should be always the last parameter
    }

    /// nested class
    // nested class is declared with static keyword
    // no instance relation between enclosing class and nested class
    // nested class used for naming scope
    // nested class used to group some responsibility of enclosing class
    // it can have all access modifier (package private, private, public, protected)
    public static class NestedClass {
        // nested class can access the members of parent class
        // all members and fields (package private, private, public, protected)
        private Flight flightObject = new Flight();
        private int nestedClassPassenger = flightObject.passenger;
        private int nestedClassPassengerWithGetter = flightObject.getPassenger();

        private int getNestedClassPassenger() {
            return nestedClassPassenger;
        }
    }

    private void accessNestedClass() {
        // enclosing class can access the members of parent class
        // all members and fields (package private, private, public, protected)
        NestedClass objNestedClass = new NestedClass();
        int lPassenger = objNestedClass.nestedClassPassenger;
        int lPassengerWithGetter = objNestedClass.getNestedClassPassenger();
    }

    /// inner class
    // inner class is another form of nested class
    // inner class is declared without static keyword
    // has instance relation between enclosing class and nested class
    // nested class used to group some responsibility of enclosing class
    private class InnerNestedClass {
        // nested class can access the members of parent class
        // all members and fields (package private, private, public, protected)
        private Flight flightObject = new Flight();
        private int innerClassPassenger = flightObject.passenger;
        private int innerClassPassengerWithGetter = flightObject.getPassenger();

        private int getNestedClassPassenger() {
            return innerClassPassenger;
        }
    }

    private void accessInnerNestedClass() {
        // enclosing class can access the members of parent class
        // all members and fields (package private, private, public, protected)
        NestedClass objNestedClass = new NestedClass();
        int lPassenger = objNestedClass.nestedClassPassenger;
        int lPassengerWithGetter = objNestedClass.getNestedClassPassenger();
    }
}