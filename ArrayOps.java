import java.util.Arrays;
public class ArrayOps{
  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int highest = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > highest){
        highest = arr[i];
      }
    }
    return highest;
  }

  public static int[] sumRows(int[][] arr){
    int[] summing = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      summing[i] += ArrayOps.sum(arr[i]);
    }
    return summing;
  }

  public static int[] largestInRows(int[][] arr){
    int[] largest = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      largest[i] = ArrayOps.largest(arr[i]);
    }
    return largest;
  }

  public static int sum(int[][] arr){
    int sum = 0;
    for (int i = 0; i<arr.length; i++){
      sum += ArrayOps.sum(arr[i]);
    }
    return sum;
  }

  public static int[] sumCols(int[][] arr){
    int[] sums = new int[arr[0].length];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        sums[j] += arr[i][j];
      }
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] arr){
    int sum = ArrayOps.sum(arr[0]);
    for(int i = 0; i < arr.length; i++){
      if(ArrayOps.sum(arr[i]) != sum){
        return false;
      }
    }
    return true;

  }

  public static boolean isColMagic(int[][] arr){
    int[] newSums = ArrayOps.sumCols(arr);
    int standard = newSums[0];
    for(int i = 0; i < newSums.length; i++){
      if(newSums[i] != standard){
        return false;
      }
    }
    return true;
  }
}
