package se.lexicon;

public class Exercise05 {
    public static void main(String[] args) {
        ex5();
    }

    /**
     * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
     * Expected output:
     * France Paris
     * Sweden Stockholm
     */
    public static void ex5() {
        String[][] countries = {{"France", "Paris", "Norway"}, {"Sweden", "Stockholm", "Uppsala"}};
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++){
                System.out.print(countries[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
