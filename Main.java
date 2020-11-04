package rpg;

public class Main {

	public static void main(String[] args) {
		//勇者クラスをインスタンス化して使用
		Yuusya y = new Yuusya();
		y.name = "みなと";
		y.hp = 100;
		y.mp = 50;
		y.offensivepower = 10;
		y.defensepower = 10;

		//エネミークラスをインスタンス化して使用
		Enemy e = new Enemy();
		e.name = "スライム";
		e.hp = 100;
		e.mp = 50;
		e.offensivepower = 10;
		e.defensepower = 10;

		System.out.println("戦闘開始！");

		//YuusyaのHPとEnemyのHPが共に残っている場合繰り返す
		while (y.hp > 0 && e.hp > 0) {

			//			for (int turn =0; y.hp > 0 && e.hp > 0;turn++) {

			System.out.println("勇者のターン！コマンドを選べ！");
			System.out.println("0:戦う 1:魔法 ");

			//コマンド選択
			int ycommand = new java.util.Scanner(System.in).nextInt();

			switch (ycommand) {
			case 0:
				y.attack(e);
				break;
			case 1:
				y.mera(e);
				break;
			}//switch

			//敵のターン
			//乱数生成
			int ecommand = new java.util.Random().nextInt(2);//0～1

			//乱数が0かつHPがある場合
			if (ecommand == 0 && e.hp > 0) {
				System.out.println("敵のターン！");
				e.attack(y);

			//乱数が1かつHPがある場合
			} else if (ecommand == 1 && e.hp > 0) {
				System.out.println("敵のターン！");
				e.mera(y);

			//HPが0になった場合
			} else if(e.hp <= 0){
				System.out.println(e.name + "は倒れた！");
			}

		} //while



		//勝ち負け判定
		if(e.hp <= 0 && y.hp > 0) {
			System.out.println(y.name + "の勝ちです！");
		} else {
			System.out.println(y.name + "の負けです…");
			System.out.println("GAMEOVER");
		}

		//		戦闘開始！
		//		自分のターン(Yuusya)
		//		コマンド入力(0.攻撃1.魔法2.逃げる)
		//		自分のターン終わり
		//		敵のターン(Enemy)
		//		ランダムで相手の行動を決める(攻撃＆魔法)
		//		敵のターン終了
		//		これをどちらかのHPがなくなるまで繰り返す
		//		HPが残ってたら勝ち、なくなれば負け
	}//Main

}
