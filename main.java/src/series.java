import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        /*
         * Fibonacci Series !!!!!!!!!!!!!!!!!!11
         * 
         * System.out.print("Enter the no of term of fibonacci series :  : ");
         * int n = sc.nextInt();
         * int firstTerm = 0,secondTerm = 1;
         * for (int i = 1; i <= n; i++) {
         * System.out.print(firstTerm + " , ");
         * int nextTerm = firstTerm + secondTerm;
         * firstTerm = secondTerm;
         * secondTerm = nextTerm;
         * }
         * 
         * Even number series !!!!!!!!!!!!!!!
         * 
         * int n = sc.nextInt(),firstTerm = 0;
         * for (int i = 1; i <= n; i++) {
         * System.out.print(firstTerm + " , ");
         * firstTerm +=2;
         * }
         * 
         * odd number series !!!!!!!!!!!
         * 
         * int n = sc.nextInt(), firstTerm = 1;
         * for (int i = 1; i <= n; i++) {
         * System.out.print(firstTerm + " , ");
         * firstTerm += 2;
         * }
         * 
         * Even Odd checker !!!!!!!!!
         * 
         * System.out.print("Enter the no of term to check even and odd : : ");
         * int n = sc.nextInt();
         * if (n % 2 == 0) {
         * System.out.println(n + " is even");
         * }
         * else {
         * System.out.println(n + " is odd");
         * }
         */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<=3) {
            System.out.println("baby");
        }
        else if (age<=10) {
            System.out.println("kid");
        }
        else if (age<=19) {
            System.out.println("teenager");
        }
        else if (age<=40) {
            System.out.println("adult");
        }
        else if (age<=60) {
            System.out.println("elder");
        }
        else if (age<=160) {
            System.out.println("older");
        }
        sc.close();
    }
}
