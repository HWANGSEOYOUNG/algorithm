package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution_hn {

	public static void main(String[] args) {
//		String J = "aA", S = "aAAbbbb";
//		String J = "z", S = "ZZ";
		
//		String J = "z", S = "zzzzZZ";
//		System.out.println(stones(J,S));
		
		
		String[] A = {"bella","label","roller"};
//		String[] A = {"cool","lock","cook"};
		
		List<String> strList = commonChars(A);
		System.out.println(strList.toString());
		
	}

	
	public static int stones(String J,String S){
		int cnt = 0;
		String[] arrJ = new String[J.length()];
		String[] arrS = new String[S.length()];
		for (int i = 0; i < arrJ.length; i++) {
			arrJ[i]=J.substring(i, i+1);
		}
		for (int i = 0; i < arrS.length; i++) {
			arrS[i]=S.substring(i, i+1);
		}
		
		for (int i = 0; i < arrS.length; i++) {
			for (int k = 0; k < arrJ.length; k++) {
				if(arrS[i].equals(arrJ[k])){
					cnt++;
				}
			}
		}
		return cnt;
		
	}
	
	public static List<String> commonChars(String[] A) {
		List<String> ret = new ArrayList<String>();
		
		for (int j =  97; j < 123; j++) {
			char ch = (char)j;
			int cnt = 0;
			String addStr = ""+ch;
			
			
			for (int i = 0; i < A.length; i++) { //{"bella","label","roller"}
				String tmp = A[i];//"cool"
				int chCnt = 0;
//				for (int k = 0; k < tmp.length(); k++) {
//					char tChar = tmp.charAt(k);
//					if(tChar == ch){
//						chCnt++;
//					}
//				}
						
				if(tmp.contains(""+ch)){//tmp 안에 ch가 있나?
					cnt++;
				}
			}
			
			if(cnt > 2){
				ret.add(addStr);
			}
		}
		
		return ret;
		
	 }
}