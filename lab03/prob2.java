import java.util.Arrays;

public class prob2 {
  public static void main(String[] agrs) {
    int[] a = new int[] { 0, 0, 0, 0 };
    System.out.print(Arrays.toString(sort(new int[] { 2, 2, 0, 1, 0, 2, 1, 1, 0 })));
  }

  static int[] sort(int[] a) {
    int c0 = 0, c1 = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0)
        c0++;
      else if (a[i] == 1)
        c1++;
    }
    c1 += c0;
    for (int i = 0; i < a.length; i++) {
      if (i >= c1)
        a[i] = 2;
      else if (i >= c0)
        a[i] = 1;
      else
        a[i] = 0;
    }
    return a;
  }
}