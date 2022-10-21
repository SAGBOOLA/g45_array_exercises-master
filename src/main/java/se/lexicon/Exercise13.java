package se.lexicon;

import java.util.Arrays;

public class Exercise13 {
  public static void main(String[] args) {
    ex13();
  }

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    int [] array = {2, 3, 7, 8, 17, 12};
    int [] array2 = new int [array.length];
    int j = array.length - 1;
    int k = 0;
    for (int i = 0; i< array.length; i++){
      if (array[i] % 2 == 0){
        array2[j--] = array[i];
      } else {
        array2[k++] = array[i];
      }
    }
    System.out.println(Arrays.toString(array2));
  }

}
