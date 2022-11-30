import java.util.Arrays;
import java.util.Scanner;

public class Level1_10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int arr[] = new int[a];

    for (int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    // sort를 사용해 배열을 정렬
    Arrays.sort(arr);

    System.out.println(arr[0] + " " + arr[a - 1]);
  }
}