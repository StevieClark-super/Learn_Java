package AlarmRinging;

public class Main {
    public static void main(String[] args) {
        System.out.println(AlarmRinging.shouldWakeUp(true,4));
        System.out.println(AlarmRinging.shouldWakeUp(false,5));
        System.out.println(AlarmRinging.shouldWakeUp(true,9));
        System.out.println(AlarmRinging.shouldWakeUp(true,8));

        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }

    }






