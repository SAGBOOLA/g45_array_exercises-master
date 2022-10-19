package se.lexicon;

public class Exercise02 {
  public static void main(String[] args) {
    ex2();
  }

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static int indexOf(int[] arrays, int x){
    if (arrays == null) return -1;
    int length = arrays.length;
    int i = 0;
    while (i<length){
      if (arrays[i] == x){
        return i;
      } else {
        i = i + 1;
      }
    }
    return -1;

  }
  public static void ex2(){
    int[] arrays = {3, 15, 5, 17, 73, 24};
    System.out.println("Index position of the element is: " + indexOf(arrays,17));
  }



}
