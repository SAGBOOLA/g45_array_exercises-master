package se.lexicon;

public class Exercise12 {
  public static void main(String[] args) {
    ex12();
  }

  /**
   * 12.Write a program which will print the diagonal elements of two-dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int x = 3;
    int [][] arr = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
    diagonal(arr,x);
  }

  public static void diagonal (int[][] arr, int x){
    System.out.println("The diagonal is: ");
    for (int i = 0; i<x; i++){
      System.out.print(arr[i][i]+" ");
    }
    System.out.println();
  }
}
