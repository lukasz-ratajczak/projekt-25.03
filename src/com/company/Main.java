package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

// CW 1*
//        Scanner input = new Scanner(System.in);
//        Strings string = new Strings();
//
//        String[] strings = new String[5];
//
//        for (int i = 0; i < strings.length; i++)
//        {
//            System.out.println("Please enter Name:");
//            strings [i] = input.nextLine();
//        }
//
//        String longestString = Strings.getLongestString(strings);
//        String shortestString = Strings.getShortestString(strings);
//
//
//        System.out.println("Longest name is "+ longestString);
//        System.out.println("Shortest name is "+ shortestString);
//        string.findDupicateInArray(strings);


// CW 2*

//        int randomNum = -1;
//        int count = 0;
//
//        System.out.println("Choose a number: ");
//
//        Scanner input = new Scanner(System.in);
//        Integer genNum = input.nextInt();
//
//        Random random = new Random();
//
//        System.out.println("You choose number "+genNum);
//
//        do {
//            randomNum = random.nextInt(genNum) +1;
//            System.out.println("Random number is "+randomNum+" and your number is "+genNum);
//            count++;
//
//        } while (randomNum != (genNum));
//
//        System.out.println("FINISH! Number of randomizations is "+ count);

// CW 3*


        ArrayList<Integer> list = Randomize.getNonRepeatingRandom(6,6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("" + list.get(i));
            Thread.sleep(1000);
        }

        Collections.sort(list);

        System.out.println(list);

//        TODO save to file

    }

}

