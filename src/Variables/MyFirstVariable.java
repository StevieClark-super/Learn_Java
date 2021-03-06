package Variables;

public class MyFirstVariable {
    public static void main(String[] args) {
        int myFirstVaribable = 5;
        System.out.println(myFirstVaribable);
        int mySecondVaribable =10;
        System.out.println(mySecondVaribable);
        int myThirdvaribable = 5;
        System.out.println(myThirdvaribable);
        int myTotal=mySecondVaribable+myThirdvaribable;
        System.out.println(myTotal);
        int calculation=(mySecondVaribable+myThirdvaribable)*myTotal;
        System.out.println(calculation);
        int calcuation2=(mySecondVaribable+mySecondVaribable)*myFirstVaribable;
        System.out.println(calcuation2);
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Integer.MIN_VALUE =" + minIntValue);

        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer.MAX_VALUE =" + maxIntValue);

        long minLongValue = Long.MIN_VALUE;

        System.out.println("Long.MIN_VALUE =" +minLongValue);

        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Long.Max_Value ="+maxLongValue);

        long mylongvaribable = 100L;

        System.out.println(mylongvaribable);

        double someNumber = 3/2;

        System.out.println(someNumber);

        double someNumber2 = 3.0/2.0;

        System.out.println(someNumber2);

        int wrongType = (int) (3.0/2.0);

        System.out.println(wrongType);

        int celsius = 17;

        System.out.println(celsius);

        int fahrenheit = 81;

        System.out.println(fahrenheit);

        int conversion = (celsius + 32)/5*9;

        System.out.println((double) conversion + "C");

        int conversion2 = (fahrenheit/9*5)-32;

        System.out.println((double) conversion2 + "F");

        boolean isAgeAboveTen = true;

        String myName ="Stevie Clark";

        String Name = "my name is ";

        System.out.println(Name+myName);

        //String wontShow = "Nope";

        int myExpression = 2*3;

        System.out.println(myExpression);

        int Number = 2 + 5;

        System.out.println(Number);







    }
}
