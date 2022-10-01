package school.mjc.stage0.conditions.task3;

import java.util.Scanner;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary>0){
            if(salary<=10000){
                System.out.println(salary*0.85);
            } else if (salary>10000&&salary<=20000) {
                System.out.println(salary*0.82);
            }else{
                System.out.println(salary*0.80);
            }
        }else {
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount of salary ");
        int amountOfSalary=input.nextInt();

        SalaryCalculator salaryCalculator=new SalaryCalculator();
        salaryCalculator.calculateSalary(amountOfSalary);
    }

}
