/*https://leetcode.com/problems/add-strings/
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

"6913259244"
"71103343"

"3876620623801494171"
"6529364523802684779"
"10405985147604178950"
*/

package algorithm;

public class AddStrings {

	public static void main(String[] args) {

		System.out.println(addStrings("9", "99"));

	}

	public static String addStrings(String num1, String num2) {
		
		String answer = "";
		
		// int로 더하면 범위 벗어남
//		int len1 = num1.length();
//		int len2 = num2.length();
//		
//		long number1 = 0, number2 = 0;
//		
//		for (int i = 0; i < len1; i++) {
//			char ch = num1.charAt(i);
//			number1 = number1*10 + (ch - '0');
//		}
//		
//		for (int i = 0; i < len2; i++) {
//			char ch = num2.charAt(i);
//			number2 = number2*10 + (ch - '0');
//		}
//		
//		long result = number1 +number2;
//		
//		answer = ""+result;
		
		int len1 = num1.length();
		int len2 = num2.length();
		int lenMax = len1>=len2? len1:len2;
		
		len1 -= 1;
		len2 -= 1;
		
		int carry = 0;
		for (int i = 0; i < lenMax; i++) {
			if(len1 >= 0 && len2 >= 0) {
				char ch1 = num1.charAt(len1--);
				char ch2 = num2.charAt(len2--);
				int sum = (ch1-'0')+(ch2-'0')+carry;
				carry = sum/10;
				answer = (sum%10)+answer;
				
			}else if(len1 < 0) {
				char ch2 = num2.charAt(len2--);
				int sum = (ch2-'0')+carry;
				carry = sum/10;
				answer = (sum%10)+answer;
			}else if(len2 < 0) {
				char ch1 = num1.charAt(len1--);
				int sum = (ch1-'0')+carry;
				carry = sum/10;
				answer = (sum%10)+answer;
			}
			

		}
		
		if(carry !=0) {
			answer = carry+answer;
			
		}

		
		return answer;
	}
}
