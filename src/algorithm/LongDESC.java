/*https://programmers.co.kr/learn/courses/30/lessons/12933
 * ���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
����� ��
n	return
118372	873211*/

package algorithm;

import java.util.Arrays;

public class LongDESC {

	public static void main(String[] args) {
		long n = 800273995;
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		long answer = 0;

		String size = "" + n;

		int[] arr = new int[size.length()];

		int i = 0;
		while (n != 0) {
			arr[i] = (int) n % 10;
			n /= 10;
			i++;
		}

		Arrays.sort(arr);

		for (int j = 0; j < arr.length; j++) {
			answer += arr[j] * Math.pow(10,j);
		}

		return answer;
	}

}
