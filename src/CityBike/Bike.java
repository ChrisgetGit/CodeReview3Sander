package CityBike;

import java.util.HashMap;

public class Bike {

    private int bikeID;
    static int bikeIDCount= 1;
    private String color;
    private String state;




     Bike(String color, String state) {
         setBikeID (bikeIDCount++) ;
         setColor(color);
         setState(state);
         //this.bikeID = getBikeID();

    }

    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    void displayBike() {
        System.out.println("bikeID: " + getBikeID() + " color = " + getColor() + " state =" + getState());
    }

    @Override
    public String toString() {
        return
                "bikeID =" + bikeID +
                ", color ='" + color +
                ", state ='" + state + 
                "\n";
    }
}



/*

(5) Create a Java class Bike containing following parameters:


        bikeID (Integer)

        color

        state (which can be CanBeRented, CanNotBeRented, InService, Discarded (aka so broken that the service won’t pay off)



        (10) Create a Bike constructor, that is using a static variable to create and increment bikeID automatically on creation of a new Bike object.

        (5) Create 8 or more Bike objects in your main().

        (5) In your main(), put all existing Bikes in a HashMap that uses bikeID as a source for the key value.



        (5) Create a class Station containing following parameters:

        stationID (Integer)

        location (String)

        bikes: Bikes data structure is storing all Bikes that are currently in this station Decide yourself what data structure you want to use

        (5) Create 3 Station objects in your main() and put them in a HashMap - stations



        (10) Create a method of the Station class:

        addBike(... some parameter here ...)

        that puts a Bike into a Station. It’s up to you how to do that, while it also depends on the nature of your Station.bikes variable.

        (5) Demonstrate the usage of the addBike(...)  method by calling it in your main() method (put 3 bikes in Station1, and put 4 bikes in Station2).

        (5) Create a User class with properties:

        userID

        name

        surname

        currentlyRentedBike: Decide what’s best to use here.

        Create 4 users.

        (30) demonstrate the rental procedure:

        UserZ rents bikeX from stationY1.

        BikeX is removed from the data of that Station, and is connected to userZ.

        UserZ returns a bike to stationY2

        Find a way to solve this problem.



        (15) Assure that a Station has a upper limit of bikes, that can be returned (for instance, max 5 bikes). If someone wants to call the method addBike(...), and the station is full, report that to the user over System.out.println() and prevent adding the bike.



        Additional points:



        (20) Add the rental tracking per user. User and Rent (new class) are connected, and the Rent class is tracking:

        bikeID

        rentStart (e.g DateTime)

        rentEnd (e.g DateTime)
*/