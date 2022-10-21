package se.lexicon;

import java.util.Arrays;

public class Exercise07 {
  public static void main(String[] args) {
    ex7();
  }

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    int[] numbers = {1, 2, 4, 7, 9, 12, 17, 23, 32, 14};
    System.out.println("The Array:" + "\n" + Arrays.toString(numbers) + "\t");
    System.out.println("The Odd Array:");
    for (int number : numbers) {
      if (number % 2 != 0){
        System.out.print(number+"\t");
      }
    }
  }

}
