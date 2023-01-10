package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Commands commands = new Commands();
    private Output output = new Output();
    public static int lives = 6;


    public void startGame() {
        List<String> Guesses = new ArrayList<>();
        String word = Words.generateWords();
        String replaceWord = word.replaceAll("[A-Z]", "_");



        while (lives != 0) {
            //getting input from user and changing it to uppercase
            System.out.println(replaceWord);
            System.out.println("Guess a letter!");
            String userInput = commands.getInput();
            userInput = userInput.toUpperCase();

            //adding user guesses into Guesses array list
            Guesses.add(userInput);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (userInput.equals(String.valueOf(word.charAt(i)))) {
                    replaceWord = replaceWord.substring(0, i) + word.charAt(i) + replaceWord.substring(i + 1);
                    correctGuess = true;
                    //checking if user input is same as word and replacing the _ with letter
                }
            }
            if (correctGuess) {
                output.correctGuess();
                Image.hangmanImage();
                //output for correct guesses
            } else {
                //lives decremenet and output for wrong guess
                output.wrongGuess();
                lives--;
                Image.hangmanImage();
                System.out.println("You have only "+lives+" left");
            }

            //condition when word is guessed
            if (replaceWord.equals(word)) {
             //   System.out.println("The word was: " + word);
                output.Win();
                if(commands.PlayAgain()){
                    lives = 6;
                    startGame();
                }
            }
        }
        //condition when word is not guessed
        if (lives == 0) {
            System.out.println("The word was: " + word);
            output.Over();
            if(commands.PlayAgain()){
                lives = 6;
                startGame();
            }
        }
    }
}
