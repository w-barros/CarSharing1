import java.util.Scanner;
import java.util.stream.IntStream;

class Main {

  /**
   * The method calculates the sum of odd numbers in the given range
   *
   * @param start of a range, start >= 0
   * @param end of a range (inclusive), end >= start
   *
   * @return sum of odd numbers
   */
  public static long sumOfOddNumbersInRange(long start, long end) {
    // write your code here
    long result = ((long) IntStream.rangeClosed((int) start, (int) end).filter(x -> (x % 2 != 0)).sum());
    return result;
  }

  // Don't change the code below
  public static void main(String[] args) {
    boolean test = "asda".eq
      Scanner scanner = new Scanner(System.in);

    String[] line = scanner.nextLine().trim().split(" ");

    long start = Integer.parseInt(line[0]);
    long end = Integer.parseInt(line[1]);

    System.out.println(sumOfOddNumbersInRange(start, end));
  }
}