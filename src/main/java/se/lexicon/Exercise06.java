package se.lexicon;

public class Exercise06 {
  public static void main(String[] args) {
    ex6();
  }

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    int[] numbers = {43, 5, 23, 17, 2, 14};
    float sum = 0;
    float average = 0;
    for (int number : numbers) {
      sum += number;
      average = sum / 6;
    }
    System.out.printf("%.1f", average);
  }

}
