package game;
//Maiza Falcon Rojas
// CST-239
// 02/01/2024
//This is my own work.

import car.Car;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car model: ");
        String carModel = scanner.nextLine();

        Car myCar = new Car(carModel);
        myCar.start();

        
        String checkPressureChoice = scanner.nextLine();

        if (checkPressureChoice.equalsIgnoreCase("yes")) {
            myCar.printTirePressure();
            myCar.run(35);
        } else {
            myCar.run(35);
        }

        System.out.print("Do you want to change speed? ");
        myCar.adjustSpeed();

        System.out.print("Do you want to stop or restart?: ");
        String stopRestartChoice = scanner.next();

        if (stopRestartChoice.equalsIgnoreCase("stop")) {
            System.out.println("Program stopped.");
        } else if (stopRestartChoice.equalsIgnoreCase("restart")) {
            main(args); // Restart the program
        } else {
            System.out.println("Invalid choice. Program stopped.");
        }
        
    }
}