package org.example;

//import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Commands {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }
}
