package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private static final List<String> words=new ArrayList<>();
    private static final Random RANDOM = new Random();
    static{
        words.add("Charlie");
        words.add("Ollie");
        words.add("Nology");
        words.add("Huma");
        words.add("Theo");
        words.add("Walter");
        words.add("Risper");
        words.add("Adam");
        words.add("Constantine");
        words.add("Airidas");
        words.add("Mehdi");
        words.add("Jay");
    }
    public static String generateWords(){
        //takes random input stores in randomWord variable.
        String randomWord =words.get(RANDOM.nextInt(words.size()));
        return randomWord.toUpperCase();

    }
}
