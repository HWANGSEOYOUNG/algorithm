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

		//�� ���ڿ� true ��ȯ
		if (s.length() == 0)
			return true;
		//ù���ڰ� ���� ��ȣ�� false ��ȯ
		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;

		for (int i = 0; i < s.length(); i++) {

			//stack�� ����ְų� ���� ��ȣ�� stack�� push
			if (st.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else { // stack�� ������� �ʰ� ���� ��ȣ�� ��� ¦ ���纸�� ¦ ������ stack���� pop, ¦ �ȸ����� false ��ȯ
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

		// ���������� stack�� ��������� true, �ƴϸ� false ��ȯ
		if (st.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
