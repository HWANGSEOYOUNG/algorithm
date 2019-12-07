/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.*/

package algorithm;

import java.util.Stack;

public class IsValid {

	public static void main(String[] args) {
		System.out.println(solution("{[]}"));
	}

	public static boolean solution(String s) {
		Stack<Character> st = new Stack<>();

		//빈 문자열 true 반환
		if (s.length() == 0)
			return true;
		//첫글자가 닫힌 괄호면 false 반환
		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;

		for (int i = 0; i < s.length(); i++) {

			//stack이 비어있거나 열린 괄호면 stack에 push
			if (st.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else { // stack이 비어있지 않고 닫힌 괄호인 경우 짝 맞춰보고 짝 맞으면 stack에서 pop, 짝 안맞으면 false 반환
				if (s.charAt(i) == ')') {
					if (st.peek() == '(') {
						st.pop();
					} else {
						return false;
					}
				} else if (s.charAt(i) == '}') {
					if (st.peek() == '{') {
						st.pop();
					} else {
						return false;
					}
				} else if (s.charAt(i) == ']') {
					if (st.peek() == '[') {
						st.pop();
					} else {
						return false;
					}
				}
			}
		}

		// 최종적으로 stack이 비어있으면 true, 아니면 false 반환
		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
