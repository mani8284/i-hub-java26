import java.util.*;
public class Out
{
 public static void main(String[] args)
{
  Stack<String> s=new Stack<String>();
s.push("A");
s.push("B");
s.push("C");
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.isEmpty());
System.out.println(s.search("A"));
}
}
