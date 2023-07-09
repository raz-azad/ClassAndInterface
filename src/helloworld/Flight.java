package helloworld;

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

    public long getPassenger() {
        return passenger;
    }

    /// Variable length parameter list
    public void addFlights(int aPassenger, Flight... aFlights) {
        // second parameter aFlights takes multiple Flight reference
        // the compiler converts aFlights into an array
        // variable length parameter list should be always the last parameter
    }
}
