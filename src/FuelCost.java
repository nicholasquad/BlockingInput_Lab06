import java.util.Scanner;

public class FuelCost {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gasGallons = 0;

        double fuelEfficiency = 0;

        double gasPrice = 0;

        String trash = ""; // For invalid inputs

        boolean done = false;

        // Input: Number of gallons of gas in the tank

        do {

            System.out.print("Enter the number of gallons of gas in your tank: ");

            if (in.hasNextDouble()) {

                gasGallons = in.nextDouble();

                in.nextLine(); // Clear the buffer

                done = true;

            } else {

                trash = in.nextLine(); // Consume invalid input

                System.out.println("You entered: " + trash);

                System.out.println("Please enter a valid number for gas gallons!");

            }

        } while (!done);

        // Reset flag for next input

        done = false;

        // Input: Fuel efficiency in miles per gallon

        do {

            System.out.print("Enter your fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {

                fuelEfficiency = in.nextDouble();

                in.nextLine(); // Clear the buffer

                done = true;

            } else {

                trash = in.nextLine(); // Consume invalid input

                System.out.println("You entered: " + trash);

                System.out.println("Please enter a valid number for fuel efficiency!");

            }

        } while (!done);

        // Reset flag for next input

        done = false;

        // Input: Price of gas per gallon

        do {

            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {

                gasPrice = in.nextDouble();

                in.nextLine(); // Clear the buffer

                done = true;

            } else {

                trash = in.nextLine(); // Consume invalid input

                System.out.println("You entered: " + trash);

                System.out.println("Please enter a valid number for gas price!");

            }

        } while (!done);

        // Calculate the cost to drive 100 miles

        double costToDrive100Miles = (100 / fuelEfficiency) * gasPrice;

        // Calculate how far the car can go with a full tank of gas

        double distanceWithFullTank = gasGallons * fuelEfficiency;

        // Output results

        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive100Miles);

        System.out.printf("With a full tank of gas, you can drive: %.2f miles%n", distanceWithFullTank);

        in.close(); // Close the scanner

    }

}

