package oop159234.week3.exercise3;

public class Exercise_3_1 {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        randomNumber *= 10;
        randomNumber++;

        int testNumber = (int)randomNumber;

        if (testNumber % 2 == 0) {
            System.out.println("Number " + testNumber + " is Even");
        } else {
            System.out.println("Number " + testNumber + " is Odd");
        }
    }   
}
