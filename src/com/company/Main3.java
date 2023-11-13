package com.company;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, String> Note = new HashMap<String, String>();
        Note.put("George", "10");
        Note.put("Laur", "7");
        Note.put("Rares", "9");
        Note.put("Lucas", "18");
        for (String i : Note.keySet()) {
            System.out.println(i);
        }
        System.out.println(Note);

    }
}

