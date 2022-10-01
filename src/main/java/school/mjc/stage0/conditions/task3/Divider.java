package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class Divider {
    public void isDividableBy5And11(int number) {
        if(number!=0){
            if(number%5==0&&number%11==0){
                System.out.println("Dividable");
            }else {
                System.out.println("Non-dividable");
            }
        }else{
            System.out.println("cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=input.nextInt();

        Divider divider=new Divider();
        divider.isDividableBy5And11(number);
    }
}
