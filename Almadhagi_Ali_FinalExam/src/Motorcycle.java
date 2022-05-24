public class Motorcycle extends Vehicle{
    // Data fields
    private String modelName;
    private boolean sideCar;
    private boolean signalLights;
    private boolean radio;

    // constructor
    Motorcycle() {}

    // Setters
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    public void setSignalLights(boolean signalLights) {
        this.signalLights = signalLights;
    }


    // Getters
    public String getModelName() {
        return modelName;
    }

    public boolean isRadio() {
        return radio;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public boolean isSignalLights() {
        return signalLights;
    }

    // An overridden display function to display all information of the motorcycle
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
        +"\nRadio:  " + isRadio()
        +"\nSideCar:  " + isSideCar()
        +"\nSignal Lights:  " + isSignalLights()
        +"\n---------------------------------------";


    }
}
