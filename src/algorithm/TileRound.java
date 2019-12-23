/*�뱸 �޼������� � �� ������ �ֱٿ� ���� ���� Ÿ�� ��Ĺ��� ���� �Ǿ���. Ÿ�� ��Ĺ��� ���簢�� Ÿ���� �ٿ� ���� ���¿��µ�, �� ���� 1�� ���簢�� Ÿ�Ϻ��� �����Ͽ� ��ġ �޹������� ���� ���ó�� ���� ū Ÿ���� ���� ���¿���. Ÿ�� ��Ĺ��� �Ϻθ� �׸��� ������ ����.

�׸����� Ÿ�Ͽ� ���� ���� �� Ÿ���� �� ���� ���̸� ��Ÿ����. Ÿ�� ��Ĺ��� �����ϴ� ���簢�� Ÿ�� �� ���� ���̸� ���� Ÿ�Ϻ��� �����Ͽ� ���ʷ� ������ ������ ����.
[1, 1, 2, 3, 5, 8, .]
������ ���� �̷��� Ÿ�ϵ�� �����Ǵ� ū ���簢���� �ѷ��� �ñ�������. ���� ���, ó�� �ټ� ���� Ÿ���� �����ϴ� ���簢��(������ ���������� ǥ���� ���簢��)�� �ѷ��� 26�̴�.

Ÿ���� ���� N�� �־��� ��, N���� Ÿ�Ϸ� ������ ���簢���� �ѷ��� return �ϵ��� solution �Լ��� �ۼ��Ͻÿ�.

���� ����
N�� 1 �̻� 80 ������ �ڿ����̴�.
����� ��
N	return
5	26
6	42*/

package algorithm;

public class TileRound {

	public static void main(String[] args) {
		System.out.println(solution(5));
	}

	public static long solution(int N) {
		
		long[] arr = new long[N];		
		long last1 = 1, last2 = 1;
		arr[0] = last1;
		arr[1] = last2;
		for (int i = 2; i < N; i++) {
			arr[i] = last1 + last2;
			last1 = last2;
			last2 = arr[i];
		}
		
		long height = 0, width = 0;
		
		width = arr[arr.length-1];
		height = arr[arr.length-1]+arr[arr.length-2];
		
		return (width+height)*2;
	}

}
