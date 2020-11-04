package rpg;

public class Enemy {
	//フィールド生成
	String name;
	int hp;
	int mp;
	int offensivepower;
	int defensepower;

	//戦う
		public void attack(Yuusya y) {
			y.hp -= 10;
			System.out.println(this.name + "の攻撃！");
			System.out.println(y.name + "に10のダメージ\n"
					+ y.name + "の現在のHPは" + y.hp);
			System.out.println();
		}//attack

	//魔法
		public void mera(Yuusya y) {
			y.hp -=20;
			System.out.println(this.name+"はメラを唱えた");
			System.out.println(y.name + "に20のダメージ\n"
					+ y.name + "の現在のHPは" + y.hp);
			System.out.println();
		}

}
