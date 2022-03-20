package oop159234.week3.tutorial3;

public class Tutorial_1_2 {
    public static void main(String[] args) {
        
        int[] days;
        int count;

        days = new int[365];
        count = 0;

        while (true) {
            double randomNumber = Math.random();
            randomNumber *= 365;
            int birthday = (int)randomNumber;
            count++;

            //System.out.printf("Person %d has birthday on day %d%n", count, birthday);

            if (days[birthday] == 2) {
                break;
            }

            days[birthday]++;

        }

        System.out.println("Same birthday for 3 people found after " + count + " people.");

    }
}
