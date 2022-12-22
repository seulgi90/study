import java.util.Scanner;

public class Level1_5 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //    int [] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), 
    //        in.nextInt(), in.nextInt(), in.nextInt()};

    int max = 0;

    int index = 0;

    for (int arr = 0; arr < 9; arr++) {

      int value = in.nextInt();

      if (value > max) {
        max = value;
        index = arr + 1;
      }
    }
    System.out.println(max);
    System.out.println(index);

  }
}