
public class prob3 {

  //Recursive
  static int sub(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0)
      return 0;
    if (s1.charAt(0) == s2.charAt(0))
      return 1 + sub(s1.substring(1), s2.substring(1));
    return Math.max(sub(s1.substring(1), s2), sub(s1, s2.substring(1)));
  }

  //Dynamic Programming Solution
  static int subD(String s1, String s2) {
    int l1 = s1.length(), l2 = s2.length();
    int[][] D = new int[l1 + 1][l2 + 1];
    for (int i = 1; i <= l1; i++) {
      for (int j = 1; j <= l2; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1))
          D[i][j] = 1 + D[i - 1][j - 1];
        else
          D[i][j] = Math.max(D[i - 1][j], D[i][j - 1]);
      }
    }
    return D[l1][l2];
  }

  public static void main(String[] agrs) {
    System.out.println(sub("regular", "ruler"));
    System.out.println(subD("regular", "ruler"));
  }
}