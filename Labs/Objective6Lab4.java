public class Objective6Lab4 {
  public static void main(String[] args) {
    int counter, sum;
    counter = 0;
    sum = 0;

    while ( counter <= 20 ) {
      sum += counter;
      counter = counter + 1;
    }
    System.out.println(sum);
  }
}
