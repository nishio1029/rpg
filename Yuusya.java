package rpg;

public class Yuusya {
	//フィールド生成
	String name;
	int hp;
	int mp;
	int offensivepower;
	int defensepower;

	//戦う
	public void attack(Enemy e) {
		e.hp -= 10;
		System.out.println(this.name + "の攻撃！");
		System.out.println(e.name + "に10のダメージ\n"
				+ e.name + "の現在のHPは" + e.hp);
		System.out.println();
	}//attack

	//魔法
	public void mera(Enemy e) {
		e.hp -=20;
		System.out.println(this.name+"はメラを唱えた");
		System.out.println(e.name + "に20のダメージ\n"
				+ e.name + "の現在のHPは" + e.hp);
		System.out.println();
	}
}
