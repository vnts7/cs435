import java.util.Arrays;

public class prob4 {
  public static void main(String[] agrs) {
    // int[] a = new int[] { -10,-7, 0,1,2,5 };
    int[] a = new int[] { 0 };
    System.out.print(find(new int[] { 1, 2, 4, 9, 3, 2, 1, 4, 5 }));
  }

  static Integer find(int[] a) {
    int[] bucket = new int[3 * a.length];
    for (int i = 0; i < bucket.length; i++) {
      bucket[i] = 0;
    }//O(3n)
    for (int i = 0; i < a.length; i++) {
      bucket[a[i]]++;
    }//O(n)
    for (int i = 0; i < a.length; i++) {
      if (bucket[a[i]] == 1)
        return a[i];
    }//O(n)
    return null;
  }
}