package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class DaysInMonthPrinter {
    int year;
    public void amountOfDays(int month) {
        if (month > 0 && month < 12) {
            if ((month == 2) && ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0)))) {
                System.out.println("29");
            } else if (month == 2) {
                System.out.println("28");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            } else {
                System.out.println("31");
            }
        } else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month number ");
        int monthNumber=input.nextInt();

        DaysInMonthPrinter daysInMonthPrinter=new DaysInMonthPrinter();
        daysInMonthPrinter.amountOfDays(monthNumber);
    }
}
