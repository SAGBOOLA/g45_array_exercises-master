package se.lexicon;

import java.util.Arrays;

public class Exercise08 {
  public static void main(String[] args) {
    ex8();
  }

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {
    int [] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    Arrays.sort(array);
    int length = array.length;
    int value = dupElement(array,length);
    for (int i = 0; i<value; i++){
      System.out.print(array[i]+"\t");
    }
  }

  public static int dupElement(int[] array, int y){
    if (y==0 || y==1){
      return y;
    }
    int[] tmpValue = new int[y];
    int z = 0;
    for (int i = 0; i<y-1; i++){
      if (array[i] != array[i+1]){
        tmpValue[z++] = array[i];
      }
    }
    tmpValue[z++] = array[y-1];
    if (z >= 0) System.arraycopy(tmpValue, 0, array, 0, z);
    return z;

  }

}
