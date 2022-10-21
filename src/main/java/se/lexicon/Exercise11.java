package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    ex11();
  }
  private static int[] array = new int[0];

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {
    boolean userContinue = true;
    while (userContinue) {
      int value = getValue();
      array = addNum(array, value);
      System.out.println(Arrays.toString(array));
      if (value == -1){
        userContinue = false;
      }
    }
    reverseArray(array);
  }

  public static int getValue(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number, then enter -1 to exit");
    int value = sc.nextInt();
    return value;
  }

  public static int [] addNum(int [] orgArray, int newNumber){
    int [] newArray = Arrays.copyOf(orgArray, orgArray.length+1);
    newArray[newArray.length-1] = newNumber;
    return newArray;
  }

  public static void reverseArray (int [] num){
    int [] newNum = new int [num.length];
    for (int i = 0; i<num.length; i++){
      newNum[i] = num[num.length-1-i];
    }
    System.out.println(Arrays.toString(newNum));

  }

}
