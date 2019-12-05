package algorithm;

public class SkillCheck_lv2_2 {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } }));
	}

	public static int solution(int[][] baseball) {
		int answer = 0;

		for (int i = 123; i <= 987; i++) {

			String tmp = i + "";
			boolean flag = true;

			// 중복 숫자, 0 패스
			if (tmp.charAt(0) == tmp.charAt(1) || tmp.charAt(1) == tmp.charAt(2) || tmp.charAt(0) == tmp.charAt(2))
				continue;
			if (tmp.charAt(0) == '0' || tmp.charAt(1) == '0' || tmp.charAt(2) == '0')
				continue;

			for (int j = 0; j < baseball.length; j++) {
				int strike = 0, ball = 0;
				for (int a = 0; a < 3; a++) {
					for (int b = 0; b < 3; b++) {
						String num = (baseball[j][0]) + "";
						if (a == b && tmp.charAt(a) == num.charAt(b)) {
							strike++;
							continue;
						} else if (tmp.charAt(a) == num.charAt(b)) {
							ball++;
							continue;
						}
					}
				} // for a
				
				if (strike != baseball[j][1] || ball != baseball[j][2]) {
					flag = false;
					break;
				}
			} // for j(baseball)
			
			if (flag)
				answer++;
		}
		return answer;
	}
}
