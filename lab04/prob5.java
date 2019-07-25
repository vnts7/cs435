import java.util.Arrays;

public class prob5 {
  public static void main(String[] agrs) {
    int[] a = new int[] { 6, 5, 4, 3, 2, 1 };
    reverse(a, a.length - 1);
    System.out.print(Arrays.toString(a));
  }

  static void reverse(int[] a, int to) {
    if (to == 1) {
      int temp = a[0];
      a[0] = a[1];
      a[1] = temp;
      return;
    }
    reverse(a, to - 1);
    // swap the last with the rest
    int t = a[to];
    for (int i = to; i > 0; i--) {
      a[i] = a[i - 1];
    }
    a[0] = t;
  }
}