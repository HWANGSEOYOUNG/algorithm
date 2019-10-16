/*https://programmers.co.kr/learn/courses/30/lessons/42840
 * 
 * ���� ����
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
����� ��
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
����� �� ����
����� �� #1

������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

����� �� #2

��� ����� 2�������� ������ϴ�.*/

package algorithm;

import java.util.Arrays;

public class StudentTestPass {

	public static void main(String[] args) {
		int[] answers = { 1, 3, 2, 4, 2 };
		System.out.println(Arrays.toString(solution(answers)));
	}

	public static int[] solution(int[] answers) {

		int[] stu1 = { 1, 2, 3, 4, 5 };
		int[] stu2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] stu3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int a1cnt = 0, a2cnt = 0, a3cnt = 0;

		for (int i = 0; i < answers.length; i++) {

			int idx1 = i % stu1.length;
			int idx2 = i % stu2.length;
			int idx3 = i % stu3.length;

			if (answers[i] == stu1[idx1]) {
				a1cnt++;
			}
			if (answers[i] == stu2[idx2]) {
				a2cnt++;
			}
			if (answers[i] == stu3[idx3]) {
				a3cnt++;
			}

		}

		int max = 0;

		if (a1cnt >= a2cnt) {
			max = a1cnt;
		} else {
			max = a2cnt;
		}
		if (a3cnt > max) {
			max = a3cnt;
		}

		int maxCnt = 0;

		if (max == a1cnt) {
			maxCnt++;
		}
		if (max == a2cnt) {
			maxCnt++;
		}
		if (max == a3cnt) {
			maxCnt++;
		}

		int[] answer = new int[maxCnt];

		int i = 0;
		while (i < answer.length) {
			if (max == a1cnt) {
				answer[i++] = 1;
			}
			if (max == a2cnt) {
				answer[i++] = 2;
			}
			if (max == a3cnt) {
				answer[i++] = 3;
			}
		}

		return answer;
	}
}
