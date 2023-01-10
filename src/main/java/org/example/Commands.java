package org.example;
import java.util.Scanner;

public class Commands {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean PlayAgain() {
        // Continuously prompts the user until they enter a valid response
        while (true) {
            System.out.print("Do you want to play again? (Y/N) ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Y")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Enter Y or N.");
            }
        }
    }
}
