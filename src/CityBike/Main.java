package CityBike;

import java.time.LocalTime;
import java.util.HashMap;


public class Main {



    public static void main(String[] args) {


        Bike bike1 = new Bike ("red", "canBeRented");
        Bike bike2 = new Bike ("yellow", "canBeRented");
        Bike bike3 = new Bike ("blue","canBeRented");
        Bike bike4 = new Bike ("green", "canBeRented");
        Bike bike5 = new Bike ("green", "canBeRented");
        Bike bike6 = new Bike ("violet", "canBeRented");
        Bike bike7 = new Bike ("red", "canBeRented");
        Bike bike8 = new Bike ("blue", "canBeRented");

        Station station1 = new Station (1, "Wallensteinplatz");
        Station station2 = new Station(2,"Praterstern");
        Station station3 = new Station (3, "Friedensbrücke");


        bike1.displayBike();
        bike2.displayBike();
        bike3.displayBike();



        HashMap<Integer, Bike> bikeMap = new HashMap<>();
        bikeMap.put(bike1.getBikeID(), bike1);
        bikeMap.put(bike2.getBikeID(), bike2);
        bikeMap.put(bike3.getBikeID(), bike3);

        System.out.println(bikeMap.toString());

        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);

        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);
        station2.addBike(bike8);


        User user1 = new User ("Fritz", "Fantastisch");
        User user2 = new User("Basti", "Fantasty");
        User user3 = new User("Dummy", "Dum-Dum");
        station1.stationedBikes();

        user1.userBikeRent(bike2,station1,System.currentTimeMillis());
        user2.userBikeRent(bike1,station1,System.currentTimeMillis());

        station1.stationedBikes();

        station2.stationedBikes();

        user1.userBikeReturn(bike2,station2,System.currentTimeMillis());
        user1.userBikeRent(bike8, station2, System.currentTimeMillis());
        user3.userBikeRent(bike6,station2, System.currentTimeMillis());
        station2.stationedBikes();

        user1.userBikeReturn(bike2,station2,System.currentTimeMillis());
        user3.userBikeReturn(bike6,station3,System.currentTimeMillis());
        user2.userBikeReturn(bike1, station3,System.currentTimeMillis());

        station1.stationedBikes();
        station2.stationedBikes();
        station3.stationedBikes();

    }
}
