package algorithm;

/*���� ����
ü������ ���(Bishop)�� �Ʒ� �׸��� ���� �밢�� �������� �� ĭ�̵� �� ���� �̵��� �� �ֽ��ϴ�. ����, �� ���� �̵� ������ ĭ�� ü�� ���� �����ִٸ� �� ü�� ���� ���� �� �ֽ��ϴ�.

8 x 8 ũ���� ü���� ���� ���� ���� ���(Bishop)�� �����ֽ��ϴ�. �̶�, ���(Bishop)�鿡�� �� ���� ������ �ʵ��� ���ο� ���� ���� �� �ִ� ��ĭ�� ������ ���Ϸ��� �մϴ�.

�� �׸����� ���� �׷��� ĭ�� ��󿡰� �� ���� ������ ĭ���̸�, ���� ü�� ���� ���� �� �ִ� ��ĭ ������ 50���Դϴ�.

8 x 8 ü���ǿ� ���� ����� ��ġ bishops�� �Ű������� �־��� ��, ��󿡰� �� ���� ������ �ʵ��� ���ο� ü�� ���� ���� �� �ִ� ��ĭ ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���� ����
ü���ǿ� ���� ����� ��ġ bishops�� solution �Լ��� �Ű������� �־����ϴ�.

bishops�� ����� ��ġ�� ���ڿ� ���·� ����ִ� �迭�Դϴ�.
bishops�� ���̴� 1 �̻� 64 �����Դϴ�.
����� ���� ��ġ�� ���ĺ� �빮�ڿ� ���ڷ� ǥ���մϴ�.
���ĺ� �빮�ڴ� ���� ����, ���ڴ� ���� ���� ��ǥ�� ��Ÿ���ϴ�.
���� ��� �� �׸����� ����� �ִ� ĭ�� D5��� ǥ���մϴ�.
�� ĭ�� ���� ����� ���̰ų�, �߸��� ��ġ�� �־����� ���� �����ϴ�.
����� ��
bishops	return
[D5]	50
[D5, E8, G2]	42
����� �� ����
����� �� #1
������ ���� ���ÿ� �����ϴ�.

����� �� #2

�׸��� ���� ���� �׷��� ĭ�� ��󿡰� �� ���� ������ ĭ���̸�, ���� ü�� ���� ���� �� �ִ� ��ĭ ������ 42���Դϴ�.*/

import java.util.Arrays;

public class Solution0928_2 {
    public static void main(String[] args) {
        String[] bishops = {"D5","E8", "G2"};
        System.out.println(solution(bishops));
    }

    public static int solution(String[] bishops) {
        int answer = 0;

        int[][] bs = new int[bishops.length][2];

        for (int i = 0 ; i < bishops.length ; i++){
            bs[i][0] = (int)(bishops[i].charAt(0)-'A');
            bs[i][1] = (int)(bishops[i].charAt(1)-'1');
        }

        int[][] table = new int[8][8];

        for(int i = 0; i < bishops.length; i++){
            table[bs[i][0]][bs[i][1]]++;

            int j = bs[i][0], k = bs[i][1];
            while (j >= 0 && k >= 0){
                table[j--][k--]++;
            }

            j = bs[i][0];
            k = bs[i][1];
            while (j <8 && k >= 0){
                table[j++][k--]++;
            }
            j = bs[i][0];
            k = bs[i][1];
            while (j >= 0 && k <8 ){
                table[j--][k++]++;
            }
            j = bs[i][0];
            k = bs[i][1];
            while (j <8 && k <8){
                table[j++][k++]++;
            }
        }

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                if(table[i][j] == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}
