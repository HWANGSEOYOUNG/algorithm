package algorithm;

/*
���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
*/

import java.util.Arrays;

public class level1_4 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        int max, min;

        for (int i  = 1; i <= arr.length -1; i++){
            if (arr[i-1] > arr[i]){
                max = arr[i-1];
            }
        }

        return answer;
    }
}
