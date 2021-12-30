import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

//class CalculateAverageSalary {
//
//  private static double calcAverageSalary(Collection<Integer> salaries) {
//    double ints = salaries.stream().mapToInt(i -> i).mapToDouble(i -> i).average().orElse(0);
//    // write your code here
//
//    return 0.0;
//  }
//
//  /* Please do not modify the code below */
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    List<Integer> salaries = scanner.tokens()
//            .map(Integer::parseInt)
//            .collect(Collectors.toList());
//
//    System.out.println(calcAverageSalary(salaries));
//  }
//}

class StreamOfPrimitives {

  public static LongStream getLongStream(int n) {
    LongStream output = LongStream.rangeClosed(-n,n).filter(x-> x != 0);
    // write your code here
    return output;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    String result = getLongStream(n).mapToObj(e -> e)
            .map(Object::toString)
            .collect(Collectors.joining(" "));

    System.out.println(result);
  }
}