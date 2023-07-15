package helloworld;

/// enum
// is a class
// field is used to simplify implementation
// works great with switch case
// used for equality test (== ,!=, <, >)
// ordered list
// first is lowest
// last is highest
public enum FlightEnum {
    COMMERCIAL(407),
    CORPORATE(203),
    PRIVATE(3);
    private int flightNumber;

    FlightEnum(int aFlightNumber) {
        // constructor in enum are always private
        this.flightNumber = aFlightNumber;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }
}
