
public class prob5 {
    public static void main(String[] agrs) {
        // System.out.println("skdjflsjdf");
        System.out.println(secondSmallest(new int[] { 7, 4, 2, 3 }));
        System.out.println(secondSmallest(new int[] { 1, 4, 2, 3 }));
        System.out.println(secondSmallest(new int[] { 3, 3, 4, 7 }));
        System.out.println(secondSmallest(new int[] { 9 }));

    }

    public static int secondSmallest(int[] a) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        // implement
        int min = Integer.MAX_VALUE;
        int min2 = min;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                min2 = min;
                min = a[i];
            } else {
                if (a[i] < min2)
                    min2 = a[i];
            }
        }
        return min2;
    }

}