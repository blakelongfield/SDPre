import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a numer: ");
      userNum = scanner.nextInt();

    if ( userNum > 0 ) {
      System.out.println("The number is positive");
    }
    if ( userNum < 0) {
      System.out.println("The numer is negative");
    }
    if (userNum == 0) {
      System.out.println(userNum + " is equal to " + 0);
    }

    scanner.close();
  }
}
