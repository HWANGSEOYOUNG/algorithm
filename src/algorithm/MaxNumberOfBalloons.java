/*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0*/

package algorithm;

import java.util.HashMap;
import java.util.Set;

public class MaxNumberOfBalloons {

	public static void main(String[] args) {
		System.out.println(maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"));
	}
	
	public static int maxNumberOfBalloons(String text) {
        int result = 0;
        
        char[] balon = new char[] {'b','a','l','o','n'};
        
        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        
        for(int i =0; i <text.length(); i++) {
        	
        	switch(text.charAt(i)) {
        	case 'b' :
        		set.put('b', set.getOrDefault('b',0)+1);
        		break;
        	case 'a' :
        		set.put('a', set.getOrDefault('a',0)+1);
        		break;
        	case 'l' :
        		set.put('l', set.getOrDefault('l',0)+1);
        		break;
        	case 'o' :
        		set.put('o', set.getOrDefault('o',0)+1);
        		break;
        	case 'n' :
        		set.put('n', set.getOrDefault('n',0)+1);
        		break;
        	default : 
        		break;
        	}
        	
        	if(i == text.length()-1) {
        		if(set.containsKey('b')==false||set.containsKey('a')==false||set.containsKey('l')==false||set.containsKey('o')==false||set.containsKey('n')==false) {
                	return 0;
                }
        	}
        }
        
        int min1 = 0;
        int min2 = 0;
        
        if(set.get('b')<=set.get('a')) {
        	min1 = set.get('b');
        }else{
        	min1 = set.get('a');
        }
        
        if(min1>set.get('n')) {
        	min1 = set.get('n');
        }
        
        if(set.get('l')<=set.get('o')) {
        	min2 = set.get('l');
        }else {
        	min2 = set.get('o');
        }
        
        if(min2/2 <= min1) {
        	result = min2/2;
        }        
        
        
        return result;
    }
}
