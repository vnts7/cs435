import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class prob5 {
  public static void main(String[] agrs) {
    int[] a = new int[] { 1, 3, 9 };
    System.out.println(subset(a, a.length - 1, 5));
    // System.out.println(subset(new int[] { 1, 3, 9 }, 5));
    // System.out.println(subset(new int[] { 1, 3, 9, 4, 8, 5 }, 0));
  }

  static HashSet<Integer> subset(int[] a, int to, int k) {
    if (k == 0)
      return new HashSet<Integer>();
    if (to == 0) {
      if (a[to] == k)
        return new HashSet<Integer>() {
          {
            add(k);
          }
        };
      return null;
    }
    HashSet<Integer> t1 = subset(a, to - 1, k);
    if (t1 != null)
      return t1;
    HashSet<Integer> t2 = subset(a, to - 1, k - a[to]);
    if (t2 != null) {
      t2.add(a[to]);
      return t2;
    }
    return null;
  }
}