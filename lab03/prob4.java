public class prob4 {
  public static void main(String[] agrs) {
    int[] a = new int[] { 0, 0, 0, 0 };
    System.out.print(count(a, 0, a.length - 1));
  }

  static int count(int[] a, int from, int to) {
    if (from > to)
      return 0;
    int mid = (from + to) / 2;
    int v = a[mid];
    if (v == 1)
      return count(a, from, mid - 1);
    // v=0
    if (from == to)
      return mid + 1;
    if (a[mid + 1] == 1)
      return mid + 1;
    return count(a, mid + 1, to);
  }
}