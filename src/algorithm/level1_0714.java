package algorithm;

/*���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
����� ��
s	answer
pPoooyY	true
Pyy	false
����� �� ����
����� �� #1
'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.*/


public class level1_0714 {

    public static void main(String[] args) {
        String s = "Pyy";

        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;
        s = s.toLowerCase();

        for (int i = 0; i <= s.length()-1; i++){
            if(s.charAt(i)=='p'){
                p++;
            }else if(s.charAt(i)=='y'){
                y++;
            }
        }

        if(p==y){
            return answer;
        }else {
            return false;
        }


    }
}
