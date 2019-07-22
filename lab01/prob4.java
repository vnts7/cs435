package lab01;

public class prob4 {
    public static void main(String[] agrs) {
        // System.out.println("skdjflsjdf");
        System.out.println(gcd(12, 42));
        System.out.println(gcd(7, 9));
    }

    static int gcd(int m, int n) {
        int min = Math.min(m, n);
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0)
                return i;
        }
        return 1;
    }
}