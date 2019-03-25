package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


public class Randomize {


    public static int getRandomInt(int max) {
        Random random = new Random();
        int min = 1;

        return random.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> getNonRepeatingRandom(int size, int max) throws InterruptedException {

        int min = 1;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < size) {
            int random = getRandomInt(max);

            if (!numbers.contains(random)) {
                numbers.add(random);

            }

        }

        return numbers;
    }



}
