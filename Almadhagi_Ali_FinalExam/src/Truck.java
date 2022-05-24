public class Truck extends Vehicle{
    //Data fields
    private String modelName;
    private double cargoCapacity;
    private double towingCapacity;
    private boolean bedliner;
    private String type;


    // constructor
    Truck() {}


    // Setters
    public void setBedliner(boolean bedliner) {
        this.bedliner = bedliner;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setType(String tytpe) {
        this.type = tytpe;
    }


    //Getters
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public String getType() {
        return type;
    }

    public boolean isBedliner() {
        return bedliner;
    }

    // An overridden display function to display all information of the truck
    @Override
    public String display()
    {
        return "\nManufacturer:  " + getManufacturer()
        +"\nPrice: " + getPrice()
        +"\nWheels: " + getWheels()
        +"\nDoors: " + getDoors()
        +"\nHorsepower:  " + getHorsePower()
        +"\nPassengers:  " + getNumOfPassengers()
        +"\nCrash Rating:  " + getCrashRating()
        +"\nModel:  " + getModelName()
        +"\nTowing Capacity:  " + getTowingCapacity()
        +"\nCargo Capacity:  " + getCargoCapacity()
        +"\nBedliner:  " + isBedliner()
        +"\nType:  " + getType()
        +"\n---------------------------------------";


    }
}
