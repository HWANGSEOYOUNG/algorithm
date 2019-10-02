package algorithm;

import java.util.HashMap;

public class Completion {

    public static void main(String[] args) {
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"kiki", "eden"};
//
//        System.out.println(solution(participant,completion));


        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"marina", "josipa", "nikola", "filipa"};

        System.out.println(solution(participant,completion));

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
//
//        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for(String player : participant){
            hm.put(player,hm.getOrDefault(player,0)+1);
        }

        for(String player:completion){
            hm.put(player,hm.get(player)-1);
        }

        for(String key : hm.keySet()){
            if(hm.get(key)!=0){
                answer= key;
            }
        }


//        for(int i = 0; i < participant.length; i++){
//            for (int j = 0; j < completion.length; j++){
//                if(participant[i] == completion[j]){
//                    compare.put(participant[i],completion[j]);
//                }
//            }
//        }
//
//        for (int i = 0; i< participant.length;i++){
//            if(!compare.containsKey(participant[i])){
//                answer = participant[i];
//            }
//        }

//        for(int i = 0; i < participant.length; i++){
//            for (int j = 0; j < completion.length; j++){
//                if(participant[i] == completion[j]){
//                    compare.put(participant[i],completion[j]);
//                }else {
//                    compare.put(participant[i],null);
//                }
//            }
//        }

        return answer;
    }
}
