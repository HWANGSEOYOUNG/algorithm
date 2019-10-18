/*https://programmers.co.kr/learn/courses/30/lessons/12933
 * 문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
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
