import java.util.Arrays;

public class prob4 {
  public static void main(String[] agrs) {
    // int[] a = new int[] { -10,-7, 0,1,2,5 };
    int[] a = new int[] { 0 };
    System.out.print(find(a, 0, a.length - 1));
  }

  static int find(int[] a, int from, int to) {
    if (from > to)
      return -1;// not found
    int mid = (from + to) / 2;
    int v = a[mid];
    if (v == mid)
      return mid;
    if (mid < v)
      return find(a, from, mid - 1);
    return find(a, mid + 1, to);
  }
}