package algorithm;


import java.util.Stack;

public class solution_level2 {

    public static void main(String[] args) {

    }

    public static boolean solution(String s){
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }

        if(stack.pop() == '('){
            return false;
        }else{
            for(int i = 0; i < s.length()-1; i++){


            }
        }


        return answer;
    }
}
