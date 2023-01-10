package org.example;


public class Main {
    public static void main(String[] args) {
        Words word = new Words();
        System.out.println("Are you ready to play HANGMAN!!");
        System.out.println("The random word is "+word.generateWords());
    }
}