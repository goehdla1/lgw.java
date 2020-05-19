package com.ict.edu5;

// Tiger 클래스가 있긴 하지만 그냥 추상클래스로 body를 완성하지 않았다.
// Tiger를 상속받은 Cat은 Tiger가 완성하지 못한 body를 완성 해야 한다.
class Cat extends Tiger {
	@Override
	public void like() {
		System.out.println("그루밍 하기");

	}
}

class Cat2 extends Tiger2 {
@Override
public void like() {
	// TODO Auto-generated method stub
	
}

@Override
public void sleep() {
	// TODO Auto-generated method stub
	
}
}