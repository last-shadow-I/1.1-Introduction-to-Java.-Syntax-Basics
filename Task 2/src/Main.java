import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // для удобства тестирования
    while (true) {
      if (in.hasNextInt() || in.hasNextLong() || in.hasNextShort()) {
        System.out.println(in.nextLong() + " - целое число");
      } else if (in.hasNextDouble() || in.hasNextFloat()) {
        // чтобы получить вещественное число нужно использовать запятую или запись с экспонентой: 1e-10
        System.out.println(in.nextDouble() + " - вещественное  число");
      } else if (in.hasNextBoolean()) {
        System.out.println(in.nextBoolean() + " - Логическое значение");
      } else if (in.hasNext() ) {
        System.out.println(in.next() + " - Текст");
      }
    }

  }

}