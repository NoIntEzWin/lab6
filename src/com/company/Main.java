package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Ion");
        name.add("Marian");
        name.add("Adrian");
        name.add("Florin");
        name.remove(0);
        System.out.println(name);
    }
}

