public class Car extends  Vehicle{
    // Data fields
    private String modelName;
    private boolean convertible;
    private String engineType;

    // constructor
    Car() {}

    // Setters
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


    // Getters
    public String getModelName() {
        return modelName;
    }

    public String getEngineType() {
        return engineType;
    }

    public boolean isConvertible() {
        return convertible;
    }


    // An overridden display function to display all information of the car
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
        +"\nType:  " + getEngineType()
        +"\nConvertible:  " + isConvertible()
        +"\n---------------------------------------";


    }
}
