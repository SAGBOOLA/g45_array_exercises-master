package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    ex9();
  }

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size, so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {
    String [] coolNames = {"Erik", "Steven", "Joseph", "Henrik"};
    Scanner sc = new Scanner(System.in);
    System.out.println("Add a name");
    String getName = sc.nextLine();
    String [] allNames = addMoreNames(coolNames,getName);
    System.out.println(Arrays.toString(allNames));
  }

  public static String [] addMoreNames (String[] names, String name){
    String [] moreNames = Arrays.copyOf(names,names.length+1);
    moreNames[moreNames.length-1] = name;
    return moreNames;
  }

}
