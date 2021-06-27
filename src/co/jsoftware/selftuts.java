package co.jsoftware;

import java.util.Stack;

public class selftuts {
	public static void main(String[] args) {
		String str = "selftuts";
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));

		}
		while (st.isEmpty() == false) {
			Character ch = st.pop();
			System.out.print(ch);
		}
	}
}
