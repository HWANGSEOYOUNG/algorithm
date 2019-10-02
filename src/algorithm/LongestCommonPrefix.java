package algorithm;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){

        String compare = "";
        String answer = "";

        if(strs[0].charAt(0)!=strs[1].charAt(0)){
            return "";
        }else if(strs.length ==0){
            return "";
        }

        int cnt = 0;

        if(strs[0].length() < strs[1].length()){
            cnt = strs[0].length();
        }else{
            cnt = strs[1].length();
        }

        for (int i = 0; i <cnt; i++){
            if(strs[0].charAt(i)==strs[1].charAt(i)){
                compare = compare.concat(String.valueOf(strs[0].charAt(i)));
            }
        }

        for (int i = 0; i <compare.length();i++){
            if(strs[2].charAt(i)==compare.charAt(i)){
                answer = answer.concat(String.valueOf(compare.charAt(i)));
            }
        }
        return answer;
    }
}
