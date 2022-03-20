package oop159234.week3.tutorial3;

public class Tutorial_1_3 {
    public static void main(String[] args) {
        
        boolean[] days;
        int uniqueBirthdays;

        days = new boolean[365];
        uniqueBirthdays = 0;

        for ( int i = 1; i <= 365; i++ ) {
            double randomNumber = Math.random();
            randomNumber *= 365;
            int birthday = (int)randomNumber;

            if (days[birthday]) {
                continue;
            } else {
                days[birthday] = true;
                uniqueBirthdays++;
            }
        }

        System.out.printf("365 people have birthdays on %d unique days.", uniqueBirthdays);

    }
}
