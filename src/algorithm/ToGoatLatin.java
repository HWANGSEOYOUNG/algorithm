/* https://leetcode.com/problems/goat-latin/
 * 
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"*/

package algorithm;

import java.util.Arrays;

public class ToGoatLatin {

	public static void main(String[] args) {

		String S = "I speak Goat Latin";
		System.out.println(toGoatLatin(S));
	}

	public static String toGoatLatin(String S) {
		
		String[] arr = S.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].charAt(0) =='a'|| arr[i].charAt(0) =='e' || arr[i].charAt(0) =='i' || arr[i].charAt(0) =='o' || arr[i].charAt(0) =='u'
					||arr[i].charAt(0) =='A'|| arr[i].charAt(0) =='E' || arr[i].charAt(0) =='I' || arr[i].charAt(0) =='O' || arr[i].charAt(0) =='U') {
				arr[i] = arr[i].concat("ma");
				
				for (int j = 0; j <= i; j++) {
					arr[i] = arr[i].concat("a");
				}
				
			}else {
				char ch = arr[i].charAt(0);
				arr[i] = arr[i].substring(1);
				arr[i] = arr[i].concat(Character.toString(ch)).concat("ma");
				
				for (int j = 0; j <= i; j++) {
					arr[i] = arr[i].concat("a");
				}
			}
		}
		
		// System.out.println(Arrays.toString(arr));
		
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i == arr.length-1) {
				result = result.concat(arr[i]);
			}else {
				result = result.concat(arr[i]).concat(" ");
			}
			
		}
		
		return result;
	}
}
