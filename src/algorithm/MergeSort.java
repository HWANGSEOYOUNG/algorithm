package algorithm;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8};
		
		int[] data = merge(arr1,arr2);
		
		System.out.println(Arrays.toString(data));
		
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		int[] data = new int[size1+size2];
		
		int i = 0, j = 0, k = 0;
		
		while(i < size1 || j < size2) {
			if(i == size1) {
				while(j < size2){
					data[k++] = arr2[j++];					
				}
			}else if(j == size2) {
				while(i < size1){
					data[k++] = arr1[i++];					
				}
			}else if(arr1[i] <= arr2[j]) {
				data[k++] = arr1[i++];
			}else {
				data[k++] = arr2[j++];
			}
		}
		
		
		return data;		
	}
}
