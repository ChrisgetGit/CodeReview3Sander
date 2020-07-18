package CityBike;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Station {

    private int stationID;
    private String location;
    ArrayList<Bike> bikes = new ArrayList<>();


    Station(int stationID, String location) {
        setStationID(stationID);
        setLocation(location);
        ArrayList<Bike> bikes = new ArrayList<>();

    }

    public void addBike(Bike bike) {
        bikes.add(bike);
        System.out.println("--> Bike Nr. " + (bike.getBikeID()) + " added to station " + (location));
    }

    public void removeBike(Bike bikeRemove, Station station) {
                bikes.remove(bikeRemove);
                System.out.println("Bike Nr " + (bikeRemove.getBikeID()) + " is taken from station " + (location)+"\n");


        }



    public void stationedBikes () {
        System.out.println("\nStation at "+getLocation() + " has following bikes: \n"+ getBikes());
    }

        public ArrayList<Bike> getBikes () {
            return bikes;
        }

        public void setBikes (ArrayList < Bike > bikes) {
            this.bikes = bikes;
        }

        public int getStationID () {
            return stationID;
        }

        public void setStationID ( int stationID){
            this.stationID = stationID;
        }

        public String getLocation () {
            return location;
        }

        public void setLocation (String location){
            this.location = location;
        }
}

  //  public static ArrayList<Bike> getBikes() {
    //    return Bike ;
    //}













/* (5) Create a class Station containing following parameters:

        stationID (Integer)

        location (String)

        bikes: Bikes data structure is storing all Bikes that are currently in this station Decide yourself what data structure you want to use

        (5) Create 3 Station objects in your main() and put them in a HashMap - stations



        (10) Create a method of the Station class:

        addBike(... some parameter here ...)

        that puts a Bike into a Station. It’s up to you how to do that, while it also depends on the nature of your Station.bikes variable.

        (5) Demonstrate the usage of the addBike(...)  method by calling it in your main() method (put 3 bikes in Station1, and put 4 bikes in Station2).*/
