/*
 * import java.util.*;
 * 
 * public class practiceSet7 {
 * static void table(int n) {
 * for (int i = 1; i <= 11; i++) {
 * System.out.println(n + " X " + i + " = " + (n * i));
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter the table number: : ");
 * int n = sc.nextInt();
 * table(n);
 * }
 * public class practiceSet7 {
 * static void stars(int n) {
 * for (int i = 1; i <= n; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print("* ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter the number to get stars : : ");
 * int n = sc.nextInt();
 * stars(n);
 * }
 * 
 * public class practiceSet7 {
 * static void sum(int n) {
 * int sum = 0;
 * for (int i = 1; i <= n; i++) {
 * sum += i;
 * }
 * System.out.println(sum);
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter the number to sum of no of Natural numbers : : ");
 * int n = sc.nextInt();
 * sum(n);
 * }
 * 
 * }
 * public class practiceSet7 {
 * static void reverseStars(int n) {
 * for (int i = n; i >= 1; i--) {
 * for (int j = 1; j <=i; j++) {
 * System.out.print("* ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter the fibonacci number to sum: : ");
 * int n = sc.nextInt();
 * reverseStars(n);
 * }
 * }
 * public class practiceSet7 {
 * static int fib(int n) {
 * if (n == 1) {
 * return 0;
 * } else if (n == 2) {
 * return 1;
 * } else {
 * return fib(n-1) + fib(n-2);
 * }
 * }
 * 
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter the fibonacci number to sum: : ");
 * int n = sc.nextInt();
 * int result = fib(n);
 * System.out.println(result);
 * }
 * }
 * public class practiceSet7 {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the CentiGrade to Change into Fahrenheit: : ");
 * float centiGrade = sc.nextFloat();
 * float result = (centiGrade * (9/5.0f))+32;
 * System.out.println(result);
 * }
 * }
 */