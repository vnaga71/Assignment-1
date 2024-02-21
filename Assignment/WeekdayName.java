/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author venka
 */
import java.util.Scanner;

public class WeekdayName {

    public enum Weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            Weekday weekday = getWeekday(dayNumber);
            System.out.println("The name of the weekday is: " + weekday);
        }

        scanner.close();
    }

    private static Weekday getWeekday(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return Weekday.SUNDAY;
            case 2:
                return Weekday.MONDAY;
            case 3:
                return Weekday.TUESDAY;
            case 4:
                return Weekday.WEDNESDAY;
            case 5:
                return Weekday.THURSDAY;
            case 6:
                return Weekday.FRIDAY;
            case 7:
                return Weekday.SATURDAY;
            default:
                return null;
        }
    }
}
