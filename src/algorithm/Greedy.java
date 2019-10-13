/*
 * https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 * ���� ����
���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. �л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.

��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. �̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, ���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
����� ��
n	lost	reserve	return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	4
3	[3]	[1]	2
����� �� ����
���� #1
1�� �л��� 2�� �л����� ü������ �����ְ�, 3�� �л��̳� 5�� �л��� 4�� �л����� ü������ �����ָ� �л� 5���� ü�������� ���� �� �ֽ��ϴ�.

���� #2
3�� �л��� 2�� �л��̳� 4�� �л����� ü������ �����ָ� �л� 4���� ü�������� ���� �� �ֽ��ϴ�.*/

package algorithm;

import java.util.Arrays;

public class Greedy {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1,3,5 };
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {

//        int[] plus = new int[lost.length+reserve.length];
//        
//        int cnt = 0;
//        for (int i = 0; i < plus.length; i++) {
//        	
//        	if(i < lost.length) {
//        		plus[i] = lost[i];
//        	}else {
//        		plus[i] = reserve[cnt++];
//        	}
//		}
//        
//        Arrays.sort(plus);
//        System.out.println(Arrays.toString(plus));
//        
//        cnt = 0;
//        for (int i = 1; i < plus.length; i++) {
//			if(plus[i] != plus[i-1]+1) {
//				cnt++;
//			}
//		}
//        
//        System.out.println(cnt);
//        
//        return n-cnt;

		int[] student = new int[n];

		for (int i = 0; i < student.length; i++) {
			student[i] = 1;
		}

		for (int i = 0; i < lost.length; i++) {
			student[lost[i]-1] = 0;
		}

		for (int i = 0; i < reserve.length; i++) {
			student[reserve[i]-1] += 1;
		}

		for (int i = 0; i < student.length; i++) {
			if (student[i] == 0) {
				if(i == 0) {
					if (student[i + 1] == 2) {
						student[i + 1] = 1;
						student[i] = 1;
					}
				}else if(i == student.length-1) {
					if (student[i - 1] == 2) {
						student[i - 1] = 1;
						student[i] = 1;
					}
				}else{
					if (student[i - 1] == 2) {
						student[i - 1] = 1;
						student[i] = 1;
					} else if (student[i + 1] == 2) {
						student[i + 1] = 1;
						student[i] = 1;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(student));
		
		int cnt = 0;
		for (int i = 0; i < student.length; i++) {
			if(student[i] != 0) {
				cnt++;
			}
		}

		return cnt;
	}

}
