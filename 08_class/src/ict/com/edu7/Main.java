package ict.com.edu7;

public class Main {
	public static void main(String[] args) {
		Unit p = new Protoss("����", 100, false);
		Zerg z = new Zerg("�����", 80, false);
		Terran t = new Terran("���̽�", 70, true);

		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);
		p.decEnergy();
		System.out.println(p.name + ":" + p.energy);

		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);
		z.decEnergy();
		System.out.println(z.name + ":" + z.energy);

		t.decEnergy();
		System.out.println(t.name + ":" + t.energy);
		p.decEnergy();
		System.out.println(t.name + ":" + t.energy);

	}
}
