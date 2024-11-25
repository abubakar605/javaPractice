/*
 *  import java.util.*;
 *  
 *  public class RockPaperScissors {
 *  public static void main(String[] args) {
 *  Scanner sc = new Scanner(System.in);
 *  System.out.println("1. Choose rock.");
 *  System.out.println("2. Choose paper.");
 *  System.out.println("3. Choose scissor.");
 *  System.out.print("Enter your move : : ");
 *  int human = sc.nextInt();
 *  switch (human) {
 *  case 1 -> System.out.println("You have choosen rock.");
 *  case 2 -> System.out.println("You have choosen paper.");
 *  case 3 -> System.out.println("You have choosen scissor.");
 *  default -> System.out.println("invalid input,Please Try Again!");
 *  }
 *  int min = 1;
 *  int max = 3;
 *  System.out.print("Computer have choosen : : ");
 *  int computer = (int) (Math.random() * (max - min) + 1 + min);
 *  System.out.println(computer);
 *  switch (computer) {
 *  case 1 -> System.out.println("Computer have choosen rock.");
 *  case 2 -> System.out.println("Computer have choosen paper.");
 *  case 3 -> System.out.println("Computer have choosen scissor.");
 *  }
 *  if (human == computer) {
 *  System.out.println("The match is a draw!");
 *  } else if (human == 1
 *  && computer == 2 || human == 2 && computer == 3 || human == 3 && computer ==
 *  1) {
 *  System.out.println("Computer won this game,Please Try Again.");
 *  } else if (human == 2
 *  && computer == 1 || human == 3 && computer == 2 || human == 1 && computer ==
 *  3) {
 *  System.out.println("Computer won this game,Please Try Again.");
 *  } else {
 *  System.out.println("Match cannot be played!");
 *  }
 *  }
 *  }
 */