/*�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. ��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.

���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, ��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/

package algorithm;

import java.util.PriorityQueue;

public class PriQue {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
		}

		while (!pq.isEmpty()) {
			int a = pq.poll(); // ���� ���� ���� ����
			int b = pq.poll(); // �� ��°�� ���� ���� ����
			int mix = a + (b * 2);
			pq.add(mix);
			answer++;
			if (pq.peek() >= K) {
				return answer;
			}
			if (pq.size() == 1) {
				return -1;
			}
		}
		return answer;
	}
}
