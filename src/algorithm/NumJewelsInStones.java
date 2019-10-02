package algorithm;

public class NumJewelsInStones {
	 public static int numJewelsInStones(String J, String S) {
		 
		 int result = 0;
		 
		 for (int i = 0; i < S.length(); i++) {
			for (int k = 0; k < J.length(); k++) {
				if(S.charAt(i)==J.charAt(k)) {
					result++;
				}
			}
		}
		 
         return result;
	    }
	 
	 public static void main(String[] args) {
		 
		 String J = "ab";
		 String S = "aaabbbcccAAABBBCCC";
		 
		 System.out.println(numJewelsInStones(J, S));
	}
}
