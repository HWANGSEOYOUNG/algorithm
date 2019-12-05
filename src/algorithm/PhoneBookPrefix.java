/*���� ����
��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.*/

package algorithm;

import java.util.Arrays;

public class PhoneBookPrefix {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
	}

	public static  boolean solution(String[] phone_book) {
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length; i++) {
			String pre = phone_book[i];
			
			for (int j = i+1; j < phone_book.length; j++) {
				System.out.println(phone_book[j].indexOf(pre));
				if(phone_book[j].indexOf(pre)==0) {
					return false;
				}
			}
		}
		
		return answer;
	}

}
