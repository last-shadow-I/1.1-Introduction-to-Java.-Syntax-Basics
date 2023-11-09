import java.util.Scanner;

public class Main {

  // проверяем можно ли строку превратить в число
  public static boolean isNumeric(String s) {
    try {
      Double.parseDouble(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    int count = 0;
    double minNumb = 1e10;
    double maxNumb = -1e10;
    double sumNumbs = 0;
    double mean = 0, numb;
    boolean countIsOver = false;
    String str;
    Scanner in = new Scanner(System.in);

    while (!countIsOver) {
      // считываем строку, удаляем пробелы в начале и конце строки
      str = in.nextLine().trim();

      // если строка не пустая, то разбиваем пробуем разбить её и проходимся по подстрокам
      if(!str.isEmpty()) {
        for (String subStr:str.split("[\s]+")) {
          // проверяем подстроки на наличие числа
          if(isNumeric(subStr)){
            numb = Double.parseDouble(subStr);
            System.out.println(numb);

            count++;
            if(numb < minNumb){
              minNumb = numb;
            }
            if(numb > maxNumb){
              maxNumb = numb;
            }
            sumNumbs += numb;
          } else { // если в подстроке не число, то выходим из циклов
            mean = sumNumbs/count;
            countIsOver = true;
            break;
          }
        }
      }
        else { // если строка пустая, то выходим из цикла
        mean = sumNumbs/count;
        break;
      }

    }

    System.out.println("Количество чисел: " + count);
    System.out.println("Минимальное число: " + minNumb);
    System.out.println("Максимальное число: " + maxNumb);
    System.out.println("Сумма: " + sumNumbs);
    System.out.println("Среднее арифметическое: " + mean);

  }
}