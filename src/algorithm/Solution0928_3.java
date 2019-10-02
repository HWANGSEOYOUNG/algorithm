package algorithm;

/*다음 그림과 같이 숫자가 적혀있는 스티커가 한 줄로 붙어있습니다.

한 줄로 붙어있는 스티커를 가위로 잘라 하나씩 보관하고 싶습니다. 그러나 스티커 한 개를 깨끗하게 자르려면 인접해 있는 스티커들을 가위로 잘라야 합니다. 예를 들어 위 그림에서 80이 적혀있는 스티커를 깨끗하게 자르고 싶으면 먼저 양쪽의 12와 14가 적힌 스티커의 점선 부분을 가위로 잘라낸 후 80이 적힌 스티커의 가장자리를 다듬어야 합니다. 이때 12와 14가 적힌 스티커는 못 쓰게 됩니다.

스티커에 적힌 숫자가 배열 sticker로 주어질 때, 깨끗하게 잘린 스티커에 적힌 숫자의 합이 최대가 되도록 숫자의 합을 반환하는 함수를 완성해 주세요.

제한사항
스티커의 길이는 1이상 100,000 이하입니다.
스티커에 적힌 숫자는 10,000 이하의 자연수 입니다.

입출력 예
sticker	result
[12, 12, 12, 12, 12]	36
[12, 80, 14, 22, 100]	180
입출력 예 설명
입출력 예 #1
스티커에 적힌 숫자가 [12, 12, 12, 12, 12] 인 경우 첫 번째, 세 번째, 다섯 번째의 12가 적힌 스티커 3개를 깨끗하게 자르면 합이 36으로 최대가 됩니다.

입출력 예 #2
스티커에 적힌 숫자가 [12, 80, 14, 22, 100] 인 경우 80과 100이 적힌 스티커를 깨끗하게 자르면 합이 180으로 최대가 됩니다.
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
