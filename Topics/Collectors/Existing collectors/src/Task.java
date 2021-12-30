import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectorProduct {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] values = scanner.nextLine().split(" ");

    List<Integer> numbers = new ArrayList<>();
    for (String val : values) {
      numbers.add(Integer.parseInt(val));
    }

    long val = numbers.stream().collect(Collectors.reducing(0, (integer, integer2) -> integer += (integer2 * integer2)



    System.out.println(val);
  }
}