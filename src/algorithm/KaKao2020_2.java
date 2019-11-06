package algorithm;

import java.util.Stack;

public class KaKao2020_2 {

	public static void main(String[] args) {
        System.out.println(solution(")("));
    }

    public static String solution(String p) {
        String answer = "";

        if(check(p)) {
            return p;
        }

        answer = correct(p);

        return answer;
    }

    // 올바른 문자열 확인
    public static boolean check(String u) {
        Stack<Character> stack = new Stack<>();

        for (char c : u.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;

                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //올바른 문자열로 변경
    public static String correct(String p) {

        if(p.isEmpty()) {
            return "";
        }

        String u = "";
        String v = "";
        String result = "";

        int cnt1= 0, cnt2 = 0, index = 0;

        for (char c : p.toCharArray()) {
            if(c == '(') {
                cnt1++;
            }else {
                cnt2++;
            }
            index++;

            if(cnt1==cnt2) {
                break;
            }
        }

        u += p.substring(0,index);
        v += p.substring(index);

        if(check(u)) {
            result += u;
            result += correct(v);
        }else {
            result = "(";
            result += correct(v);
            result += ")";

            u = u.substring(1);

            if(u.length() < 2){
                u = "";
            }else{
                u = u.substring(0,u.length()-1);
                int len = u.length();

                for (int i = 0; i < len; i++) {
                    if(u.charAt(i)=='(') {
                        result += ")";
                    }else {
                        result += "(";
                    }
                }
            }

        }

        return result;

    }
}