/*
 * public class comment {
 * public static void main(String[] args) {
 * Variables!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!
 * byte a = 99;
 * short b = 9999;
 * int c = 999999999;
 * long d = 999999999999999999l;
 * float e =
 * 9.9999999999999999999999999999999999999999999999999999999999999999f;
 * double f =
 * 9.
 * 999999999999999999999999999999999999999999999999999999999999999999999999999999d;
 * char g = 'a';
 * boolean h = false;
 * 
 * Input Form the User!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("taking a float number");
 * float a = sc.nextFloat();
 * System.out.println(a);
 * System.out.print("Enter a 1 number: :");
 * int a = sc.nextInt();
 * System.out.print("Enter a 1 number: :");
 * int b = sc.nextInt();
 * int sum = a + b;
 * System.out.print("These sum of two nomber is: : " +sum);
 * 
 * char grade = 'B';
 * grade = (char)(grade+8);
 * System.out.println(grade);
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("enter: : ");
 * int check = sc.nextInt();
 * System.out.print("this number is "+(check>5));
 * 
 * float v = 5;
 * float u = 3;
 * float a = 2;
 * float s = 1;
 * float result = ((v * v) - (u * u)) / (2 * a * s);
 * System.out.println(result);
 * 
 * int a= (7*49/7)+(35/7);
 * System.out.println(a);
 * 
 * Strings!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!
 * String name ="abubakar";
 * 
 * System.out.println(name);
 * 
 * System.out.print(name);
 * 
 * int a = 4;
 * float b = 3.333f;
 * System.out.printf("the value of a is %d and the value of b is %f",a,b);
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your name : : ");
 * String name = sc.nextLine();
 * System.out.printf("you enter your name is : : %s",name);
 * 
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your name : : ");
 * String name = sc.nextLine();
 * System.out.printf("you entered the name is : : %s",name);
 * 
 * String name = "abubaKar";
 * System.out.println(name);
 * 
 * System.out.println(name.length());
 * 
 * System.out.println(name.toUpperCase());
 * 
 * System.out.println(name.toLowerCase());
 * 
 * System.out.println(name.substring(3, 7));
 * 
 * System.out.println(name.replace("a", ""));
 * 
 * System.out.println(name.startsWith("ab"));
 * 
 * System.out.println(name.endsWith("kar"));
 * 
 * System.out.println(name.charAt(5));
 * 
 * System.out.println(name.indexOf("K"));
 * 
 * System.out.println(name.lastIndexOf("a"));
 * 
 * System.out.println(name.lastIndexOf("a",4));
 * 
 * System.out.println(name.equals("abubaKar"));
 * 
 * System.out.println(name.equalsIgnoreCase("abubakar"));
 * 
 * String newString = " abubakar ";
 * System.out.println(newString.trim());
 * 
 * if else
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!\
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter Your age: : ");
 * int age = sc.nextInt();
 * if (age<=5) {
 * System.out.println("You are a baby");
 * }
 * else if(age<=9){
 * System.out.println("You are kid");
 * }
 * else if(age<=19){
 * System.out.println("You are teenager");
 * }
 * else if(age<=35){
 * System.out.println("You are adult");
 * }
 * else if(age<=60){
 * System.out.println("You are elder");
 * }
 * else if(age<=100){
 * System.out.println("You are older");
 * }
 * else {
 * System.out.println("invalid input");
 * }
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Enter the number : : ");
 * int number = scanner.nextInt();
 * 
 * if (number%2==0) {
 * System.out.println(number + " is even");
 * }
 * else{
 * System.out.println(number + " is odd");
 * }
 * boolean a = true;
 * boolean b = false;
 * System.out.print(a&&b);
 * 
 * Scanner sc =new Scanner(System.in);
 * System.out.print("Enter your number : : ");
 * int days = sc.nextInt();
 * 
 * Loops!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!1
 * 
 * int i = 1;
 * while (i <= 10) {
 * int j = 1;
 * while (j <= 10) {
 * System.out.println(i + " * " + j + " = " + i * j);
 * j++;
 * }
 * System.out.println();
 * i++;
 * }
 * 
 * int a = 1;
 * do {
 * System.out.println(a);
 * a++;
 * }
 * while (a<=50);
 * 
 * for (int i = 1; i < 20; i++) {
 * if (i%2!=0) {
 * System.out.println(i + " is odd");
 * }
 * else{
 * System.out.println(i + " is not odd");
 * }
 * }
 * 
 * for (int j = 10; j >= 1; j--) {
 * System.out.println(j);
 * }
 * 
 * for (int i = 1; i <6; i++) {
 * System.out.println(i);
 * System.out.println("Acha@");
 * if (i==2) {
 * System.out.println("Loop is end");
 * break;
 * }
 * }
 * 
 * Arrays!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * 
 * 1.method
 * 
 * int []marks;
 * marks = new int[5];
 * marks[0] = 91;
 * marks[1] = 92;
 * marks[2] = 93;
 * marks[3] = 94;
 * marks[4] = 95;
 * 
 * 2.method
 * 
 * int [] marks = {1,3,4,5};
 * System.out.println(marks);
 * 
 * int [] marks = {1,3,4,5};
 * 
 * for(int i = 3;i<marks.length;i--){
 * System.out.println(marks[i]);
 * }
 * 
 * for (int i : marks) {
 * System.out.println(i);
 * }
 * 
 * int[] marks;
 * int[][] flats;
 * flats = new int[2][3];
 * flats[0][0] = 101;
 * flats[0][1] = 102;
 * flats[0][2] = 103;
 * flats[1][0] = 201;
 * flats[1][1] = 202;
 * flats[1][2] = 203;
 * 
 * for (int i = 0; i < flats.length; i++) {
 * for (int j = 0; j < flats[i].length; j++) {
 * System.out.print(flats[i][j]);
 * System.out.print("  ");
 * }
 * System.out.println("");
 * }
 * static int logic(int x, int y) {
 * int z;
 * if (x > y) {
 * z = (x + y) * 2;
 * }
 * else {
 * z = (x * y);
 * }
 * return z;
 * }
 * 
 * public static void main(String[] args) {
 * int a = 2;
 * int b = 3;
 * int c;
 * c = logic(a,b);
 * int a1 = 8;
 * int b1 = 6;
 * int c1;
 * c1 = logic(a1, b1);
 * System.out.println(c);
 * System.out.println(c1);
 * }
 * 
 * static void foo() {
 * System.out.println("Good Morning Bro");
 * }
 * 
 * static void foo(int a) {
 * System.out.println("Good Morning " + a + " Bro");
 * }
 * 
 * static void foo(int a, int b) {
 * System.out.println("Good Morning " + a + " Bro " + b);
 * }
 * 
 * public static void main(String[] args) {
 * foo();
 * foo(200);
 * foo(300, 400);
 * }
 * 
 * static int sum(int... arr) {
 * int result = 1;
 * for (int a : arr) {
 * result *= a;
 * }
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println("welcome to vararegs Tutorial");
 * System.out.println("the sum of these number is: " + sum(1, 4));
 * System.out.println("the sum of these number is: " + sum(1, 4, 6));
 * System.out.println("the sum of these number is: " + sum(1, 4, 6, 8));
 * System.out.println("the sum of these number is: " + sum(1, 4, 6, 8, 4, 9));
 * }
 * public class Main {
 * static int factorial(int n) {
 * int product = 0;
 * for (int i = 0; i <=n ; i++) {
 * product +=i;
 * }
 * return product;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the sum,You want : : ");
 * int n = sc.nextInt();
 * System.out.println(n + " is " + factorial(n));
 * 
 * }
 * }
 * import java.util.*;
 * 
 * public class just {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter the year : : ");
 * int year = sc.nextInt();
 * 
 * System.out.print("Enter the month number : : ");
 * int month = sc.nextInt();
 * 
 * int days = 0;
 * String monthName = "";
 * 
 * switch (month) {
 * case 1:
 * days = 31;
 * monthName = "January";
 * break;
 * 
 * case 2:
 * monthName = "February";
 * if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
 * days = 29;
 * } else {
 * days = 28;
 * }
 * break;
 * 
 * case 3:
 * monthName = "March";
 * days = 31;
 * case 4:
 * monthName = "April";
 * days = 30;
 * case 5:
 * monthName = "May";
 * days = 31;
 * case 6:
 * monthName = "June";
 * days = 30;
 * case 7:
 * monthName = "July";
 * days = 31;
 * case 8:
 * monthName = "August";
 * days = 31;
 * case 9:
 * monthName = "September";
 * days = 30;
 * case 10:
 * monthName = "October";
 * days = 31;
 * case 11:
 * monthName = "November";
 * days = 30;
 * case 12:
 * monthName = "December";
 * days = 31;
 * default:
 * System.out.println("Invalid input");
 * return;
 * }
 * System.out.println(monthName + " has " + days + " days");
 * }
 * }
 * }
 * }
 */
