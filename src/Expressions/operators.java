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
        if (variable == 5) {
            System.out.println("variable is equal");
        }
        if (variable <= 2) {
            System.out.println("yes, variable is less than 2");
        }
        int starVariable = 18;
        if (starVariable >= 14) {
            System.out.println("variable is greater than 14");
        }
        if (starVariable < 20) {
            System.out.println("variable is less than 20");
        }
        int someNumber = 9;
        int otherNumber = 5;
        if (someNumber == otherNumber) {
            System.out.println("They are equal");
        }
        if (someNumber != otherNumber) {
            System.out.println("These numbers are not equal");
        }
        boolean waterOn = true;
        if (!waterOn) {
            System.out.println("Water not flowing");
        }

        int aNumber = 5;
        int anotherNumber = 20;
        if (aNumber < anotherNumber && aNumber > 2) {
            System.out.println("The number is between 2 and 20");
        }

        int testNumber = 31;
        if (testNumber < 3 && testNumber > 40) {
            System.out.println("The number is between 3 and 40");
        }
        if (!(testNumber < 1) && !(testNumber > 50)) {
            System.out.println("The number is not between 1 and 50");
        }
        if (testNumber < 33 && testNumber > 45) {
            System.out.println("The number is between 33 and 45");
        }
        if (testNumber != 33) {
            testNumber = 33;
            System.out.println(testNumber);
        }

        int aNumber2 = 6;
        int someOtherNumber = 13;

        if (aNumber2 < 5 || someOtherNumber > 5) {
            System.out.println("My condition has been satisfied");
        }

        int value1 = 20;
        int value2 = 35;
        if (value1 < 20 || value2 > 20) {
            System.out.println(true);
        }
        if (value1 + value2 > 30) {
            System.out.println("value1 and value2 are greater than 30");
        }
        if (value1 != value2) {
            System.out.println("value1 and value2 are not equal");
        }

        boolean isDriving = false;
        boolean isMoving = isDriving ? true : false;
        if (isMoving) {
            System.out.println("isMoving is true");

        }

        boolean isLightOn = false;

        if(isLightOn){
            System.out.println("Light is on");
            isLightOn = false;
            System.out.println("Light is turned off");
        } else{
            System.out.println("Light is off");
            isLightOn = true;
            System.out.println("Light is turned on");
        }

        int age = 18;

        if(age < 18){
            System.out.println("I cannot vote");
        } else if(age >= 18 && age < 21){
            System.out.println("I can vote but I cannot drink");
        }else {
            System.out.println("I can go to the bar and the club");
        }

        int examGrade = 87 ;

        if (examGrade <= 100 && examGrade >= 97){
            System.out.println("A+");
        }
        else if (examGrade < 97 && examGrade >= 94){
            System.out.println("A");
        }
        else if (examGrade < 94 && examGrade >= 90){
            System.out.println("A-");
        }
        else if (examGrade < 90 && examGrade >= 85){
            System.out.println("B");
        }
        else if (examGrade < 85 && examGrade >= 80){
            System.out.println("B-");
        }
        else if (examGrade < 80 && examGrade >= 70){
            System.out.println("C");
        }
        else if (examGrade< 70){
            System.out.println("F");
        }
        else {
            System.out.println("Grade not available");
        }





        }
}