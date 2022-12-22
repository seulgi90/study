import java.util.Scanner;

public class Level1_9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    for (int i = 0; i < a; i++) {

      int cnt = 0;
      int sum = 0;
      String str = sc.next();

      for(int j =0 ; j <str.length(); j++) {
        if(str.charAt(j) == 'O') {
          cnt++;
          sum +=cnt;
        } else {
          cnt = 0;
        }
      }
      System.out.println(sum);
    }

  }
}