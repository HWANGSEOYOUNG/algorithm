/*1���� n���� ��ȣ�� �پ��ִ� n���� ����� ���� �����ձ⸦ �ϰ� �ֽ��ϴ�. ���� �����ձ�� ������ ���� ��Ģ���� ����˴ϴ�.

1������ ��ȣ ������� �� ����� ���ʴ�� �ܾ ���մϴ�.
������ ����� �ܾ ���� �������� �ٽ� 1������ �����մϴ�.
�ջ���� ���� �ܾ��� ������ ���ڷ� �����ϴ� �ܾ ���ؾ� �մϴ�.
������ �����ߴ� �ܾ�� ����� �� �����ϴ�.
�� ������ �ܾ�� �������� �ʽ��ϴ�.
������ 3���� �����ձ⸦ �ϴ� ��Ȳ�� ��Ÿ���ϴ�.

tank �� kick �� know �� wheel �� land �� dream �� mother �� robot �� tank

�� �����ձ�� ������ ���� ����˴ϴ�.

1�� ����� �ڽ��� ù ��° ���ʿ� tank�� ���մϴ�.
2�� ����� �ڽ��� ù ��° ���ʿ� kick�� ���մϴ�.
3�� ����� �ڽ��� ù ��° ���ʿ� know�� ���մϴ�.
1�� ����� �ڽ��� �� ��° ���ʿ� wheel�� ���մϴ�.
(��� ����)
�����ձ⸦ ��� ������ ������ ����, 3�� ����� �ڽ��� �� ��° ���ʿ� ���� tank ��� �ܾ�� ������ �����ߴ� �ܾ��̹Ƿ� Ż���ϰ� �˴ϴ�.

����� �� n�� ������� ������� ���� �ܾ� words �� �Ű������� �־��� ��, ���� ���� Ż���ϴ� ����� ��ȣ�� �� ����� �ڽ��� �� ��° ���ʿ� Ż���ϴ����� ���ؼ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���� ����
�����ձ⿡ �����ϴ� ����� �� n�� 2 �̻� 10 ������ �ڿ����Դϴ�.
words�� �����ձ⿡ ����� �ܾ���� ������� ����ִ� �迭�̸�, ���̴� n �̻� 100 �����Դϴ�.
�ܾ��� ���̴� 2 �̻� 50 �����Դϴ�.
��� �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
�����ձ⿡ ���Ǵ� �ܾ��� ��(�ǹ�)�� �Ű� ���� �����ŵ� �˴ϴ�.
������ [ ��ȣ, ���� ] ���·� return ���ּ���.
���� �־��� �ܾ��� Ż���ڰ� ������ �ʴ´ٸ�, [0, 0]�� return ���ּ���.*/

package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordChainLoser {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2,
				new String[] { "land", "dream", "mom", "mom", "ror" })));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };

		Set<String> set = new HashSet<>();

		if (words[0].length() == 1) {
			return answer;
		} else {
			set.add(words[0]); // ù��° �ܾ set�� ����
		}

		int who = 0;
		int round = 0;
		
		for (int i = 1; i < words.length; i++) {
			
			if(words[i].length() == 1) {
				return answer;
			}

			if (!set.contains(words[i])) { // �ߺ��ܾ �ƴ϶��
				if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) { // �����ձⰡ �ȵȴٸ�
					who = (i% n) +1;
					round = (i/n) +1;
					break;
				} else {
					set.add(words[i]);
				}
			}else { // �ߺ��ܾ���
				who = (i% n) +1;
				round = (i/n) +1;
				break;
			}
		}
		
		answer[0] = who;
		answer[1] = round;
		
		return answer;
	}

}
