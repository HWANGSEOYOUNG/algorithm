/* https://programmers.co.kr/learn/courses/30/lessons/12906
 * 
 * ���� ���ڴ� �Ⱦ�
���� ����
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
����� ��
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]*/

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
