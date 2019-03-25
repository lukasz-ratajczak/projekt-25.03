package com.company;

public class Strings {


    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static String getShortestString(String[] array) {
        int minLength = 1000;
        String shortestString = null;
        for (String s : array) {
            if (s.length() < minLength) {
                minLength = s.length();
                shortestString = s;
            }
        }
        return shortestString;
    }

    public void findDupicateInArray(String[] array) {


        for(int i=0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i].equals(array[j])) {

                    System.out.println("Array has name "+array[i]+" duplicated");

                }
            }

        }
    }



}
