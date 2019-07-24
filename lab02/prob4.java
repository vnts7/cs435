import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob4 {
  public static void main(String[] agrs) {
    // System.out.println("skdjflsjdf");
    List<Integer> l = new ArrayList() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
      }
    };
    System.out.println(powerSet(l));
  }

  static List<HashSet<Integer>> powerSet(List<Integer> x) {
    List<HashSet<Integer>> p = new ArrayList<HashSet<Integer>>();
    p.add((new HashSet<Integer>()));
    while (!x.isEmpty()) {
      int f = x.remove(0);
      List<HashSet<Integer>> pp = new ArrayList<HashSet<Integer>>();
      for (HashSet<Integer> i : p) {
        HashSet<Integer> j = (HashSet<Integer>) i.clone();
        j.add(f);
        pp.add(j);
      }
      p.addAll(pp);
    }
    return p;
  }
}