
public class Main {
  public static void main(String[] args) {
    double[] numbers = {30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675};

    System.out.println("######################################");
    System.out.println("| round |   ceil  |  floor  |  rint");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("-------------------------------------");
      System.out.print("| ");
      System.out.printf("%8s", Math.round(numbers[i])  + " | ");
      System.out.printf("%10s", Math.ceil(numbers[i]) + " | ");
      System.out.printf("%10s", Math.floor(numbers[i])+ " | ");
      System.out.printf("%8s", Math.rint(numbers[i]));
      System.out.print("\n");
    }
    System.out.println("######################################");
  }
}