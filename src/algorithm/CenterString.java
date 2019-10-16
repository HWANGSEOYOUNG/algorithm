/* https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * 문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
abcde	c
qwer	we*/

package algorithm;

public class CenterString {

	public static void main(String[] args) {
		String s ="qwer";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
	      String answer = "";
	      
	      int idx = 0;
	      if(s.length()%2 != 0) {
		      idx = s.length()/2;
		      answer = Character.toString(s.charAt(idx));
	      }else {
	    	  idx = (s.length()/2) -1;
	    	  answer = answer.concat(Character.toString(s.charAt(idx))).concat(Character.toString(s.charAt(idx+1)));
	      }

	      
	      return answer;
	  }
}
