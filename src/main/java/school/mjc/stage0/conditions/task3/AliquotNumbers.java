package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(first%second==0){
            System.out.println("Aliquot");
        }else{
            System.out.println("Not aliquot");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first and second numbers ");
        int numberFirst=input.nextInt();
        int numberSecond=input.nextInt();

        AliquotNumbers aliquotNumbers=new AliquotNumbers();
        aliquotNumbers.isFirstAliquot(numberFirst,numberSecond);
    }
}
