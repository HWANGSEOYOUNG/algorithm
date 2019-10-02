/*Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

package algorithm;

import java.util.*;

public class IsAnagram {
	public static void main(String[] args) {
		String s = "rat", t = "car";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
//		boolean answer = true;
//		
//		if(s.length()!=t.length()) {
//			return false;
//		}
//		
//		HashSet<Character> set = new HashSet<Character>();
//		
//		for(int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		
//		for (int i = 0; i < t.length(); i++) {
//			if(!set.contains(t.charAt(i))) {
//				answer = false;
//			}
//		}
//		
//		return answer;

//		if (s.length() != t.length()) {
//			return false;
//		}
//
//		char[] sArr = new char[s.length()];
//		char[] tArr = new char[t.length()];
//		
//		for (int i = 0; i < sArr.length; i++) {
//			sArr[i] = s.charAt(i);
//			tArr[i] = t.charAt(i);
//		}
//		
//		int sCnt = 0, tCnt = 0;
//		
//		for (int i = 0; i < sArr.length; i++) {
//			sCnt += (int)sArr[i];
//			tCnt += (int)tArr[i];
//		}
//		
//		if(sCnt == tCnt) {
//			return true;
//		}
//		
//		return false;

//		int[] arr = new int[26];
//
//		if (s.length() != t.length()) {
//			return false;
//		}
//
//		for (int i = 0; i < s.length(); i++) {	
//			arr[s.charAt(i)-'a']++;
//			arr[t.charAt(i)-'a']--;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if(!(arr[i]%2==0&&arr[i]>=0)) {
//				return false;
//			}
//		}
//		return true;
		
	    if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
		
		
	}
}
