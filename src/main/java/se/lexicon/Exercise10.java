package se.lexicon;

public class Exercise10 {
  public static void main(String[] args) {
    ex10();
  }

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
    int[][] data = timesTable(10,10);
    for (int row = 0; row<data.length; row++){
      for (int column = 0; column<data[row].length; column++){
        System.out.printf(data[row][column]+"\t");
      }
      System.out.println();
    }
  }

  public static int [][]timesTable(int r, int c){
    int [][] multiply = new int[r][c];
    for (int row = 0; row<multiply.length; row++){
      for (int column = 0; column<multiply[row].length; column++){
        multiply[row][column] = (row+1)*(column+1);
      }
    }
    return multiply;
  }

}
