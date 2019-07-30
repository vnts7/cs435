import java.util.LinkedList;
import java.util.Stack;

public class prob1 {

  static String revert(String input) {
    Stack<Character> s = new Stack();
    String r = "";
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      s.push(c);
      if (c == ' ' || i == input.length() - 1) {
        if (c != ' ');
          s.push(' ');
        while (!s.isEmpty())
          r += s.pop();
      }

    }
    return r;
  }

  public static void main(String[] agrs) {
    System.out.println(revert("we test coders"));
  }
}