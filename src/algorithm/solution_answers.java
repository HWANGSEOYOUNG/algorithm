package algorithm;


public class solution_answers {

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};

        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] arr1 = new int[10000];

        int k= 1;
        for(int i = 0; i < 10000;i++){
            if(k%5 == 0)
                k= 1;
            arr1[i] = k++;

        }

        int[] arr2 = new int[10000];

        for(int i = 0;i < 10000; i++){

        }

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < answers.length; i++){

        }

        return answer;
    }
}
