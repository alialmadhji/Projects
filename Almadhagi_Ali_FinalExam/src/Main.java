import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // An array list of type vehicle to hold all types of vehicles
    static ArrayList <Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {

        int options = 0;

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // Welcome message to the user
        System.out.println("Welcome to the HFC Vehicle Solutions Program!");

        // a while loop to exit the program when the user enters 4
        while ( options != 4)
        {
           // Asking user what option do they want to choose
            System.out.println("""

                    Please choose from the following options:
                    1.  Create a Vehicle
                    2.  View List
                    3.  Print List
                    4.  Exit
                    selection: 
                    """);
            options = input.nextInt();

            // Validating user's input for options
            while (options < 1 || options > 4)
            {
                System.out.println("Invalid input! Please enter from the options above!!");
                options = input.nextInt();
            }

            // a switch statement to make the program do things based on user's selection
            switch (options) {
                case 1 -> createVehicle();
                case 2 -> viewList();
                case 3 -> printList();
            }


        }
    }

    // A function to create vehicles
    public static void createVehicle(){
        int selection;

        Scanner input = new Scanner(System.in);

        // initializing objects so we can add data to them
        Truck truck = new Truck();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        SportUtilityVehicle sportUtilityVehicle = new SportUtilityVehicle();

        // Asking the user what kind of vehicle they want to create
        System.out.println("""

        Enter the type of vehicle you wish to create:
        1.  Truck
        2.  Sport Utility Vehicle (SUV)
        3.  Motorcycle
        4.  Car
        Selection: \s
        """);
        selection = input.nextInt();

        // Validating user's input for vehicle selecton
        while(selection < 1 || selection > 4)
        {
            System.out.println("Invalid input!! please enter one of the options above!" +
                    "Selection:");
            selection = input.nextInt();

        }

        // an if statement to add vehicles based on user's selection
        if (selection == 1)
        {
            createTruck(truck);
            vehicles.add(truck);
        }
        if (selection == 2)
        {
            createSportUtilityVehicle(sportUtilityVehicle);
            vehicles.add(sportUtilityVehicle);
        }
        if (selection == 3)
        {
            createMotorcycle(motorcycle);
            vehicles.add(motorcycle);
        }
        if (selection == 4)
        {
            createCar(car);
            vehicles.add(car);
        }


    }

    // a function to create truck
    public static void createTruck(Truck truck){
        String modelName;
        double cargoCapacity;
        double towingCapacity;
        boolean bedliner;
        String type;
        int abedliner;

        Scanner input = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();

        // calling the get general info function to add the general info to the truck
        getGeneralInfo(vehicle);

        // asking user to enter the information of the truck they want to add
        System.out.println("\nWhat is the vehicle’s model?  ");
        modelName = input.next();

        System.out.println("What is the vehicle’s towing capacity in pounds?");
        towingCapacity = input.nextDouble();

        System.out.println("What is the vehicle’s cargo capacity in pounds? ");
        cargoCapacity = input.nextDouble();

        System.out.println("""
                Does the vehicle have a bedliner?
                1.  Yes
                2.  No
                """);
        abedliner = input.nextInt();

        while(abedliner < 1 || abedliner > 2)
        {
            System.out.println("Invalid input! Enter 1 for yes or 2 for no!!" +
                    "Selection:");
            abedliner = input.nextInt();
        }

        System.out.println("What is the type of truck?  ");
        type = input.next();

        bedliner = abedliner == 1;

        // assigning vehicle information to the class data fields
        truck.setBedliner(bedliner);
        truck.setModelName(modelName);
        truck.setCrashRating(vehicle.getCrashRating());
        truck.setCargoCapacity(cargoCapacity);
        truck.setDoors(vehicle.getDoors());
        truck.setManufacturer(vehicle.getManufacturer());
        truck.setTowingCapacity(towingCapacity);
        truck.setPrice(vehicle.getPrice());
        truck.setCrashRating(vehicle.getCrashRating());
        truck.setNumOfPassengers(vehicle.getNumOfPassengers());
        truck.setHorsePower(vehicle.getHorsePower());
        truck.setType(type);

    }

    // A function to create an SUV
    public static void createSportUtilityVehicle(SportUtilityVehicle sportUtilityVehicle){
        String modelName;
        int numOfBenchSeats;
        double towingCapacity;

        Scanner input = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();

        // calling the get general info function to add the general info to the SUV
        getGeneralInfo(vehicle);

        // asking user to enter the information of the truck they want to add
        System.out.println("\nWhat is the vehicle’s model?  ");
        modelName = input.next();

        System.out.println("What is the vehicle’s towing capacity in pounds?");
        towingCapacity = input.nextDouble();

        System.out.println("What is the number of bench seats?(1-6)");
        numOfBenchSeats = input.nextInt();

        while (numOfBenchSeats < 1 || numOfBenchSeats > 6)
        {
            System.out.println("The number of bench seats has to be between 1 and 6");
            System.out.println("What is the number of bench seats?(1-6)");
            numOfBenchSeats = input.nextInt();
        }

        // assigning vehicle information to the class data fields
        sportUtilityVehicle.setModelName(modelName);
        sportUtilityVehicle.setCrashRating(vehicle.getCrashRating());
        sportUtilityVehicle.setNumOfBenchSeats(numOfBenchSeats);
        sportUtilityVehicle.setDoors(vehicle.getDoors());
        sportUtilityVehicle.setManufacturer(vehicle.getManufacturer());
        sportUtilityVehicle.setTowingCapacity(towingCapacity);
        sportUtilityVehicle.setPrice(vehicle.getPrice());
        sportUtilityVehicle.setCrashRating(vehicle.getCrashRating());
        sportUtilityVehicle.setNumOfPassengers(vehicle.getNumOfPassengers());
        sportUtilityVehicle.setHorsePower(vehicle.getHorsePower());

    }

    // A function to create a motorcycle
    public static void createMotorcycle(Motorcycle motorcycle){
        String modelName;
        boolean sidecar;
        boolean signalLights;
        boolean radio;

        int isSidecar;
        int isSignalLights;
        int isRadio;

        Vehicle vehicle = new Vehicle();

        Scanner input = new Scanner(System.in);

        // calling the get general info function to add the general info to the truck
        getGeneralInfo(vehicle);

        // asking user to enter the information of the truck they want to add
        System.out.println("\nWhat is the vehicle’s model?  ");
        modelName = input.next();

        System.out.println("Does the vehicle have a side car? (1.yes , 2.no)");
        isSidecar = input.nextInt();
        sidecar = isSidecar == 1;

        System.out.println("Does the vehicle have signal lights?  (1.yes , 2.no)");
        isSignalLights = input.nextInt();
        signalLights = isSignalLights == 1;

        System.out.println("Does the vehicle have radio?  (1.yes , 2.no)");
        isRadio = input.nextInt();
        radio = isRadio == 1;


        // assigning vehicle information to the class data fields
        motorcycle.setSignalLights(signalLights);
        motorcycle.setRadio(radio);
        motorcycle.setSideCar(sidecar);
        motorcycle.setModelName(modelName);
        motorcycle.setCrashRating(vehicle.getCrashRating());
        motorcycle.setDoors(vehicle.getDoors());
        motorcycle.setManufacturer(vehicle.getManufacturer());
        motorcycle.setPrice(vehicle.getPrice());
        motorcycle.setCrashRating(vehicle.getCrashRating());
        motorcycle.setNumOfPassengers(vehicle.getNumOfPassengers());
        motorcycle.setHorsePower(vehicle.getHorsePower());
    }

    // A function to create a car
    public static void createCar(Car car){
        Vehicle vehicle = new Vehicle();

        String modelName;
        boolean convertible;
        String engineType;

        int isconvertible;

        Scanner input = new Scanner(System.in);

        // calling the get general info function to add the general info to the truck
        getGeneralInfo(vehicle);

        // asking user to enter the information of the truck they want to add
        System.out.println("\nWhat is the vehicle’s model?  ");
        modelName = input.next();

        System.out.println("Is the car a convertible? (1.yes , 2.no)");
        isconvertible = input.nextInt();

        convertible = isconvertible == 1;

        System.out.println("What is the engine type?  ");
        engineType = input.next();

        // assigning vehicle information to the class data fields
        car.setConvertible(convertible);
        car.setEngineType(engineType);
        car.setModelName(modelName);
        car.setCrashRating(vehicle.getCrashRating());
        car.setDoors(vehicle.getDoors());
        car.setManufacturer(vehicle.getManufacturer());
        car.setPrice(vehicle.getPrice());
        car.setCrashRating(vehicle.getCrashRating());
        car.setNumOfPassengers(vehicle.getNumOfPassengers());
        car.setHorsePower(vehicle.getHorsePower());
    }

    // A function to get all general data for the vehicle
    public static void getGeneralInfo(Vehicle vehicle){
        // Variables
        int doors;
        int wheels;
        int horsepower;
        int numPassengers;
        double price;
        String manufacturer;
        int crashRating;

        Scanner input = new Scanner(System.in);

        // Asking the user to enter the data for the vehicle
        System.out.println("\nPlease enter the following information about the truck:");

        System.out.println("\nWho is the manufacturer?  ");
        manufacturer = input.next();

        System.out.println("\nWhat is the vehicle’s price?  ");
        price = input.nextDouble();

        System.out.println("\nHow many wheels?  ");
        wheels = input.nextInt();

        System.out.println("\nHow many doors?  ");
        doors = input.nextInt();

        System.out.println("\nHow many horsepower does the engine output?  ");
        horsepower = input.nextInt();

        System.out.println("\nHow many passengers it hold?  ");
        numPassengers = input.nextInt();

        System.out.println("\nWhat is its crash rating? ");
        crashRating = input.nextInt();

        // assigning vehicle information to the class data fields
        vehicle.setCrashRating(crashRating);
        vehicle.setDoors(doors);
        vehicle.setHorsePower(horsepower);
        vehicle.setManufacturer(manufacturer);
        vehicle.setPrice(price);
        vehicle.setNumOfPassengers(numPassengers);
        vehicle.setWheels(wheels);

    }

    // A function to display all the vehicles
    public static void viewList(){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.display());
        }
    }


    // A function to write all the data into a file called VehicleCreationList.txt
    public static void printList(){


        try{
            FileWriter writer = new FileWriter("VehicleCreationList.txt");

            for (Vehicle vehicle : vehicles) {
                writer.write(vehicle.display());
            }



                writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
