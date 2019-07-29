import java.util.Arrays;

public class prob2 {

  static int[] arrange(int[] a) {
    int min = a[0];
    int max = min;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min)
        min = a[i];
      if (a[i] > max)
        max = a[i];
    }
    if (min < 0) {
      int amin = Math.abs(min);
      for (int i = 0; i < a.length; i++) {
        a[i] += amin;
      }
      max += amin;
    }
    int[] bucket = new int[max + 1];
    for (int i = 0; i < bucket.length; i++) {
      bucket[i] = 0;
    } // O(m)
    for (int i = 0; i < a.length; i++) {
      bucket[a[i]]++;
    } // O(n)
    System.out.println(Arrays.toString(bucket));
    int l = 0, r = bucket.length - 1;
    int[] R = new int[a.length];
    int k = 0;
    while (l < r) {
      System.out.println("l:" + l + ", r:" + r);
      while (bucket[l] == 0 && l < r)
        l++;
      if (bucket[l] > 0) {
        bucket[l]--;
        R[k++] = l;
      }
      while (bucket[r] == 0 && l < r)
        r--;
      if (bucket[r] > 0) {
        bucket[r]--;
        R[k++] = r;
      }
    } // O(m+n)
    if (min < 0) {
      int amin = Math.abs(min);
      for (int i = 0; i < a.length; i++) {
        R[i] -= amin;
      } // O(n)
    }
    return R;
  }

  public static void main(String[] agrs) {
    // int[] a = new int[] { -10,-7, 0,1,2,5 };
    int[] a = new int[] { 0 };
    System.out.print(Arrays.toString(arrange(new int[] { 1, 2, 17, -4, -6, 8 })));
    // System.out.print(arrange(new int[] { 1, 2, 4, 9, 3, 2, 1, 4, 5 }));
  }
}