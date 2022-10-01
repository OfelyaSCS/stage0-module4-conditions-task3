package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month>0&&month<12){
            if(month>=3&&month<=5){
                System.out.println("Spring");
            } else if (month>=6&&month<=8) {
                System.out.println("Summer");
            } else if (month>=9&&month<=11) {
                System.out.println("Autumn");
            }else {System.out.println("Winter");}
        }else {
            System.out.println("wrong number!");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter month number ");
        int monthNumber=input.nextInt();

        Seasons season=new Seasons();
        season.tellTheSeasonByMonthNumber(monthNumber);
    }


}
