package oop159234.week3.tutorial3;

public class Tutorial_3 {
    public static void main(String[] args) {
        
        String s1 = new String("abc");
        System.out.println("s1: " + s1);

        String s2 = new String("XYZ");
        System.out.println("s2: " + s2);

        StringBuilder myString = new StringBuilder(s1.toUpperCase());
        System.out.println("myString Part1: " + myString);

        myString.append(s2.toLowerCase());
        System.out.println("myString Part2: " + myString);
    }
}
