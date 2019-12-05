package algorithm;

import java.util.*;

public class KakaoTest_2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
    }

    public static int[] solution(String s) {

//        String element = s.substring(2, s.length() - 2);
//        String[] arr = element.split("\\},\\{");
//
//        int idx = 0, ansLen = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int cnt = 0;
//            for (int j = 0; j < arr[i].length(); j++) {
//                if (arr[i].charAt(j) == ',') {
//                    cnt++;
//                }
//            }
//            if (cnt == 0) {
//                idx = i;
//            }
//            if (ansLen < cnt) {
//                ansLen = cnt;
//            }
//        }
//
//        int[] answer = new int[ansLen + 1];
//        answer[0] = Integer.parseInt(arr[idx]);
//
//        int[] arrIdx = new int[ansLen + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            int cnt = 0;
//            for (int j = 0; j < arr[i].length(); j++) {
//                if (arr[i].charAt(j) == ',') {
//                    cnt++;
//                }
//
//                arrIdx[i] = cnt;
//            }
//        }
//
//        Map<Integer, String> map = new HashMap<>();
//
//        for (int i = 0; i < arrIdx.length; i++) {
//            map.put(arrIdx[i], arr[i]);
//        }
//
//
//        for (int key : map.keySet()) {
//            if (key == 0) {
//                continue;
//            }
//            String[] arrInteger = map.get(key).split(",");
//
//            for (int j = 0; j < arrInteger.length; j++) {
//                if (Integer.parseInt(arrInteger[j]) != answer[j]) {
//                    answer[key] = Integer.parseInt(arrInteger[j]);
//                }
//            }
//
//
//        }
//
//
//        return answer;



        // 앞 뒤 {{, }} 제거 , 각 배열에 },{ 빼고 저장
        String element = s.substring(2, s.length() - 2);
        String[] arrStr = element.split("\\},\\{");


        // , 카운트 해서 리턴 배열 길이 카운트
        int ansLen = 0;
        for (int i = 0; i < arrStr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arrStr[i].length(); j++) {
                if (arrStr[i].charAt(j) == ',') {
                    cnt++;
                }
            }
            if (cnt == 0) {
            }
            if (ansLen < cnt) {
                ansLen = cnt;
            }
        }

        // 각 원소의 순서 저장한 배열 만들기
        int[] arrIdx = new int[ansLen + 1];
        for (int i = 0; i < arrStr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arrStr[i].length(); j++) {
                if (arrStr[i].charAt(j) == ',') {
                    cnt++;
                }
                arrIdx[i] = cnt;
            }
        }


        // map에 순서와 값 put
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arrIdx.length; i++) {
            map.put(arrIdx[i], arrStr[i]);
        }

        //list에 튜플에 들어갈 값 담기
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arrStr.length; i++) {
            String[] subArr = map.get(i).split(",");
            for (int j = 0; j < subArr.length; j++) {
                if(!list.contains(Integer.parseInt(subArr[j]))) {
                    list.add(Integer.parseInt(subArr[j]));
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int key : map.keySet()) {
            answer[key] = list.get(key);
        }

        return answer;
    }
}
