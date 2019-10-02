package algorithm;


/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true
Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", str = "dog dog dog dog"
Output: false*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","fish whoops helloworld fish"));
    }

    public static boolean wordPattern(String pattern, String str) {
        boolean result = true;

        Character[] pttn = new Character[pattern.length()];

        for(int i = 0; i < pattern.length();i++){
            pttn[i] = pattern.charAt(i);
        }

        StringTokenizer st = new StringTokenizer(str);

        String[] animal = new String[st.countTokens()];

        for(int i = 0; st.hasMoreTokens(); i++){
            animal[i] = st.nextToken();
        }

        if(pttn.length != animal.length){
            return false;
        }

        HashMap<Character,String> match = new HashMap<Character, String>();

        match.put(pttn[0],animal[0]);

        for(int i = 1; i < pttn.length; i++){

            Set set = match.keySet();
            Iterator iter = set.iterator();

            while(iter.hasNext()){
                Character key = (Character)iter.next();

                if(key == pttn[i]){
                    if(!match.get(key).equals(animal[i])){
                        return false;
                    }
                }else if(iter.hasNext() == false){
                    match.put(pttn[i],animal[i]);
                    break;
                }
            }

        }

        HashMap<String,Integer> count = new HashMap<String, Integer>();

        for(Character key : match.keySet()){
            count.put(match.get(key),count.getOrDefault(match.get(key),0)+1);
        }

        for(String key : count.keySet()){
            if(count.get(key) != 1){
                return false;
            }
        }


        return  result;
    }
}
