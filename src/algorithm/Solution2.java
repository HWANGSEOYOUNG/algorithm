package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    static public List<String> commonChars(String[] A) {
        ArrayList<String> list = new ArrayList<String>();
        String[] a = null;
                
//        for (int i = 0; i < A[0].length(); i++) {
//			for (int j = 0; j < A[1].length(); j++) {
//				if(A[0].charAt(i)==A[1].charAt(j)) {
//					a[i] = A[i].charAt(i)+"";
//				}
//			}
//		}
//        
//        for (int i = 0; i < A[2].length(); i++) {
//			for (int j = 0; j < a[j].length(); j++) {
//				if(A[i].charAt(i) == a[j].charAt(j)) {
//					list.add(A[i].charAt(i)+"");
//				}
//			}
//		}
        
        return list;
    }
    
    public static void main(String[] args) {
		String[] A = {"bella","label","roller"};
		System.out.println(commonChars(A));
	}
}
