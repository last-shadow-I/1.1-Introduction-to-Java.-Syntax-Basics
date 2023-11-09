import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    int lowerBound = -1000;
    int upperBound = 1000;
    int number, n, count = 0, maxSeries = 0;
    double sign, numberSign = 0;

    upperBound = abs(upperBound)+abs(lowerBound)+1;
    Scanner in = new Scanner(System.in);

    while(!in.hasNextInt()){
      System.out.println("Введите N - количество сгенерированных чисел");
    }
    n = in.nextInt();

    for (int i = 0; i < n; i++){
      number = (int) (random()*upperBound) + lowerBound;

      sign = signum((double) number);

      if(sign == numberSign && sign != 0){
        count++;
        if(count > maxSeries){
          maxSeries = count;
        }
      } else {
        numberSign = sign;
        count = 1;
      }
      /* для проверки работы кода
      System.out.print(number + " ");
      System.out.print(sign + " ");
      System.out.println(count + " ");
       */
    }
    System.out.println("Максимальная серия: " + maxSeries);
  }
}