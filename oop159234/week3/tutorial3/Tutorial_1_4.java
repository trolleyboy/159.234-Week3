package oop159234.week3.tutorial3;

public 
class Tutorial_1_4 {
    public static void main(String[] args) {
        
        boolean[] days;
        int peopleCount;
        int birthdaysFound;

        days = new boolean[365];
        peopleCount = 0;
        birthdaysFound = 0;

        while(birthdaysFound < 365) {
            double randomNumber = Math.random();
            randomNumber *= 365;
            int birthday = (int)randomNumber;

            peopleCount++;

            if (!days[birthday]) {
                birthdaysFound++;
                days[birthday] = true;
            }
        }

        System.out.println("The number of people to fill 365 days of birthdays is: " + peopleCount);
    }
}
