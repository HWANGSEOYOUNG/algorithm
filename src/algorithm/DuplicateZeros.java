/*
 * https://leetcode.com/problems/duplicate-zeros/
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]*/

package algorithm;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}

	public static void duplicateZeros(int[] arr) {
		
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== 0) {
				cnt++;
			}
		}
		
		int[] arrNum = new int[arr.length-cnt];
		
		int i = 0, j = 0;
		
		while(i < arrNum.length) {
			if(arr[j] != 0) {
				arrNum[i++] = arr[j++];
			}else {
				j++;
			}
		}
		
		int[] replace = new int[arr.length];
		
		i = 0; j = 0;
		int k = 0;
		while(k < replace.length) {
			if(arr[i] != 0) {
				replace[k++] = arrNum[j++];
				i++;
			}else if(k != replace.length-1 && arr[i]== 0) {
				replace[k+1] = 0;
				replace[k++] = 0;
				k++;
				i++;
			}else if(k == replace.length-1 && arr[i] == 0) {
				break;
			}else if(k == replace.length && arr[i] != 0) {
				replace[k] = arr[i];
			}
		}
		
		i = 0;
		for (int n = 0; n < replace.length; n++) {
			arr[i++] = replace[n];
		}
		
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(replace));
		System.out.println(Arrays.toString(arr));
		
	}

}
