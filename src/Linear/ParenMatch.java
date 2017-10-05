package Linear;
import java.util.NoSuchElementException;

public class ParenMatch {

	/*
	 * Returns true if parentheses or square brackets are matched
	 */
	public static boolean parenMatch(String expr) {
		Stack<Character> match = new Stack<Character>();
		char in, out;
		for (int i = 0; i < expr.length(); i++) {
			in = expr.charAt(i);
			if (in == '[' || in == '(') {
				match.push(in);
			}

			if (in == ']' || in == ')') {
				try {
					out = match.pop();
					
					if(in == ')' && out == '(') {
						continue;
					}
					else   if(in == ']' && out == '[') {
						continue;
					}
					else {
						return false;
					}
				} catch (NoSuchElementException e) {
					return false;
				}
			}

		}
		return  match.isEmpty();
	}

	public static void main(String[] args) {

		String expr1 = "[(a-b)*c]*[(a-b) * (b+c)]";
		String expr2 = "((a-b)";
		String expr3 = "[a-b)";
		String expr4 = "a-b)";

		if (parenMatch(expr1))
			System.out.println("Expr1 - Matched");
		else
			System.out.println("Expr1 - Not Matched");
		
		if (parenMatch(expr2))
			System.out.println("Expr2 - Matched");
		else
			System.out.println("Expr2 - Not Matched");
		
		if (parenMatch(expr3))
			System.out.println("Expr3 - Matched");
		else
			System.out.println("Expr3 - Not Matched");
		
		if (parenMatch(expr4))
			System.out.println("Expr4 - Matched");
		else
			System.out.println("Expr4 - Not Matched");
	}
}
