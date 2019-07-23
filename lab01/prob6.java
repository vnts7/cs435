import java.util.ArrayList;
import java.util.List;

public class prob6 {
    // Return true if there exists a subarray of array with given sum
    public static List<Integer> subset(int[] A, int sum) {
        int n = A.length;

        // T[i][j] stores true if subset with sum j can be attained
        // with using items up to first i items
        boolean[][] T = new boolean[n + 1][sum + 1];

        // if sum is zero
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
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
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }

        // return
        
        if (T[n][sum]) {
            List<Integer> l = new ArrayList<>();
            int i = n, j = sum;
            boolean movedLeft = false;
            while (i > 0 && j > 0) {
                if (T[i - 1][j]) {
                    i--;
                    if (movedLeft) {
                        movedLeft = false;
                        l.add(A[i]);
                    }
                    continue;
                }
                j--;
                movedLeft = true;
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
        // if (subsetSum(A, sum))
        // System.out.println("Yes");
        // else
        // System.out.println("No");
    }

}