import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.print("Enter your temperature in Celcius: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                tempC = in.nextDouble();
                tempF = tempC * 1.8 + 32;
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
                System.out.println("Your temperature " + tempC + " is " + tempF + " in Celcius");
            }
            else
            {
// Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You said your temperature was: " + trash);
                System.out.println("This temperature is not recognized, run the program again!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
// when done is true !done i.e. NOT TRUE is false
       // So, this block of code represents input for one variable. You will use this
       // block multiple times, once for every numeric variable that you need to read
    }
}