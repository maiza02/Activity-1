package car;
//Maiza Falcon Rojas
//CST-239
//02/01/2024
//This is my own work.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private String model;
    private Engine engine;
    private List<Tire> tires;
    private int currentSpeed;

    /**
     * Constructor to initialize a car with the specified model.
     *
     * @param model The car model.
     */
    public Car(String model) {
        this.model = model;
        this.engine = new Engine();
        this.tires = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            tires.add(new Tire());
        }
        this.currentSpeed = 0; // Initial speed
    }

    /**
     * Starts the car by checking tire pressure and starting the engine.
     */
    public void start() {
        if (checkTirePressure()) {
            System.out.println("Car model choice of player is: " + model);
            engine.start();
            System.out.println(model + " started with " + tires.size() + " tires.");
            System.out.println("Do you want to check the tire pressure?: ");
        } else {
            System.out.println("Cannot start the " + model + ". Check tire pressure first.");
        }
    }

    /**
     * Runs the car at the specified speed if the engine is running.
     *
     * @param speed The speed to run the car at.
     */
    public void run(int speed) {
        if (engine.isRunning()) {
            currentSpeed = Math.max(0, Math.min(speed, 60)); // Cap speed between 0 and 60 mph
            System.out.println(engine.startMessage());
            System.out.println(model + " has started at speed " + currentSpeed + " mph.");
        } else {
            System.out.println("Start the " + model + "'s engine first.");
        }
    }

    /**
     * Allows the user to adjust the car's speed.
     */
    public void adjustSpeed() {
        Scanner scanner = new Scanner(System.in);
        int newSpeed;

        System.out.print("Enter the new speed: ");
        newSpeed = scanner.nextInt();

        if (newSpeed > 60) {
            System.out.println(engine.spunOutMessage());
        } else if (newSpeed < 1) {
            System.out.println(engine.notMovingMessage());
        } else {
            currentSpeed = newSpeed;
            System.out.println(engine.runningMessage() + " at " + currentSpeed + " mph!");
            
        }
    }
    

    /**
     * Stops the car by stopping the engine and setting the speed to 0.
     */
    public void stop() {
        engine.stop();
        System.out.println(model + " stopped.");
        currentSpeed = 0;
    }

    /**
     * Restarts the car by restarting the engine.
     */
    public void restart() {
        engine.restart();
        System.out.println(model + " restarted.");
    }

    /**
     * Prints the tire pressures of the car.
     */
    public void printTirePressure() {
        System.out.println("Tire pressures of " + model + ":");
        for (int i = 0; i < tires.size(); i++) {
            System.out.println("Tire " + (i + 1) + ": " + tires.get(i).getPsi() + " psi");
        }
    }

    /**
     * Checks if all tires have sufficient pressure.
     *
     * @return True if all tires are inflated, false otherwise.
     */
    private boolean checkTirePressure() {
        for (Tire tire : tires) {
            if (!tire.isInflated()) {
                System.out.println("Tire pressure is low. Inflate all tires of " + model + " before starting.");
                return false;
            }
        }
        return true;
        
    }
}