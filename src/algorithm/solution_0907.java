package algorithm;

import java.util.ArrayList;
import java.util.List;

public class solution_0907 {

	public static void main(String[] args) {

		System.out.println(solution("aabbaccc"));

	}

	public static int solution(String s) {

        if (s.length() == 1) {
            return 1;
        }

        int answer = s.length();
        int maxSize = s.length() / 2;

        List<String> list = new ArrayList<String>();

        int cnt = 1;
        int chSize = 1;

        while(chSize <= maxSize) {

            for (int i = 0; i < s.length(); i+=chSize) {

                if (i <= s.length() - chSize) {
                    list.add(s.substring(i, i + chSize));
                } else if(i < s.length()) {
                    list.add(s.substring(i));
                }
            }

            String result = "";

            for (int j = 1; j < list.size(); j++) {
                if (list.get(j - 1).equals(list.get(j))) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        result += cnt + list.get(j-1);
                    } else {
                        result += list.get(j-1);
                    }
                    cnt = 1;
                }

                if(j == list.size()-1){
                    if (cnt > 1) {
                        result += cnt + list.get(j);
                    } else {
                        result += list.get(j);
                    }
                    cnt = 1;
                }
            }

            if(answer> result.length()){
                answer = result.length();
            }
            
            list.clear();
            chSize++;

        }

        return answer;
	}
}
