package algorithm;
import java.util.Arrays;
import java.util.Stack;

public class Solution_0720 {
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int []arr) {
        
		int cnt = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]==arr[i]) {
                cnt++;
            }
        }

        int[] answer = new int[arr.length-cnt];
        answer[0] = arr[0];
        int k = 1;
        int i = 1;

        while (i < answer.length){
            if(arr[k-1]==arr[k]){
                k++;
            }else{
                answer[i] = arr[k];
                i++;
                k++;
            }
        }
        
        return answer;
	}

}
