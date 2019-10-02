/*
 문자열이 주어지면 0과 1 의 개수가 같은 연속된 문자열의 갯수를 구해라
 
입력 : "00110011"
출력 : 6
0011
01
1100
10
0011
01
* 중복은 허용이 되고 연속이 되어야되며 0 과 1 의 갯수가 같아야 됨.
* 오직 0과 1만 으로 이루어진 문자열이 주어진다.
 * */

package algorithm;

public class CountBinarySubstrings {
	
	public static void main(String[] args) {
		String s = "00110011";
		System.out.println(countBinarySubstrings(s));
	}
	
	public static int countBinarySubstrings(String s) {
        int cnt= 0, zero = 0, one = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i)=='0') {
        		zero++;
        		
        		if(zero <= one) {
        			cnt++;
        		}
        		
        		if(i != s.length()-1 && s.charAt(i+1)=='1') {
        			one = 0;
        		}
        	}else {
        		one++;
        		
        		if(one <= zero) {
        			cnt++;
        		}
        		if(i != s.length()-1 && s.charAt(i+1)=='0') {
        			zero = 0;
        		}
        	}
        }
        
        return cnt;
    }

}
