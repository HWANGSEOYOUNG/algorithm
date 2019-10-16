/*https://programmers.co.kr/learn/courses/30/lessons/12912
 * ���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
����� ��
a	b	return
3	5	12
3	3	3
5	3	12*/


package algorithm;

public class SumMiddleNum {

	public static void main(String[] args) {
		int a = 3, b = 3;
		System.err.println(solution(a,b));
	}
	
	public static long solution(int a, int b) {
		
		if(a==b) {
			return a;
		}
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
	    long answer = 0;
		
		for (int i = a; i <= b; i++) {
			
		answer += i;	
		}
		
	    return answer;
	  }
}
