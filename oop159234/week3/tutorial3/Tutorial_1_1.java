package oop159234.week3.tutorial3;

public class Tutorial_1_1 {
    public static void main(String[] args) {
        
        boolean[] days;
        int count;

        days = new boolean[365];
        count = 0;

        while (true) {
            double randomNumber = Math.random();
            randomNumber *= 365;
            int birthday = (int)randomNumber;
            count++;

            System.out.printf("Person %d has birthday on day %d%n", count, birthday);

            if (days[birthday]) {
                break;
            }

            days[birthday] = true;

        }

        System.out.println("Same birthday found after " + count + " people.");

    }
}
