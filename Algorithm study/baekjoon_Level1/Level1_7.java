import java.util.Scanner;

public class Level1_7 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int t = in.nextInt(); // 테스트 

    for(int i = 1; i < t; i++) {

      int r = in.nextInt(); // 문자열 반복횟수
      String s = in.next(); // 입력 받은 문자

      for(int j = 0; j < s.length(); j++) {

        for (int k = 0; k < r; k++) { 
          System.out.print(s.charAt(j));
        }
      }
      System.out.println();
    }

  }
}