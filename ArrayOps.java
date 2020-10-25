import java.util.Arrays;
public class ArrayOps{

  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  // sum() takes an array of int, and returns a sum of the individual values in the array.

  public static int largest(int[] arr){
    int highest = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > highest){
        highest = arr[i];
      }
    }
    return highest;
  }
  // largest() takes a non-empty array of int, and returns the largest element of the array.

  public static int[] sumRows(int[][] arr){
    int[] summing = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      summing[i] += ArrayOps.sum(arr[i]);
    }
    return summing;
  }
  /* sumRows() takes a 2D array of int, and returns a 1D array of int with each element being
  the sum of the individual rows of the 2D array. */

  public static int[] largestInRows(int[][] arr){
    int[] largest = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      largest[i] = ArrayOps.largest(arr[i]);
    }
    return largest;
  }
  /* largestInRows() takes a nonempty 2D array of int, the inner arrays cannot be empty either,
   and returns a 1D array of int with each element being the largest element of the individual rows  of the 2D array. */

  public static int sum(int[][] arr){
    int sum = 0;
    for (int i = 0; i<arr.length; i++){
      sum += ArrayOps.sum(arr[i]);
    }
    return sum;
  }
  // sum() takes a 2D array of int, and returns the sum of all the individual values in all of the arrays.

  public static int[] sumCols(int[][] arr){
    int[] sums = new int[arr[0].length];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        sums[j] += arr[i][j];
      }
    }
    return sums;
  }
  /* sumCols takes a 2D array that must be rectangular (all rows have the same length) and returns a 1D array of int
  with each element being the sum of the individual columns of the 2D array. */

  public static boolean isRowMagic(int[][] arr){
    int sum = ArrayOps.sum(arr[0]);
    for(int i = 0; i < arr.length; i++){
      if(ArrayOps.sum(arr[i]) != sum){
        return false;
      }
    }
    return true;

  }
  // isRowMagic() takes a rectangular 2d array and returns true when each row has the same sum, and false otherwise.

  public static boolean isColMagic(int[][] arr){
    int[] newSums = ArrayOps.sumCols(arr);
    if(newSums.length < 1){
      return true;
    }
    int standard = newSums[0];
    for(int i = 0; i < newSums.length; i++){
      if(newSums[i] != standard){
        return false;
      }
    }
    return true;
  }
  // isColMagic() takes a rectangular 2d array and  returns true when each column has the same sum, and false otherwise.

  public static boolean isLocationMagic(int[][] arr, int row, int col){
    return ArrayOps.sum(arr[row]) == ArrayOps.sumCols(arr)[col];
  }
  // isLocationMagic() takes a rectangular 2d array and returns true when the row and column specified have the same sum.
}
