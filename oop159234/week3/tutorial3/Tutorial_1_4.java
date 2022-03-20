package oop159234.week3.tutorial3;

public 
class Tutorial_1_4 {
    public static void main(String[] args) {
        
        boolean[] days;
        int peopleCount;
        boolean complete;

        days = new boolean[365];
        peopleCount = 0;
        complete = false;

        while(true) {
            double randomNumber = Math.random();
            randomNumber *= 365;
            int birthday = (int)randomNumber;

            days[birthday] = true;
            peopleCount++;

            for (int i = 0; i < days.length; i++) {
                if (!days[i]) {
                    //System.out.println("Day " + (i + 1) + " is still false.");
                    complete = false;
                    break;
                } else {
                    complete = true;
                }
            }

            if (complete) {
                break;
            }
        }

        System.out.println("The number of people to fill 365 days of birthdays is: " + peopleCount);
    }
}
