/*https://programmers.co.kr/learn/courses/30/lessons/42587?language=java
 * ���� ����
�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. �̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.

1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
3. �׷��� ������ J�� �μ��մϴ�.
���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.

���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.

���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.
����� ��
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
����� �� ����
���� #1

������ ���� ���� �����ϴ�.

���� #2

6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.*/

package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
    	Queue<Integer> prio_q = new LinkedList<Integer>();      // �켱������ �����ϴ� ť
        Queue<Integer> order_q = new LinkedList<Integer>();     // ������ ������ �����ϴ� ť
        int[] sortedPriorities = new int[priorities.length];    // �켱���� ������ ������ �迭

        // �켱������ ť�� �迭�� ����
        for (int i = 0; i < priorities.length; i++) {
            prio_q.add(priorities[i]);
            sortedPriorities[i] = priorities[i];
        }
        // priorites�� ���� ������ ť�� ����
        for(int i=0; i<priorities.length;i++){
            order_q.add(i);
        }

        // sortedPriorities�� ����
        Arrays.sort(sortedPriorities);

        int index = sortedPriorities.length-1;  // �켱������ �����ͺ��� �̱�����
        int count = 1;

        while (!prio_q.isEmpty()) {
            int prio_pop = prio_q.poll();       // ť�� ����ִ� �����͸� ����
            int order_pop = order_q.poll();
            
            // prio_q �� �� �̾��� ��쿡 ����Ʈ�Ǵ� ����
            if(prio_q.size() == 0){
                //System.out.print(prio_pop);
                return count;
            }
            
            if (prio_pop < sortedPriorities[index]) {   // sortedPriorites�� ������ prio_q���� ���� ���� ������
                prio_q.add(prio_pop);                   // �� �ڷ� ������ (�ٽ� �߰��ϴ� ��)
                order_q.add(order_pop);                 // ������ �ǵڷ� ������
            } else {                                    // ũ�ų� �������
                if(location == order_pop){              
                    //System.out.println("location"+ location + " >> "+count);
                    return count;
                }
                //System.out.println(prio_pop);
                index--;
                count++;
            }
        }

        return count;

    }
}

public class Print {
   public static void main(String[] args) {
        Solution st = new Solution();
        int[] priorities = {3,3,4,2};
        int location = 3;

        System.out.println(st.solution(priorities, location));
   }
}
