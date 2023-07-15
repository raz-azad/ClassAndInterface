package helloworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/// interface
// interface refer to a contract.
// It increases code maintainability and re-usability
// Multiple interface can be implemented
// when a class implements an interface to confronts
// with interface contract

/// final
// final keyword says this class can be inherited
// a method can also be mark as final.
// Note: order of public and final does not matter
public final class CargoFlight
        extends Flight
        implements Iterable, Comparable<Flight> {
    /// field hiding
    // be aware of field hiding
    // Note. Do not use same field in base and derived class.
    // Methods are associated with Class Object type.
    // Fields are associated with reference type.
    // Use method to access the field.
    private int passenger;
    private ArrayList<Flight> arrayListFlight = new ArrayList<>();

    public CargoFlight() {
        /// super
        // super is used to access based class member
        // super can be used to access constructor as well
        passenger = 4; // pilot + crew
    }

    /// override
    // overrides the base class
    @Override
    public void addPassenger(long aPassenger) {
    }

    @Override
    public int compareTo(Flight o) {
        // once the interface is implemented
        // the method needs to be overridden

        // Comparable interface helps to sort
        // based on what logic comes in this method.
        // below is on example how this methods handle sort
        // if the incoming object o is GREATER than current object fields return positive number
        // if the incoming object o is LESS than current object fields return negative number
        // if the incoming object o is EQUAL to current object fields return 0
        return 0;
    }

    @Override
    public Iterator<Flight> iterator() {
        return arrayListFlight.iterator();
    }

    /// anonymous class
    // anonymous class is another form of nested class
    // has instance relation between enclosing class and nested class
    // anonymous class used if required something one time
    public Iterable<Flight> getSortedFlight() {
        return new Iterable<Flight>() {
            @Override
            public Iterator<Flight> iterator() {
                return null;
            }
        };
    }
}
