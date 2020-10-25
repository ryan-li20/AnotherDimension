import java.util.Arrays;
public class Tester{
  public static void main(String[] args){

    // ArrayOps sum
    int[] sum0 = {-4, 5, -7, 6, 7, 8, -33, 4, -69}; // mixed values
    int[] sum1 = {};                                // empty
    System.out.println();
    System.out.println("sum");
    System.out.println(ArrayOps.sum(sum0) == -83);
    System.out.println(ArrayOps.sum(sum1) == 0);
    System.out.println();

    // ArrayOps largest
    int[] largest0 = {0, -1, -4, -6, 1, 4, 2}; //mixed
    System.out.println("largest");
    System.out.println(ArrayOps.largest(largest0) == 4);
    System.out.println();

    // ArrayOps sumRows
    int[][] sumRows0 = {{4, 1, 6, 3, 7, 9}, {-4, 16, 13, 51, 19}, {0, 1, 2, 7, 18}}; //whatever
    int[][] sumRows1 = {{}, {}, {4, 1, 6, 3, 7, 9}};                                 //mixed empty
    System.out.println("sumRows");
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRows0)).equals("[30, 95, 28]"));
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRows1)).equals("[0, 0, 30]"));
    System.out.println();

    // ArrayOps largestInRows
    int[][] largestInRows0 = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41}, {-14, -200, -39, -1604}}; //whatever
    System.out.println("largestInRows");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(largestInRows0)).equals("[200, 96, -14]"));
    System.out.println();

    // ArrayOps sumAgain
    int[][] sumAgain0 = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41}, {-14, -200, -39, -1604}}; //whatever
    int[][] sumAgain1 = {{}, {-14, 96, 15, 41}, {}}; // empties
    System.out.println("sum2d");
    System.out.println(ArrayOps.sum(sumAgain0) == -1449);
    System.out.println(ArrayOps.sum(sumAgain1) == 138);
    System.out.println();

    // ArrayOps sumCols
    int[][] sumCols0 = {{}}; //empties
    int[][] sumCols1 = {{}, {}, {}}; //more empties
    int[][] sumCols2 = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41, 19}, {-14, -200, -39, -1604, 1}}; //full
    System.out.println("sumCols");
    System.out.println(Arrays.toString(ArrayOps.sumCols(sumCols0)).equals("[]"));
    System.out.println(Arrays.toString(ArrayOps.sumCols(sumCols1)).equals("[]"));
    System.out.println(Arrays.toString(ArrayOps.sumCols(sumCols2)).equals("[-9, 96, -11, -1546, 41]"));
    System.out.println();

    // ArrayOps isRowMagic
    int[][] isRowMagic0 = {{}}; //empties
    int[][] isRowMagic1 = {{}, {}, {}}; // empties
    int[][] isRowMagic2 = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41, 19}, {-14, -200, -39, -1604, -1}}; //false
    int[][] isRowMagic3 = {{47, 59, 10, -100}, {49, 1000, -37, -996}, {6, 3, 5, 2}}; //true
    int[][] isRowMagic4 = {{47, 59, 10, -100}, {49, 1000, -37, -996}, {-14, 96, 15, 41}}; //all but last
    int[][] isRowMagic5 = {{-14, 96, 15, 41}, {47, 59, 10, -100}, {49, 1000, -37, -996}}; //all but first
    int[][] isRowMagic6 = {{47, 59, 10, -100}, {49, 1000, -37, -996}, {}}; //empties
    int[][] isRowMagic7 = {{47, 59, 10, -100}}; //one lol
    int[][] isRowMagic8 = {{1}}; //alone
    System.out.println("isRowMagic");
    System.out.println(ArrayOps.isRowMagic(isRowMagic0));
    System.out.println(ArrayOps.isRowMagic(isRowMagic1));
    System.out.println(!ArrayOps.isRowMagic(isRowMagic2));
    System.out.println(ArrayOps.isRowMagic(isRowMagic3));
    System.out.println(!ArrayOps.isRowMagic(isRowMagic4));
    System.out.println(!ArrayOps.isRowMagic(isRowMagic5));
    System.out.println(!ArrayOps.isRowMagic(isRowMagic6));
    System.out.println(ArrayOps.isRowMagic(isRowMagic7));
    System.out.println(ArrayOps.isRowMagic(isRowMagic8));
    System.out.println();

    // ArrayOps isColMagic
    int[][] isColMagic0 = {{}}; //empties
    int[][] isColMagic1 = {{}, {}, {}};// empties
    int[][] isColMagic2 = {{19, -14, -14}, {200, 96, -200}, {13, 15, -39}, {17, 41, -1604}, {21, 19, -1}}; //false
    int[][] isColMagic3 = {{47, 49, 6}, {59, 1000, 3}, {10, -37, 5}, {-100, -996, 2}}; //true
    int[][] isColMagic4 = {{47, 49, 6}, {59, 1000, 3}, {10, -37, 5}, {-100, -996, 4}}; //all but last
    int[][] isColMagic5 = {{47, 49, 6}, {59, 1000, 3}, {10, -37, 5}, {-101, -996, 2}}; //all but first
    int[][] isColMagic6 = {{1}, {1}, {1}}; // onecol
    int[][] isColMagic7 = {{1}}; //alone
    System.out.println("isColMagic");
    System.out.println(ArrayOps.isColMagic(isColMagic0));
    System.out.println(ArrayOps.isColMagic(isColMagic1));
    System.out.println(!ArrayOps.isColMagic(isColMagic2));
    System.out.println(ArrayOps.isColMagic(isColMagic3));
    System.out.println(!ArrayOps.isColMagic(isColMagic4));
    System.out.println(!ArrayOps.isColMagic(isColMagic5));
    System.out.println(ArrayOps.isColMagic(isColMagic6));
    System.out.println(ArrayOps.isColMagic(isColMagic7));
    System.out.println();

    //ArrayOps isLocationMagic absolute bare minimum test
    int[][] isLocationMagic0 = {{2, 4, 2}, {2, 2, 2}}; //gclass tester lol
    int[][] isLocationMagic1 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
    System.out.println("isLocationMagic");
    System.out.println(!ArrayOps.isLocationMagic(isLocationMagic0, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(isLocationMagic0, 1, 1));
    System.out.println();
  }
}
