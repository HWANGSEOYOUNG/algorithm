package algorithm;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveSmallNum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
	      
		if(arr.length == 1) {
			int[] newArr = {-1};
			return newArr;
		}
		
		int[] result = new int[arr.length-1];
		
		int[] replace = new int[arr.length];
		
		for (int i = 0; i < replace.length; i++) {
			replace[i] = arr[i];
		}
		
		Arrays.sort(replace);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 1; i < replace.length; i++) {
			set.add(replace[i]);
		}
		
//		int j = 0;
//		for (int i = 0; i < result.length; i++) {
//			if(set.contains(arr[j])) {
//				result[i] = arr[j++];
//			}else {
//				j++;
//			}
//		}
		
		int i = 0, j = 0;
		while(i < result.length) {
			if(set.contains(arr[j])) {
				result[i++] = arr[j++];
			}else {
				j++;
			}
		}
		
		return result;
	  }
}
