public class SportUtilityVehicle extends Vehicle{
    // Data fields
    private String modelName;
    private int numOfBenchSeats;
    private double towingCapacity;

    // constructor
    SportUtilityVehicle() {}

    // Setters
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setNumOfBenchSeats(int numOfBenchSeats) {
        this.numOfBenchSeats = numOfBenchSeats;
    }

    // Getters
    public String getModelName() {
        return modelName;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public int getNumOfBenchSeats() {
        return numOfBenchSeats;
    }

    // An overridden display function to display all information of the SUV
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
        +"\nNumber of Bench Seats:  " + getNumOfBenchSeats()
        +"\n---------------------------------------";


    }
}
