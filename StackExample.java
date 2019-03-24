import java.util.*;

public class StackExample{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			Stack<Character> stack = new Stack<Character>();
			boolean match = true;
			try {
			for(char c :input.toCharArray()) {
				if (c=='[' || c== '{' || c== '(') {
					stack.push(c);
				} else if (c==']') {
					if(!stack.pop().equals(new Character('['))) {
						match=false;
						break;
					}
				} else if (c== '}') {
					if(!stack.pop().equals(new Character('{'))) {
						match=false;
						break;
					}
				} else if (c== ')') {
					if(!stack.pop().equals(new Character('('))) {
						match=false;
						break;
					}
				} else {
					System.out.println("Inavlid Character");
				}
			}
			if (match && stack.size()==0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			} catch (Exception e) {
				System.out.println("false");
			}
		}
		
	}
}



