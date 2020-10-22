import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] sum = {5, 6, 7, 8, -4}; //wants 22
    System.out.println(ArrayOps.sum(sum));
    int[] largest = {0, -1, -4, -6, 1, 4, 2}; //wants 4
    System.out.println(ArrayOps.largest(largest));
    int[][] sumRows = {{4, 1, 6, 3, 7, 9}, {-4, 16, 13, 51, 19}, {0, 1, 2, 7, 18}};// wants 30, 95, 28
    System.out.println(Arrays.toString(ArrayOps.sumRows(sumRows)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(sumRows)));
  }
}
