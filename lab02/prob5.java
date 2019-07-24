public class prob5 {
  public static void main(String[] agrs) {
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(4));
    System.out.println(fib(5));
    System.out.println(fib(6));
    System.out.println(fib(7));
    System.out.println(fib(8));
    System.out.println(fib(9));
  }

  static int fib(int n) {
    if (n == 0 || n == 1)
      return n;
    int n1 = 1, n2 = 0;
    for (int i = 2; i <= n; i++) {
      int t = n2 + n1;
      n2 = n1;
      n1 = t;
    }
    return n1;
  }
}