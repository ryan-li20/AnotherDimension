import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] sum = {5, 6, 7, 8, -4};
    int[] largest = {0, -1, -4, -6, 1, 4, 2};
    int[][] sumRows = {{4, 1, 6, 3, 7, 9}, {-4, 16, 13, 51, 19}, {0, 1, 2, 7, 18}};
    int[][] largestInRows = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41}, {-14, -200, -39, -1604}};
    int[][] sumAgain = {{19, 200, 13, 17, 21}, {-14, 96, 15, 41}, {-14, -200, -39, -1604}};

    System.out.println(ArrayOps.largest(largest));
    System.out.println(ArrayOps.sum(sum));
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRows)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(largestInRows)));
    System.out.println(ArrayOps.sum(sumAgain));
    System.out.println(Arrays.toString(ArrayOps.sumCols(sumRows)));
    System.out.println(ArrayOps.isRowMagic(sumRows));
  }
}
