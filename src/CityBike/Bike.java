package CityBike;

public class Bike {

    private int bikeID;
    static int bikeIDCount= 1;
    private String color;
    private String state;




     Bike(String color, String state) {
         setBikeID (bikeIDCount++) ;
         setColor(color);
         setState(state);


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


