package algorithm;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] data = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		quicksort(data, 0, data.length);
		System.out.println(Arrays.toString(data));
	}
	
	public static void swap(int data[], int i, int j) {
		
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void quicksort(int[] data, int start, int end) {
		if(start>=end) {
			return;
		}
		
		int pivot = (int)(Math.random()*(end-start))+start;
		int i = start;
		int j = end-1;
		boolean movingI = true;
		
		swap(data, pivot, j);
		
		while(i<j) {
			if(data[i] > data[j]) {
				swap(data,i,j);
				movingI = !movingI;
			}
			if(movingI) {
				i++;
			}else {
				j--;
			}
		}
		
		quicksort(data,start, i);
		quicksort(data,i+1,end);
	}
}
