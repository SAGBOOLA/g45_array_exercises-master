package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
  private static int[] array = new int[0];

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size, so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int num = sc.nextInt();
    int[] newArray = Arrays.copyOf(array , array.length + 1);
    newArray[newArray.length - 1] = num;

    array = newArray;
    System.out.println(Arrays.toString(array));

  }

}
