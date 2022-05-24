public  class Vehicle {
   // Data fields
    private int doors;
    private int wheels;
    private int horsePower;
    private int numOfPassengers;
    private Double price;
    private String manufacturer;
    private int crashRating;

  // Constructor
    Vehicle() {}

    // Setters
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCrashRating(int crashRating) {
        this.crashRating = crashRating;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // Getters
    public Double getPrice() {
        return price;
    }

    public int getCrashRating() {
        return crashRating;
    }

    public int getDoors() {
        return doors;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWheels() {
        return wheels;
    }

   // a display method to display vehicle's information
    String display() {
        return null;
    }
}
