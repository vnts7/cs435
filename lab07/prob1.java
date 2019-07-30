import java.util.LinkedList;
import java.util.Stack;

public class prob1 {

  static String revert(String input) {
    Stack<Character> s = new Stack();
    String r = "";
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c == ' ' || i == input.length() - 1) {
        if (c != ' ')
          s.push(c);
        while (!s.isEmpty())
          r += s.pop();
        r += ' ';
      } else
        s.push(c);
    }
    return r;
  }

  public static void main(String[] agrs) {
    System.out.println(revert("we test coders"));
  }
}