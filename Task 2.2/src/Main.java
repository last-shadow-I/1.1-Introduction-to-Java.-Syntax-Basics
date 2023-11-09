import java.util.Scanner;

public class Main {
  public static String returnEndingsDayHourMinute(int countDays, int countHours, int countMinutes){
    String returnStr = "";

    // 1 день, 2 дня, ..., 4 дня, 5 дней, ..., 20 дней, 21 день, 22 дня, 23 дня, 24 дня, 25 дней, ... 30 дней, 31 день
    if(countDays % 10 > 4 || countDays % 10 == 0 || (countDays > 10 && countDays < 14)){
      returnStr += countDays + " дней ";
    } else if(countDays % 10 > 1 && countDays % 10 <= 4){
      returnStr += countDays + " дня ";
    } else if(countDays % 10 == 1){
      returnStr += countDays + " день ";
    }

    // 1 час, 2 часа, ..., 4 часа, 5 часов, ..., 20 часов, 21 час, 22 часа, ..., 24 часа, 25 часов, ... 30 часов, 31 час
    if(countHours % 10 > 4 || countHours % 10 == 0 || (countHours > 10 && countHours < 14)){
      returnStr += countHours + " часов ";
    } else if(countHours % 10 > 1 && countHours % 10 <= 4){
      returnStr += countHours + " часа ";
    } else if(countHours % 10 == 1){
      returnStr += countHours + " час ";
    }

    // 1 минута, 2 минуты, ..., 4 минуты, 5 минут, ..., 20 минут, 21 минута,
    // 22 минуты, ..., 24 минуты, 25 минут, ... 30 минут, 31 минута
    if(countMinutes % 10 > 4 || countMinutes % 10 == 0 || (countMinutes > 10 && countMinutes < 14)){
      returnStr += countMinutes + " минут ";
    } else if(countMinutes % 10 > 1 && countMinutes % 10 <= 4){
      returnStr += countMinutes + " минуты ";
    } else if(countMinutes % 10 == 1){
      returnStr += countMinutes + " минута ";
    }

    return returnStr;
  }

  public static void main(String[] args) {

    int timeInMinutes, countDays, countHours, countMinutes;
    String str;
    Scanner in = new Scanner(System.in);

    if(args.length > 0 && !args[0].isEmpty()) {
      timeInMinutes = Integer.parseInt(args[0]);
      System.out.println(timeInMinutes);
    } else {
      while (!in.hasNextInt()){
        System.out.println(in.next() + " число не в правильном формате\n");
      }
      timeInMinutes = in.nextInt();
    }

    if (timeInMinutes > 0) {
      countDays = timeInMinutes/(60*24);
      countHours = timeInMinutes/60 % 24;
      countMinutes = timeInMinutes%60;

      System.out.println("Время в минутах: " + timeInMinutes);
      str = returnEndingsDayHourMinute(countDays, countHours, countMinutes);
      System.out.println(str);
    } else {
      System.out.println("Уже началось!");
    }

  }
}