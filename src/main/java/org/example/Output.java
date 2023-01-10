package org.example;

public class Output {

    public void correctGuess() {
        System.out.println("Correct Letter");
    }

    public void wrongGuess() {
        System.out.println("Incorrect letter! lost a life !!");
    }

    public void Over() {
        System.out.println("You didn't guess the word correctly and have run out of lives.");
    }

    public void Win() {
        System.out.println("Congratulations! You have guessed it right.");
    }

}
