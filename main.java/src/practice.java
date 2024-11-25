import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        System.out.print("Enter the no of days,You want to get temperature: : ");
        int terms = sc.nextInt();;
        for (int i = 1; i <= terms; i++) {
            System.out.printf("Enter the %d day of temperature : : ",i);
            double temperature = sc.nextDouble(); 
            sum += temperature;
        }
        avg = sum/terms;
        System.out.printf("The sum of %d no of days is: : %d\n",terms,sum);
        System.out.printf("The average temperature of %d days is : : %.2f°C",terms,avg);
        sc.close();
    }
}
