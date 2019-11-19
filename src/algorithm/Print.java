/*https://programmers.co.kr/learn/courses/30/lessons/42587?language=java
 * 문제 설명
일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.

1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
3. 그렇지 않으면 J를 인쇄합니다.
예를 들어, 4개의 문서(A, B, C, D)가 순서대로 인쇄 대기목록에 있고 중요도가 2 1 3 2 라면 C D A B 순으로 인쇄하게 됩니다.

내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 알고 싶습니다. 위의 예에서 C는 1번째로, A는 3번째로 인쇄됩니다.

현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.

제한사항
현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.
입출력 예
priorities	location	return
[2, 1, 3, 2]	2	1
[1, 1, 9, 1, 1, 1]	0	5
입출력 예 설명
예제 #1

문제에 나온 예와 같습니다.

예제 #2

6개의 문서(A, B, C, D, E, F)가 인쇄 대기목록에 있고 중요도가 1 1 9 1 1 1 이므로 C D E F A B 순으로 인쇄합니다.*/

package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
    	Queue<Integer> prio_q = new LinkedList<Integer>();      // 우선순위를 저장하는 큐
        Queue<Integer> order_q = new LinkedList<Integer>();     // 원래의 순서를 저장하는 큐
        int[] sortedPriorities = new int[priorities.length];    // 우선순위 순서로 정렬한 배열

        // 우선순위를 큐와 배열에 저장
        for (int i = 0; i < priorities.length; i++) {
            prio_q.add(priorities[i]);
            sortedPriorities[i] = priorities[i];
        }
        // priorites의 원래 순서를 큐에 저장
        for(int i=0; i<priorities.length;i++){
            order_q.add(i);
        }

        // sortedPriorities를 정렬
        Arrays.sort(sortedPriorities);

        int index = sortedPriorities.length-1;  // 우선순위가 높은것부터 뽑기위함
        int count = 1;

        while (!prio_q.isEmpty()) {
            int prio_pop = prio_q.poll();       // 큐에 들어있는 데이터를 뽑음
            int order_pop = order_q.poll();
            
            // prio_q 를 다 뽑았을 경우에 프린트되는 순서
            if(prio_q.size() == 0){
                //System.out.print(prio_pop);
                return count;
            }
            
            if (prio_pop < sortedPriorities[index]) {   // sortedPriorites의 값보다 prio_q에서 뽑은 값이 작을때
                prio_q.add(prio_pop);                   // 맨 뒤로 보내줌 (다시 추가하는 것)
                order_q.add(order_pop);                 // 순서도 맨뒤로 보내줌
            } else {                                    // 크거나 같은경우
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
