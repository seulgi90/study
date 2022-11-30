import java.util.Scanner;

public class Level1_1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double a = sc.nextInt();

    double b = sc.nextInt();

    sc.close();

    System.out.println(a/b);
  }
}