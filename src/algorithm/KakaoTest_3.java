package algorithm;

public class KakaoTest_3 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"*rodo", "*rodo", "******"}));
    }

    public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;

        int[] cntArr = new int[banned_id.length];

        for (int i = 0; i < banned_id.length; i++){
            for (int j = 0; j < user_id.length; j++){
                if(banned_id[i].length() != user_id[j].length()){
                    continue;
                }
                int idx = 0, cnt = 0;

                while (idx < banned_id[i].length()){
                    if(banned_id[i].charAt(idx) != user_id[j].charAt(idx) && banned_id[i].charAt(idx) != '*'){
                        cnt++;
                    }
                    idx++;
                }
                if(cnt == 0){
                    cntArr[i] = 1;
                    break;
                }

            }


            for (int k = 0; k < cntArr.length; k++){

            }

            if(answer == 0){
                answer = cntArr[i];
            }else{
                answer *= cntArr[i];
            }
        }

        return answer;
    }
}