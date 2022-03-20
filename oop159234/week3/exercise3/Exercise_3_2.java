package oop159234.week3.exercise3;

public class Exercise_3_2 {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        randomNumber *= 13;
        randomNumber++;

        int cardFace = (int)randomNumber;

        switch (cardFace) {
            case 1:
                System.out.println("Ace");
                break;
            
            case 11:
                System.out.println("Jack");
                break;
            
            case 12:
                System.out.println("Queen");
                break;

            case 13:
                System.out.println("King");
                break;
            default:
                System.out.println(cardFace);
                break;
        }
    }
}
