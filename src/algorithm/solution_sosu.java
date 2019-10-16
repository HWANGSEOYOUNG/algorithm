package algorithm;


public class solution_sosu {

    public static void main(String[] args) {
        int n = 1500000;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
//        int answer = 0;
//
//
//        for (int i = 2; i <= n; i++) {
//            int cnt = 0;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    cnt++;
//                    break;
//                }
//            }
//            if (cnt == 0)
//                answer++;
//        }
//
//
//        return answer;
    	
    	int answer = 0, num = 2;
    	
    	while(num <= n) {
    		for (int i = 2; i <= num; i++) {
				if(num%i == 0 && i != num) {
					break;
				}
				if(num%i == 0 && i == num) {
					answer++;
				}
				
			}
    		num++;
    	}
    	
    	return answer;
    }
}
