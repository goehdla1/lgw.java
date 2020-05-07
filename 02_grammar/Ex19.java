
public class Ex19 {
	public static void main(String[] args) {
		// 삼향연산자 예제들
		// int k1가 홀수인지 짝수인지 판별하자
		int k1 = 7;
		String a = (k1 % 2 == 0) ? "홀수" : "짝수";
		System.out.println(a);
		// int k2가 60이상이면 합격, 불합격 판별하자
		int k2 = 30;
		String b = (k2 >= 60) ? "합격" : "불합격";
		System.out.println(b);
		// char k3 = 대문자인지 , 대문자가 아닌지 판별하자
		char k3 = 'H';
		String c = (k3 >= 'A') && (k3 <= 'Z') ? "대문자" : "대문자 아님";
		System.out.println(c);

		// 근무시간이 8시간까지는 시간당 8590이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?

		int time = 10;
		int dan= 8590;
		double dan1 = 8590*1.5;
		int pay = (time > 8) ?(int)((time-2)*dan + 2*dan1) : time * dan ;
		System.out.println("결과" + pay);
	}
}
