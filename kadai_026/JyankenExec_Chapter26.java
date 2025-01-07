package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
	    // Scannerをここで生成し、一回だけ閉じる
	    Scanner scanner = new Scanner(System.in);
		//じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		//自分のじゃんけんの手を入力
		String user = jyanken.getMyChoice(scanner);
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String opponent = jyanken.getRandom();
		//じゃんけんの結果を出力する
		jyanken.playGame(user, opponent);
		//Scannerをクローズ
		scanner.close();
	}

}
