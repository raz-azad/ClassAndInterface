package helloworld;

public class Main {
    public static void main(String[] args) {

        /// Reference variables holds the reference of Flight class
        Flight[] lFlightObjRef = new Flight[5];

        for (short lIndex = 0; lIndex < lFlightObjRef.length; ++lIndex) {
            /// Creates class object and stores the reference of this object
            lFlightObjRef[lIndex] = new Flight();
        }

        /// Equal
        // == with object check if both reference refer to same object

        lFlightObjRef[3].addPassenger(2);
        lFlightObjRef[3].addPassenger(5);
        lFlightObjRef[4].addPassenger(20);

        for (Flight Item : lFlightObjRef) {
            System.out.println(Item.getPassenger());
        }
    }
}
