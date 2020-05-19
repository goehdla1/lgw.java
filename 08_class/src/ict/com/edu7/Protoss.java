package ict.com.edu7;

// Unit 추상클래스이기 때문에
// 일반 클래스인 Protoss는 반드시 오버라이딩을 해야 한다.

public class Protoss extends Unit {

	public Protoss() {
	}

	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 2;

	}
}
