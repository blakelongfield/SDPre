import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
    String guess = "YES";
    double x, y;

    System.out.println("Are you ready?!?" + "("+guess+")" );
    guess = keyboard.next();

    while (!"YES".equals(guess)) {
      System.out.println("You are ready");
      guess = keyboard.next();      
    }

		System.out.print("Give me a number, and I'll find it's square root. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();

		while ( x < 0 ) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of "+ x +" is "+ y);		
	}
}
