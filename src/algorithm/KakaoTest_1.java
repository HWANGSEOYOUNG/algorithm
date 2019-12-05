package algorithm;

import java.util.Stack;

public class KakaoTest_1 {
    public static void main(String[] args) {

        int[][] board = { { 0, 0, 0, 0, 0 },
                { 0,0,1,0,3 },
                { 0,2,5,0,1 },
                { 4,2,4,4,2},
                { 3,5,1,3,1} };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

//        Solution solution = new Solution();
//        System.out.println("result : " + solution.solution(board, moves));

        System.out.println("method : " + solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        int rowIdx = 0;
        int colIdx;

        for (int i = 0; i < moves.length; i++) {
            colIdx = moves[i] - 1;
            while (rowIdx != board.length) {
                if (board[rowIdx][colIdx] == 0) {
                    rowIdx++;
                    continue;
                } else {
                    stack.push(board[rowIdx][colIdx]);
                    board[rowIdx][colIdx] = 0;
                    break;
                }
            }

            if(!stack.isEmpty()) {
                if(stack.size() > 1) {
                    int pop = stack.pop();
                    if(pop == stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }else {
                        stack.push(pop);
                    }
                }
            }
            rowIdx = 0;
        }

        return answer;
    }


}

//class Solution {
//
//    ArrayList<Integer> list = new ArrayList<Integer>();
//    int count = 0;
//
//    public int solution(int[][] board, int[] moves) {
//
//        int answer = 0;
//        int choice = 0;
//
//        for (int i = 0; i < moves.length; i++) {
//
//            choice = getDoll(board, moves[i]);
//            if(choice!=0) {
//                boom(choice);
//            }
//
//        }
//
//        return count;
//
//    }
//
//    // 인형을 꺼내는 method
//    public int getDoll(int[][] board, int moveNum) {
//
//        int choice = 0;
//
//        for (int i = 0; i < board.length; i++) {
//            int num = board[i][moveNum - 1];
//            if (num != 0) {
//                choice = num;
//                board[i][moveNum - 1] = 0;
//                break;
//            }
//
//        }
//        return choice;
//
//    }
//
//    public void boom(int n) {
//
//        int x = list.size();
//        if (list.size() != 0) {
//            if (list.get(x - 1) == n) {
//                list.remove(x - 1);
//                count+=2;
//            } else {
//                list.add(n);
//            }
//        } else
//            list.add(n);
//
//    }
//
//}
