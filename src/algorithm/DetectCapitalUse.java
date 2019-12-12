/*Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.*/

package algorithm;

public class DetectCapitalUse {

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
	}

	public static boolean detectCapitalUse(String word) {

		if (word.length() <= 1)
			return true;

		char firstCh = word.charAt(0);
		char secondCh = word.charAt(1);

		if (Character.isLowerCase(firstCh) == true) { // 첫글자가 소문자인 경우

			if (Character.isLowerCase(secondCh) == true) { // 뒤에도 전부 소문자이면 true 리턴
				for (int i = 2; i < word.length(); i++) {
					if (Character.isLowerCase(word.charAt(i)) == false) {
						return false;
					}

				}
				return true;

			}else {
				return false;
			}
		} else {// 첫글자가 모두 다 대문자인 경우
			if (Character.isLowerCase(secondCh) == true) { // 전부다 대문자면 true 리턴
				for (int i = 2; i < word.length(); i++) {
					if (Character.isLowerCase(word.charAt(i)) == false) {
						return false;
					}

				}
				return true;
			} else {// 뒤에 글자 모두 다 소문자면 true 리턴
				for (int i = 2; i < word.length(); i++) {
					if (Character.isLowerCase(word.charAt(i)) == true) {
						return false;
					}

				}
				return true;
			}
		}

	}

}
