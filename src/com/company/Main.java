package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printDayOfTheWeek (int day) {

        switch(day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Day");
        }

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(day);
        }


    }

}
