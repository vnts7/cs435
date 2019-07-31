
public class prob3 {

  static boolean IsPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] agrs) {
    System.out.println(IsPrime(6));
    System.out.println(IsPrime(23));
    System.out.println(IsPrime(29));
  }
}