/*���� ����
��ũ���� 2018-09-14 ���� 5.44.19.png

���� ���� �ﰢ���� ����⿡�� �ٴڱ��� �̾����� ��� ��, ���İ� ������ ���� ���� ū ��츦 ã�ƺ����� �մϴ�. �Ʒ� ĭ���� �̵��� ���� �밢�� �������� �� ĭ ������ �Ǵ� �������θ� �̵� �����մϴ�. ���� ��� 3������ �� �Ʒ�ĭ�� 8 �Ǵ� 1�θ� �̵��� �����մϴ�.

�ﰢ���� ������ ��� �迭 triangle�� �Ű������� �־��� ��, ���İ� ������ �ִ��� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���ѻ���
�ﰢ���� ���̴� 1 �̻� 500 �����Դϴ�.
�ﰢ���� �̷�� �ִ� ���ڴ� 0 �̻� 9,999 ������ �����Դϴ�.

[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30

*/

package algorithm;

public class TriangleMax {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
	}

	public static int solution(int[][] triangle) {
        int answer = 0;
        
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i+1].length-1; j++) {
               if(triangle[i+1][j] >= triangle[i+1][j+1]) {
                  triangle[i][j] += triangle[i+1][j];
               }else {
                  triangle[i][j] += triangle[i+1][j+1];
               }
            }
         }
         
         answer = triangle[0][0];
        
        
        return answer;
    }
}
