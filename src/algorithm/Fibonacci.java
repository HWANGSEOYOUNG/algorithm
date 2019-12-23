/*�Ǻ���ġ ��
���� ����
�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� �� �Դϴ�.

�������

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
�� ���� �̾����ϴ�.

2 �̻��� n�� �ԷµǾ��� ��, n��° �Ǻ���ġ ���� 1234567���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��� �ּ���.

���� ����
* n�� 1�̻�, 100000������ �ڿ����Դϴ�.

����� ��
n	return
3	2
5	5
����� �� ����
�Ǻ���ġ���� 0��°���� 0, 1, 1, 2, 3, 5, ... �� ���� �̾����ϴ�.*/

package algorithm;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	public static int solution(int n) {
		
		if(n <= 1)
			return 1;
		
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < n; i++) {
			arr[i] = (arr[i-1] +arr[i-2]) % 1234567;
		}
		
		return arr[n-1];
	}
}
