package oop159234.week3.exercise3;

public class Exercise_3_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i;

        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if ( i < array1.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println("\n");
        i--;
        while ( i >= 0 ) {
            System.out.print(array1[i] + " ");
            i--;
        }

        i++;
        System.out.println("\n");
        do {
            if ( array1[i] % 2 == 0 ) {
                System.out.print(array1[i] + " ");
            }
            i++;
        } while (i < array1.length);

    }
}
