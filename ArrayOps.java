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
}
