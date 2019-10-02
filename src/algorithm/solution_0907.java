package algorithm;


public class solution_0907 {

    public static void main(String[] args) {

        System.out.println(solution("aabbaccc"));

    }

    public static int solution(String s){
        int answer = 0;

        answer = s.length();

        int same1 = 0;

        for(int i = 1; i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                same1++;
                if(same1 >=2){
                    answer--;
                }
            }else{
                same1 = 0;
            }
        }

        return answer;
    }
}
