package CityBike;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class User {

    private int userID;
    static int userIDCounter= 1;
    private String name;
    private String surname;
    private int currentlyRentedBike;
    long rentedTime;


    User(String name, String surname){
        setName(name);
        setSurname(surname);
        setUserID (userIDCounter++);
        int currentlyRentedBike;

    }

    public void userBikeRent (Bike bikeR, Station bikes, long start){
        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date result = new Date(start);
        // Formatting Date according to the
        // given format
        System.out.println("\nBike rented @ "+simple.format(result));
        if (currentlyRentedBike != 0){
            System.out.println("You "+getName()+" "+getSurname()+", already have a bike (Bike Nr"+currentlyRentedBike+")! Additional rental of bike Nr " +bikeR.getBikeID()+" is NOT possible!");
        }else {
            printUserTake();
            setCurrentlyRentedBike(bikeR.getBikeID());
            bikes.removeBike(bikeR,bikes);
            bikeR.setState("CanNotBeRented");

            }
    }

    public void userBikeReturn(Bike bikeR, Station bikes, long end){
        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date result = new Date(end);
        // Formatting Date according to the
        // given format
        System.out.println("\nBike returned @ "+simple.format(result));

        if (bikes.bikes.size()>= 5){
            System.out.println("Sry " +getName()+", return is not possible, to many bikes in station "+bikes.getLocation());
        }
        else  {printUserRet();
        setCurrentlyRentedBike(0);
        bikes.addBike(bikeR);}
        bikeR.setState("CanBeRented");
    }





    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCurrentlyRentedBike() {
        return currentlyRentedBike;
    }

    public void setCurrentlyRentedBike(int currentlyRentedBike) {
        this.currentlyRentedBike = currentlyRentedBike;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentlyRentedBike=" + currentlyRentedBike +
                '}';
    }

    public void printUserRet(){
        System.out.print("User nr "+getUserID()+" "+getName()+" " +getSurname()+", has returned ");
    }

    public void printUserTake(){
        System.out.print("User nr "+getUserID()+"  "+getName()+" " +getSurname()+" took a bike! ");
    }

}


/*
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
        */