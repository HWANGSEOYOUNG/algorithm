package algorithm;

public class SkillCheck_lv2_1 {
	
	public static void main(String[] args) {
		System.out.println(solution(78));
	}
	 public static int solution(int n) {
	      
		 String binary = Integer.toBinaryString(n);
		 
		 int cnt = 0;
		 for (int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i)=='1') {
				cnt++;
			}
		}
		 
		 int answer = n+1;
		 
		 while(true) {
			 String answerBnr= Integer.toBinaryString(answer);
			 
			 int ansCnt = 0; 
			 for (int i = 0; i < answerBnr.length(); i++) {
				if(answerBnr.charAt(i)=='1') {
					ansCnt++;
				}
			}
			 
			 if(cnt == ansCnt) {
				 return Integer.parseInt(answerBnr, 2);
			 }else {
				 answer++;
			 }
		 }

	  }
}
