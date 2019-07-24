import java.util.Arrays;

public class prob2 {
  public static void main(String[] agrs) {
    // System.out.println("skdjflsjdf");
    System.out.println(Arrays.toString(merge(new int[] { 1, 3, 5, 7, 9 }, new int[] { 2, 4, 6, 8, 9 })));
    System.out.println(Arrays.toString(merge(new int[] { 7, 9 }, new int[] { 2 })));
  }

  static int[] merge(int[] a1, int[] a2) {
    int[] r = new int[a1.length + a2.length];
    int i = 0, j = 0, k = 0;
    while (i < a1.length || j < a2.length) {
      if (i == a1.length) {
        r[k] = a2[j++];
      } else if (j == a2.length) {
        r[k] = a1[i++];
      } else {
        if (a1[i] < a2[j])
          r[k] = a1[i++];
        else
          r[k] = a2[j++];
      }
      k++;
    }
    return r;
  }
}