/*
 ���ڿ��� �־����� 0�� 1 �� ������ ���� ���ӵ� ���ڿ��� ������ ���ض�
 
�Է� : "00110011"
��� : 6
0011
01
1100
10
0011
01
* �ߺ��� ����� �ǰ� ������ �Ǿ�ߵǸ� 0 �� 1 �� ������ ���ƾ� ��.
* ���� 0�� 1�� ���� �̷���� ���ڿ��� �־�����.
 * */

package algorithm;

public class CountBinarySubstrings {
	
	public static void main(String[] args) {
		String s = "00110011";
		System.out.println(countBinarySubstrings(s));
	}
	
	public static int countBinarySubstrings(String s) {
        int cnt= 0, zero = 0, one = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i)=='0') {
        		zero++;
        		
        		if(zero <= one) {
        			cnt++;
        		}
        		
        		if(i != s.length()-1 && s.charAt(i+1)=='1') {
        			one = 0;
        		}
        	}else {
        		one++;
        		
        		if(one <= zero) {
        			cnt++;
        		}
        		if(i != s.length()-1 && s.charAt(i+1)=='0') {
        			zero = 0;
        		}
        	}
        }
        
        return cnt;
    }

}
