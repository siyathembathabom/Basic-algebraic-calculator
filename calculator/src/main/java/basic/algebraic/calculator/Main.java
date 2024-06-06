package basic.algebraic.calculator;
import java.util.Scanner;

public class Main {
    public static final Scanner userInput = new Scanner(System.in);

    // Welcome method.
    public static void welcome() {
        System.out.println("This is a basic algebraic calculator that explores the concepts of polynomials and factorization.");
    }

    public static boolean isNumber(String userInput) {

        // try/catch block to try change a string input by the user to an int type.
        // and catch a NumberFormatException if it cannot become an int.
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. ");
            return false;
        }
    }

    public static void main(String[] args) {
        welcome();
    }
}