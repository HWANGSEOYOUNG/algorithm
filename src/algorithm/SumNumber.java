/*https://programmers.co.kr/learn/courses/30/lessons/12931
 * ���� ����
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
����� ��
N	answer
123	6
987	24
����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.*/

package algorithm;

public class SumNumber {
	
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {

       int sum = 0;
       
       while(n != 0) {
    	   sum += n%10;
    	   n = n/10;
       }

        return sum;
    }

}
