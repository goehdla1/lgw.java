package ict.com.edu7;

// Unit �߻�Ŭ�����̱� ������
// �Ϲ� Ŭ������ Protoss�� �ݵ�� �������̵��� �ؾ� �Ѵ�.

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
