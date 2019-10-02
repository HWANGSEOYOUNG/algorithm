package algorithm;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        System.out.println(commonChars(A));

    }

    public static List<String> commonChars(String[] A) {
        List<String> ret = new ArrayList<String>();
        for (int j = 97; j < 123; j++) {//알파벳 a~z까지 for문을 돌린다
            char ch = (char) j;
            int cnt = 0;//각배열의 동일 알파벳 유무 개수
            int totalCnt = 0;//각배열의 중복 포함 개수
            String addStr = "" + ch;//리스트에 등록할 문자
            for (int i = 0; i < A.length; i++) { //{"bella","label","roller"}일경우 배열 길이만큼 3번
                String tmp = A[i];//"bella" 하나 넣는다
                int chCnt = 0;//중복 알파벳 개수
                for (int k = 0; k < tmp.length(); k++) {
                    char tChar = tmp.charAt(k);
                    if (tChar == ch) {//중복 체크
                        chCnt++;
                    }
                }

                if (chCnt > 0) {//체크 한 알파벳이 1개 이상일때
                    cnt++;//중복 1개 이상일때 카운트를 해준다.
                    if (totalCnt == 0) {//최초 한번은 넣는다.
                        totalCnt = chCnt;
                    } else if (totalCnt > chCnt) { //2번째부터 개수가 작게 되면 작은 개수로 넣는다. 각 배열의 중복 총개수 확인용
                        totalCnt = chCnt;
                    }
                }
            }


            if (totalCnt > 0 && cnt == A.length) { //중복 포함 개수가 0보다 크고 각 배열에 동일한 알파벳이 있을때 넣는다
                for (int i = 0; i < totalCnt; i++) {
                    ret.add(addStr);
                }
            }
        }
        return ret;
    }
}
