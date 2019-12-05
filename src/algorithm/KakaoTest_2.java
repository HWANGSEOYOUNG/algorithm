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



        // �� �� {{, }} ���� , �� �迭�� },{ ���� ����
        String element = s.substring(2, s.length() - 2);
        String[] arrStr = element.split("\\},\\{");


        // , ī��Ʈ �ؼ� ���� �迭 ���� ī��Ʈ
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

        // �� ������ ���� ������ �迭 �����
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


        // map�� ������ �� put
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arrIdx.length; i++) {
            map.put(arrIdx[i], arrStr[i]);
        }

        //list�� Ʃ�ÿ� �� �� ���
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
