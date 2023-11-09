import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    double costWithNds, costWithoutNds, Nds;

    Scanner in = new Scanner(System.in);

    while (true){
      if (in.hasNextDouble()) {
        costWithNds = in.nextDouble();
        costWithoutNds = (costWithNds * 100) / 120;
        Nds = (costWithNds * 20) / 120;

        // округляем до копеек
        costWithoutNds = Math.round(costWithoutNds * 100.0) / 100.0;
        Nds = Math.round(Nds * 100.0) / 100.0;

        System.out.println("Стоимость товара без НДС: " + costWithoutNds);
        System.out.println("НДС в чеке: " + Nds);
        System.out.println("НДС в налоговой декларации: " + Math.round(Nds));
        System.out.println("");
      } else {
        String str = in.next();
        System.out.println(str + " число не в правильном формате");
        System.out.println("");
      }
    }
  }
}