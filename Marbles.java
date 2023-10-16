import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * The Marbles class provides methods for representing and manipulating marble counts in 
 * various interesting ways, such as converting counts to descriptive words, displaying
 * marbles with a basic animation, and a guessing game to guess the number of marbles.
 * 
 * @author Max Liss-'s-Gravemade
 */
public class Marbles {
	
	
    // ANSI Escape Codes for Color
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    private static ArrayList<Integer> marbleHistory = new ArrayList<>();

    /**
     * Converts a marble count into a descriptive string.
     * 
     * @param numberOfMarbles The number of marbles.
     * @return Descriptive string representing the number of marbles.
     */
    public static String getWordsForMarbles(int numberOfMarbles) {
        if (numberOfMarbles < 0) {
            return ANSI_RED + "owe marbles" + ANSI_RESET;
        } else if (numberOfMarbles > 7) {
            return ANSI_GREEN + "a lot of marbles" + ANSI_RESET;
        } else {
            switch (numberOfMarbles) {
                case 0:
                    return "no marbles";
                case 1:
                    return "a marble";
                case 2:
                    return "two marbles";
                case 3:
                    return "a few marbles";
                default:
                    return "some marbles";
            }
        }
    }
    /**
     * Displays an animation of marbles based on the given count.
     * 
     * @param numberOfMarbles The number of marbles to display.
     */
    public static void displayMarbleAnimation(int numberOfMarbles) {
        String marbleVisual = "(o)";
        for (int i = 0; i < numberOfMarbles; i++) {
            System.out.println(marbleVisual);
            try {
                Thread.sleep(300);  // Delay for animation
            } catch (InterruptedException e) {
                // Do nothing
            }
            marbleVisual += "(o)";
        }
    }
     
    
    /**
     * Contains test cases to verify the getWordsForMarbles method.
     */
    public static void testGetWordsForMarbles() {
        boolean error = false;

        {  //test the number of marbles is less than 0 returns "owe marbles"
            int numberOfMarbles = -1;
            String expectedValue = "owe marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }

        {  //test the number of marbles is 0 returns "no marbles"
            int numberOfMarbles = 0;
            String expectedValue = "no marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }

        {  //test the number of marbles is 1 returns "a marble"
            int numberOfMarbles = 1;
            String expectedValue = "a marble";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }
        
        { //test the number of marbles is 2 returns "two marbles"
        	int numberOfMarbles = 2;
        	String expectedValue = "two marbles";
        	String actualValue= getWordsForMarbles(numberOfMarbles);
        	if (!expectedValue.equals(actualValue)) {
        		error = true;
        		System.out.println("testWordsForMarbles input " + numberOfMarbles
        				 + ", expected '" + expectedValue
                         + "',  actual '" + actualValue + "'");
        	}
        }
        
        
        { //test the number of marbles is 3 returns "a few marbles"
        	int numberOfMarbles = 3;
        	String expectedValue = "a few marbles";
        	String actualValue= getWordsForMarbles(numberOfMarbles);
        	if (!expectedValue.equals(actualValue)) {
        		error = true;
        		System.out.println("testWordsForMarbles input " + numberOfMarbles
        				 + ", expected '" + expectedValue
                         + "',  actual '" + actualValue + "'");
        	}
        }
        
        {  //test the number of marbles is 4 returns "some marbles"
            int numberOfMarbles = 4;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }
        
        {  //test the number of marbles is 5 returns "some marbles"
            int numberOfMarbles = 5;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }
        
        {  //test the number of marbles is 6 returns "some marbles"
            int numberOfMarbles = 6;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }
                
                
        {  //test the number of marbles is 7 returns "some marbles"
            int numberOfMarbles = 7;
            String expectedValue = "some marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }
        
        {  //test the number of marbles is 8 returns "a lot of marbles"
            int numberOfMarbles = 8;
            String expectedValue = "a lot of marbles";
            String actualValue = getWordsForMarbles(numberOfMarbles);
            if (!expectedValue.equals(actualValue)){
                error = true;
                System.out.println("testWordsForMarbles input " + numberOfMarbles
                        + ", expected '" + expectedValue
                        + "',  actual '" + actualValue + "'");
            }
        }

        //ADD additional test cases to meet the requirements specified in the
        // getWordsForMarbles method header.

        if (error) {
            System.out.println("testGetWordsForMarbles failed");
        } else {
            System.out.println("testGetWordsForMarbles passed");
        }
    }
    
    /**
     * A game where users guess the number of marbles. Users are provided
     * hints on whether their guess is too high, too low, or correct.
     */
    public static void marbleGuessingGame() {
        Random rand = new Random();
        int secretMarbles = rand.nextInt(20) + 1; // random number between 1 to 20
        int attempts = 0;

        System.out.println("Guess how many marbles I have! (1-20)");

        while (true) {
            attempts++;
            System.out.print("Enter your guess: ");
            Scanner gameInput = new Scanner(System.in);
            int guess = gameInput.nextInt();
            
            if (guess == secretMarbles) {
                System.out.println(ANSI_GREEN + "Correct! It took you " + attempts + " attempts." + ANSI_RESET);
                displayMarbleAnimation(secretMarbles);
                return;
            } else if (guess < secretMarbles) {
                System.out.println(ANSI_RED + "Too low! Try again." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Too high! Try again." + ANSI_RESET);
            }
        }
    }
    
    /**
     * The main method that provides a menu for the user to either enter a marble count,
     * view their marble history, play a guessing game, or exit.
     * 
     * @param args Unused command-line arguments.
     */
    public static void main(String[] args) {
        testGetWordsForMarbles();
        Scanner input = new Scanner(System.in);

        boolean continueRunning = true;
        while (continueRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter marble count");
            System.out.println("2. View marble history");
            System.out.println("3. Play the guessing game");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number of marbles: ");
                    int numMarbles = input.nextInt();
                    marbleHistory.add(numMarbles);
                    System.out.println("There are " + getWordsForMarbles(numMarbles));
                    displayMarbleAnimation(numMarbles);
                    break;
                case 2:
                    System.out.println("Marble History: " + marbleHistory);
                    break;
                case 3:
                    marbleGuessingGame();
                    break;
                case 4:
                    continueRunning = false;
                    System.out.println("Thanks for playing with marbles!");
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid choice." + ANSI_RESET);
                    break;
            }
        }

        input.close();
    }
}
