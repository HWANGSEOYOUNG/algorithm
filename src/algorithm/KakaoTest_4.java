package algorithm;

import java.util.*;

public class KakaoTest_4 {
    public static void main(String[] args) {
    	Solution_4 sol = new Solution_4();

        System.out.println(Arrays.toString(sol.solution(10, new long[]{1,3,4,1,3,1})));
    }

}

class Solution_4 {
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        List<Long> list = new ArrayList<>();
        Set<Long> set = new HashSet<>();

        for (int i = 0; i < room_number.length; i++) {
            if (!set.contains(room_number[i])) {
                set.add(room_number[i]);
                answer[i] = room_number[i];
            } else {
                for(long j = room_number[i] + 1; j < k; j++) {
                    if (!set.contains(j)) {
                        set.add( j);
                        answer[i] = j;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
