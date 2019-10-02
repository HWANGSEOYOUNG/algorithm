/*Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""*/

package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GcdOfStrings {

	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";

		System.out.println(gcdOfStrings(str1, str2));
	}

	public static String gcdOfStrings(String str1, String str2) {
//		String result = "";
//
//		for (int i = 0; i < str2.length(); i++) {
//			if (str2.charAt(i) == str1.charAt(i)) {
//				result = result.concat(String.valueOf(str2.charAt(i)));
//			}
//		}
//		
//		return result;
		
		
//        if(!(str1 + str2).equals(str2 + str1))
//            return "";
//        else if(str1.equals(str2))
//            return str1;
//        else if(str1.length() > str2.length())
//            return gcdOfStrings(str1.substring(str2.length()), str2);
//        else
//            return gcdOfStrings(str2.substring(str1.length()), str1);
		
		  HashMap<Integer, String> result = new HashMap<Integer, String>();
	      int keyResult = 0;
	      String gcdStr = "";
	      int minLength;

	      if (str1.length() <= str2.length()) {
	         minLength = str1.length();
	      } else {
	         minLength = str2.length();
	      }

	      for (int i = 0; i < minLength; i++) {
	         if (str1.charAt(i) != str2.charAt(i)) {
	            return "";
	         } else if (str1.charAt(i) == str2.charAt(i)) {
	            gcdStr += str1.charAt(i);
	            keyResult++;
	            result.put(keyResult, gcdStr);
	         }
	      }

	      Set keyset = result.keySet();
	      Iterator itr = keyset.iterator();
	      while (itr.hasNext()) {
	         int key = (int) itr.next();
	         if (str1.length() % key == 0 && str2.length() % key == 0) {
	            gcdStr = result.get(key);
	         }
	      }

	      int index = 0;
	      for (int i = 0; i < str1.length(); i++) {
	         if(gcdStr.charAt(index) != str1.charAt(i)) {
	            return "";
	         }
	         
	         index++;
	         
	         if(index > gcdStr.length()-1) {
	            index = 0;
	         }
	      }
	      
	      index = 0;
	      
	      for (int i = 0; i < str2.length(); i++) {
	         if(gcdStr.charAt(index) != str2.charAt(i)) {
	            return "";
	         }
	         
	         index++;
	         
	         if(index > gcdStr.length()-1) {
	            index = 0;
	         }
	      }

	      return gcdStr;

        
        
	}
}
