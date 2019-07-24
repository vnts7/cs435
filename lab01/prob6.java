import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prob6 {
  // Return true if there exists a subarray of array with given sum
  public static List<Integer> subset(int[] A, int sum) {
    int n = A.length;

    // T[i][j] stores true if subset with sum j can be attained
    // with using items up to first i items
    int[][] T = new int[n + 1][sum + 1];

    // if sum is zero
    for (int i = 0; i <= n; i++) {
      T[i][0] = 1;
    }

    // do for ith item
    for (int i = 1; i <= n; i++) {
      // consider all sum from 1 to sum
      for (int j = 1; j <= sum; j++) {
        // don't include ith element if j-A[i-1] is negative
        if (A[i - 1] > j) {
          T[i][j] = T[i - 1][j];
        } else {
          // find subset with sum j by excluding or including
          // the ith item
          T[i][j] = T[i - 1][j] == 1 ? 1 : T[i - 1][j - A[i - 1]];
        }
      }
    }
    // System.out.println(Arrays.deepToString(T));
    for (int i = 0; i <= n; i++) {
      System.out.print((i > 0 ? A[i - 1] : "0") + ": ");
      System.out.println(Arrays.toString(T[i]));

    }
    // back track
    if (T[n][sum] == 1) {
      List<Integer> l = new ArrayList<>();
      int i = n, j = sum;
      while (i > 0 && j > 0) {
        if (T[i - 1][j] == 1) {
          i--; // move up
        } else {
          l.add(A[i - 1]);
          j -= A[i - 1]; // moveleft
        }

      }
      return l;
    }
    return null;
  }

  public static void main(String[] args) {
    // Input: set of items and a sum

    System.out.println(subset(new int[] { 1, 3, 9, 4, 8, 5 }, 21));
    System.out.println(subset(new int[] { 1, 3, 9 }, 5));
    System.out.println(subset(new int[] { 1, 3, 9, 4, 8, 5 }, 0));

  }

}