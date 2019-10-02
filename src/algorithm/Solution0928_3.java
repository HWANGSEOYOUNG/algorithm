package algorithm;

/*���� �׸��� ���� ���ڰ� �����ִ� ��ƼĿ�� �� �ٷ� �پ��ֽ��ϴ�.

�� �ٷ� �پ��ִ� ��ƼĿ�� ������ �߶� �ϳ��� �����ϰ� �ͽ��ϴ�. �׷��� ��ƼĿ �� ���� �����ϰ� �ڸ����� ������ �ִ� ��ƼĿ���� ������ �߶�� �մϴ�. ���� ��� �� �׸����� 80�� �����ִ� ��ƼĿ�� �����ϰ� �ڸ��� ������ ���� ������ 12�� 14�� ���� ��ƼĿ�� ���� �κ��� ������ �߶� �� 80�� ���� ��ƼĿ�� �����ڸ��� �ٵ��� �մϴ�. �̶� 12�� 14�� ���� ��ƼĿ�� �� ���� �˴ϴ�.

��ƼĿ�� ���� ���ڰ� �迭 sticker�� �־��� ��, �����ϰ� �߸� ��ƼĿ�� ���� ������ ���� �ִ밡 �ǵ��� ������ ���� ��ȯ�ϴ� �Լ��� �ϼ��� �ּ���.

���ѻ���
��ƼĿ�� ���̴� 1�̻� 100,000 �����Դϴ�.
��ƼĿ�� ���� ���ڴ� 10,000 ������ �ڿ��� �Դϴ�.

����� ��
sticker	result
[12, 12, 12, 12, 12]	36
[12, 80, 14, 22, 100]	180
����� �� ����
����� �� #1
��ƼĿ�� ���� ���ڰ� [12, 12, 12, 12, 12] �� ��� ù ��°, �� ��°, �ټ� ��°�� 12�� ���� ��ƼĿ 3���� �����ϰ� �ڸ��� ���� 36���� �ִ밡 �˴ϴ�.

����� �� #2
��ƼĿ�� ���� ���ڰ� [12, 80, 14, 22, 100] �� ��� 80�� 100�� ���� ��ƼĿ�� �����ϰ� �ڸ��� ���� 180���� �ִ밡 �˴ϴ�.
*/

public class Solution0928_3 {
    public static void main(String[] args) {
        int[] sticker = {12, 12, 12, 12, 12};
        System.out.println(solution(sticker));
    }

    public static int solution(int[] sticker) {
        int answer = 0;

        int sum = 0, max = 0;

        if(sticker.length == 1){
            return sticker[0];
        }else if(sticker.length == 2){
            if(sticker[0]>= sticker[1]){
                return  sticker[0];
            }else {
                return sticker[1];
            }
        }

        for (int i = 0; i < sticker.length; i++){

            sum = sticker[i];

            for (int j = i+2; j < sticker.length; j++){

                if(j+1 < sticker.length){
                    if(sticker[i]+sticker[j]>= sticker[i]+sticker[j+1]){
                        sum = sticker[j++];
                    }else{
                        sum = sticker[j+1];
                        j= j+2;
                    }
                }

            }
        }

        return answer;

    }
}
