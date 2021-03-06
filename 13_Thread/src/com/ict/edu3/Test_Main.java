package com.ict.edu3;

public class Test_Main {
	public static void main(String[] args) {
		Ex01 testA = new Ex01();
		Ex02 testB = new Ex02();

		// test A , test B Runnable을 가지구 구현하였으므로 , start()가 없다.
		// start() = > run() 으로 가지 않으면 스레드 처리가 아니다.
		// testA.run() ;
		// testB.run() ;

		// start()는 Thread 클래스가 가지고 있으므로
		// Thread 클래스를 활용해야 된다.

		// 방법 1 : Runnable을 상속받은 객체를 Thread 생성자에 넣어준다.
		Thread thread = new Thread(testA);
		thread.start();
	
		
		// 위에 두개를 하나로 합친것.
		new Thread(testB).start();

		// 방법 2 : 안드로이드에서 사용하는 방법(익명 내부클래스)
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " : 가가가가가가가 ");

				}

			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			System.out.println(Thread.currentThread().getName() + " 가가가가가가가가");
				
			}
		}).start();
	}
}
