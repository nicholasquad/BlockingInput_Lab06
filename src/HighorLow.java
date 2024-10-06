import java.util.Scanner;

public class HighorLow{
    public static void main(String[] args);




    public
    Scanner in = new Scanner(System.in);
    int randomNumber = 0;
    String trash = ""; // use for bad input which will read as a String
    boolean done = false;
do
    {
        System.out.print("Guess a number : ");
        if(in.hasNextDouble()) // OK safe to read in a double
        {
            randomNumber = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
            done = true; // we got a valid number so we can end the loop
        }
        else
        {
// Not a double so use nextLine() instead to read a String
            trash = in.nextLine();
            System.out.println("Your guess was " :  + trash);
            System.out.println("This is invalid, run the program again! ");
        }
    }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
// when done is true !done i.e. NOT TRUE is false
}
