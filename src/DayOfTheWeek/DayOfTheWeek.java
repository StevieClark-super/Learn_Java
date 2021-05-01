package DayOfTheWeek;

public class DayOfTheWeek {
    public static void printDayOfTheWeek (int Day ) {
        switch (Day)
        {
            case 0:
                System.out.println("Day is sunday");
                break;

            case 1:
                System.out.println("Day is monday");
                break;

            case 2:
                System.out.println("Day is tuesday");
                break;

            case 3:
                System.out.println("Day is wednesday");
                break;

            case 4:
                System.out.println("Day is thursday");
                break;

            case 5:
                System.out.println("Day is friday");
                break;

            case 6:
                System.out.println("Day is saturday");

            default:
                System.out.println("Nota valid input");
                break;

        }

    }
}
