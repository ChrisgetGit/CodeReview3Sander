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

