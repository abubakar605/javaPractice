/*
 * import java.util.Scanner;
 * 
 * public class practiceSet4 {
 * public static void main(String[] args) {
 * int a = 10;
 * if (a == 11) {
 * System.out.println("i am 11");
 * } else {
 * System.out.println("i am not 11");
 * }
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter your 1 subject marks : : ");
 * int marks1 = sc.nextInt();
 * 
 * System.out.print("Enter your 2 subject marks : : ");
 * int marks2 = sc.nextInt();
 * 
 * System.out.print("Enter your 3 subject marks : : ");
 * int marks3 = sc.nextInt();
 * 
 * float avg = (marks1 + marks2 + marks3) / (3.0f);
 * System.out.println(avg);
 * if (avg >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
 * System.out.println("You are cleared");
 * } else {
 * System.out.println("You are not cleared");
 * }
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your salary : : ");
 * long salary = sc.nextLong();
 * 
 * if (salary <= 249999) {
 * ;
 * System.out.println("Your salary is " + salary + ".You dont give a tax");
 * } else if (salary >= 250000 && salary <= 499999) {
 * long tax = salary - (salary * 5 / 100);
 * System.out.println("Your " + salary + " is after 5% tax is = " + tax);
 * } else if (salary >= 500000 && salary <= 999999) {
 * long tax = salary - (salary * 20 / 100);
 * System.out.println("Your " + salary + " is after 20% tax is = " + tax);
 * } else if (salary >= 1000000) {
 * long tax = salary - (salary * 30 / 100);
 * System.out.println("Your " + salary + " is after 30% tax is = " + tax);
 * } else {
 * System.out.println("invalid input");
 * }
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your number : : ");
 * int days = sc.nextInt();
 * 
 * switch (days) {
 * case 1 -> System.out.println("its monday");
 * case 2 -> System.out.println("its tuesday");
 * case 3 -> System.out.println("its wednesday");
 * case 4 -> System.out.println("its thursday");
 * case 5 -> System.out.println("its friday");
 * case 6 -> System.out.println("its satuarday");
 * case 7 -> System.out.println("its sunday");
 * }
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the year: : ");
 * int year = sc.nextInt();
 * 
 * if (year % 4 == 0) {
 * System.out.println("this " + year + " is leap year");
 * } else {
 * System.out.println("this " + year + " is not leap year");
 * 
 * }
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the website : : ");
 * String website = sc.nextLine();
 * 
 * if (website.endsWith(".com")) {
 * System.out.println("This website is commercial");
 * } else if (website.endsWith(".org")) {
 * System.out.println("This website is organization");
 * } else if (website.endsWith(".in")) {
 * System.out.println("This website is indian");
 * } else {
 * System.out.println("invalid input");
 * }
 * 
 * }
 * }
 */