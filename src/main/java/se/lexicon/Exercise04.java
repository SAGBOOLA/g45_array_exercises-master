package se.lexicon;

import java.util.Arrays;

public class Exercise04 {
  public static void main(String[] args) {
    ex4();
  }

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int [] array1 = {1, 15, 20};
    int [] array2 = Arrays.copyOf(array1,3);
    System.out.println("This is array1:");
    for (int arrays : array1){
      System.out.print(arrays+"\t");
    }
    System.out.println("\n"+"This is array2:");
    for (int array : array2){
      System.out.print(array+"\t");
    }
  }

}
