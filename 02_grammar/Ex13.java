class Ex13{
	public static void main(String[] args){
	//2시간 40분 30초는 몇 초인가?
	
	int h = 0;
	int m = 0;
	int s = 0;
	
	h = 3600*2;
	m = 60*40;
	s = 30;

	int sum = h+m+s; // 총합
	
	System.out.println("2시간 40분 30초는" + sum + "초 입니다.");
	}	
}