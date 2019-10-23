/*https://programmers.co.kr/learn/courses/30/lessons/12948
 * 
 * �ڵ��� ��ȣ ������
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
����� ��
phone_number	return
01033334444	*******4444
027778888	*****8888*/

package algorithm;

public class PhoneNum {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
	}

	public static String solution(String phone_number) {
		String answer = "";
		
		String lastNum = phone_number.substring(phone_number.length()-4,phone_number.length());
		
		int front = phone_number.length()-4;
		
		for (int i = 0; i < front; i++) {
			answer = answer.concat("*");
		}
		
		answer= answer.concat(lastNum);
		
		return answer;
	}

}
