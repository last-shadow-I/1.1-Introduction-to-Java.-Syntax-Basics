import java.util.Scanner;

public class Main {
  public static String returnEndingsDayHourMinute(int countDays, int countHours, int countMinutes){
    String returnStr = "";

    // 1 ����, 2 ���, ..., 4 ���, 5 ����, ..., 20 ����, 21 ����, 22 ���, 23 ���, 24 ���, 25 ����, ... 30 ����, 31 ����
    if(countDays % 10 > 4 || countDays % 10 == 0 || (countDays > 10 && countDays < 14)){
      returnStr += countDays + " ���� ";
    } else if(countDays % 10 > 1 && countDays % 10 <= 4){
      returnStr += countDays + " ��� ";
    } else if(countDays % 10 == 1){
      returnStr += countDays + " ���� ";
    }

    // 1 ���, 2 ����, ..., 4 ����, 5 �����, ..., 20 �����, 21 ���, 22 ����, ..., 24 ����, 25 �����, ... 30 �����, 31 ���
    if(countHours % 10 > 4 || countHours % 10 == 0 || (countHours > 10 && countHours < 14)){
      returnStr += countHours + " ����� ";
    } else if(countHours % 10 > 1 && countHours % 10 <= 4){
      returnStr += countHours + " ���� ";
    } else if(countHours % 10 == 1){
      returnStr += countHours + " ��� ";
    }

    // 1 ������, 2 ������, ..., 4 ������, 5 �����, ..., 20 �����, 21 ������,
    // 22 ������, ..., 24 ������, 25 �����, ... 30 �����, 31 ������
    if(countMinutes % 10 > 4 || countMinutes % 10 == 0 || (countMinutes > 10 && countMinutes < 14)){
      returnStr += countMinutes + " ����� ";
    } else if(countMinutes % 10 > 1 && countMinutes % 10 <= 4){
      returnStr += countMinutes + " ������ ";
    } else if(countMinutes % 10 == 1){
      returnStr += countMinutes + " ������ ";
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
        System.out.println(in.next() + " ����� �� � ���������� �������\n");
      }
      timeInMinutes = in.nextInt();
    }

    if (timeInMinutes > 0) {
      countDays = timeInMinutes/(60*24);
      countHours = timeInMinutes/60 % 24;
      countMinutes = timeInMinutes%60;

      System.out.println("����� � �������: " + timeInMinutes);
      str = returnEndingsDayHourMinute(countDays, countHours, countMinutes);
      System.out.println(str);
    } else {
      System.out.println("��� ��������!");
    }

  }
}