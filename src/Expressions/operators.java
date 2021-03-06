package Expressions;

public class operators {
    public static void main(String[] args) {
        int number = 6;
        number++;
        number--;
        number += 7;
        number -= 3;
        number *= 4;
        number /= 10;
        System.out.println(number);
        int operatorsNumber = 10;
        int operandNumber = 12;
        System.out.println(operandNumber + operatorsNumber);
        System.out.println(operandNumber - operatorsNumber);
        System.out.println(operandNumber * operatorsNumber);
        System.out.println(operandNumber / operatorsNumber);
        boolean isLearning = false;
        if (isLearning) {
            System.out.println("Yes");
        }
        int variable = 8;
        if (variable==5) {
            System.out.println("variable is equal");
        }
        if (variable<=2) {
            System.out.println("yes, variable is less than 2");
        }
        int starVariable = 18;
        if (starVariable>=14) {
            System.out.println("variable is greater than 14");
        }
        if (starVariable<20) {
            System.out.println("variable is less than 20");
        }


    }
}