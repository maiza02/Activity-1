package car;
//Maiza Falcon Rojas
//CST-239
//02/01/2024
//This is my own work.

public class Tire {
    private boolean inflated;
    private int psi;

    /**
     * Constructor to initialize a tire as inflated with an initial psi value.
     */
    public Tire() {
        this.inflated = true; // Initially inflated
        this.psi = 32; // Initial psi value
    }

    /**
     * Deflates the tire.
     */
    public void deflate() {
        this.inflated = false;
    }

    /**
     * Inflates the tire and resets the psi value.
     */
    public void inflate() {
        this.inflated = true;
        this.psi = 32; // Reset psi when inflating
    }

    public boolean isInflated() {
        return inflated;
    }

    public int getPsi() {
        return psi;
    }
}



