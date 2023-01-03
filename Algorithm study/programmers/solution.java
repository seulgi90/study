import java.util.Scanner;

public class solution {

  // 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
  // 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성

  public static int solution(String t, String p) {
    int answer = 0;

    for(int i = 0; i < t.length() - p.length() + 1; i++) {
      // 3141592 , 271 입력
      // 7 - 3 + 1 = 5 => i < 5 (0,1,2,3,4 회전)

      // substring 문자열 자르기 : public String substring(int startIndex, int endIndex)
      // startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴
      // index는 0부터 시작
      // [0] [1] [2] [3] [4] [5] [6]
      //  3   1   4   1   5   9   2
      // i = 0 ( 0, 0+3) => ( 0, 3) 0,1,2 인덱스 => 314
      // i = 1 ( 1, 1+3) => ( 1, 4) 1,2,3 인덱스 => 141
      String temp = t.substring(i, i + p.length());


      System.out.println("t.length:" + t.length());
      System.out.println("p.length:" + p.length());
      System.out.println("temp:" + temp);

      if(Long.parseLong(p) >= Long.parseLong(temp)) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.nextLine();
    String p = sc.nextLine();
    solution(t,p);
  }
}
