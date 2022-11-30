import java.util.Scanner;

public class Level1_8 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);


    int [] arr = new int[8];

    for (int i = 0; i < 8; i++) {
      arr[i] = in.nextInt(); 

    }

    String str = "";
    for (int i=0; i < arr.length-1; i++) {

      if (arr[i] == arr[i+1]-1) {
        str = "ascending";

      } else if(arr[i] == arr[i+1]+1) {
        str = "descending";

      } else {
        str = "mixed";
        break;
      }
    }
    System.out.println(str);

  }
}