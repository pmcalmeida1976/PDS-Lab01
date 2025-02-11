package lab01;

import java.util.*;

public class WordList {
    private ArrayList<String> words;

    public WordList(ArrayList<String> words) {
        this.words = words;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public boolean isValidWordList() {
        return startsWithUppercase() && containsOnlyAlphabetic() && minWordLength();
    }

    private boolean startsWithUppercase() {
        for (String word : words) {
            if (word.isEmpty() || !Character.isUpperCase(word.charAt(0))) 
            return false;
        }
        return true;
    }

    private boolean containsOnlyAlphabetic() {
        for (String word : words) {
            if (!word.matches("[A-Za-z]+")) 
            return false;
        }
        return true;
    }

    private boolean minWordLength() {
        for (String word : words) {
            if (word.length() < 3) 
            return false;
        }
        return true;
    }


}

