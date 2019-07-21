package quiz;
import java.util.Scanner;

public class Test {
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    int score = 0;
    


    System.out.println("Are you ready for a quiz? (Y/N)");
    char answer = input.findInLine(".").charAt(0);
    if (answer == 'Y' || answer == 'y');
    {
        String a = "Mumbai";
        String b = "Delhi";
        String c = "Hyderabad";
        String d = "Bangalore";


        System.out.println("Alright! Lets get right to it!");
        System.out.println("What is the Capital of India?");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        char choice = input.findInLine(".").charAt(0);
            if (choice == 'B' || choice == 'b')
            {
                System.out.println("Good Job! 1 point for you!");
                score = score + 1;
            }
            else
            {
                System.out.println("Incorrect! the answer was actually " + b);
            }

        String e = "Yes";
        String f = "No";
        System.out.println("Alright, Next Question! Can you"
        + " store the value 'cat' in a variable of type int?");
        System.out.println("A: " + e);
        System.out.println("B: " + f);
        char secchoice = input.findInLine(".").charAt(0);
            if (secchoice == 'A' || secchoice == 'a')
            {
                System.out.println("Correct! Good Job!");
                score = score + 1;
            }
            else
            {
                System.out.println("Incorrect");
            }

        System.out.println("What is the result of 2+2X3-5?");
        int result = input.nextInt();
            if (result == 3)
            {
                System.out.println("Correct! Good Job!");
            }
            else
            {
                System.out.println("Incorrect");
            }

        System.out.println("Your total score was " + score + "out of 3");
        }
    }
}
