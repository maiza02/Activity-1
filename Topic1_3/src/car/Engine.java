package car;
//Maiza Falcon Rojas
//CST-239
//02/01/2024
//This is my own work.

public class Engine {

    private boolean running;

    /**
     * Constructor to initialize the engine as not running.
     */
    public Engine() {
        this.running = false;
    }

    /**
     * Starts the engine.
     */
    public void start() {
        this.running = true;
    }

    /**
     * Stops the engine.
     */
    public void stop() {
        this.running = false;
    }

    /**
     * Restarts the engine if it is not already running.
     */
    public void restart() {
        if (!running) {
            this.running = true;
        } else {
            System.out.println("Car is already running. Stop before restarting.");
        }
    }

    /**
     * Checks if the engine is running.
     *
     * @return True if the engine is running, false otherwise.
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Returns a message indicating the engine is ready to go.
     *
     * @return The start message.
     */
    public String startMessage() {
        return "Engine is ready to go!!!";
    }

    /**
     * Returns a message indicating the car is running.
     *
     * @return The running message.
     */
    public String runningMessage() {
        return "Vroom!! Car going";
    }

    /**
     * Returns a message indicating the car spun out due to high speed.
     *
     * @return The spun out message.
     */
    public String spunOutMessage() {
        return "Too high of a speed! You spun out.";
    }

    /**
     * Returns a message indicating the car is not moving.
     *
     * @return The not moving message.
     */
    public String notMovingMessage() {
        return "Car is not moving.";
    }
}