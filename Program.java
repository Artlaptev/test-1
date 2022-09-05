import java.util.Scanner;

/**
 * Program
 */
public class Program {

  public static void main(String[] args) {

    System.out.println("Java Введите ваше имя: ");
    Scanner in = new Scanner(System.in);
    String name = in.next();

    String message;

    if (name.equals("Вероника")) {
      message = "Я так ждала вас, Вероника";
    } else {
      message = "Привет," + name;
    }

    System.out.println(message);
  }
}