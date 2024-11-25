import java.util.Scanner;

public class basicOOPQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number : : ");
        int month = sc.nextInt();

        System.out.print("Enter the year : : ");
        int year = sc.nextInt();

        String monthName = "";
        int days = 0;

        if (month == 1) {
            monthName = "january";
            days = 31;
        } else if (month == 2) {
            monthName = "Febuary";
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        }
        System.out.printf("this %s has %d days",monthName,days);
        sc.close();
    }
}
