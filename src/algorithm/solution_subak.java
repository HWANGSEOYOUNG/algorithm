package algorithm;

public class solution_subak {

    public static void main(String[] args) {
        int n = 4;

        System.out.println(solution(n));
    }

    public static String solution(int n) {
        String answer="";

//        int repeat = n/2;
//        while(repeat > 0){
//            answer= answer.concat("����");
//            repeat--;
//        }
//
//        if(n%2==1){
//            answer= answer.concat("��");
//        }

        for (int i = 0; i < n ; i++){
            if(i%2==0){
                answer = answer.concat("��");
            }else {
                answer = answer.concat("��");
            }
        }

        return answer;
    }

}
