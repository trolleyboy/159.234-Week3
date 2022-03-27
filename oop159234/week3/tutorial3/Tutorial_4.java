package oop159234.week3.tutorial3;

import java.util.Date;

public class Tutorial_4 {
    public static void main(String[] args) {
        
        String dateString = new Date().toString();
        System.out.println("Part 1: " + dateString);

        String dateUpperString = new Date().toString().toUpperCase();
        System.out.println("Part 2: " + dateUpperString);

        System.out.println("Today's date is... " + dateUpperString);
    }
}
