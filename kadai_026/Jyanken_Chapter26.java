package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice(Scanner scanner) {
		String input = "";
			//入力を促す
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
		while(true) {
			//入力した内容を取得
			input = scanner.nextLine();
			//equalsメソッドを使い、inputと文字列が等しいか判定し、正しいじゃんけんの手かを判定
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				//入力した内容を出力
				System.out.println(input);
				break;
				} else {
					System.out.println("じゃんけんの手が正しくありません。再度じゃんけんの手を選んでください");
				}
		}
		//入力を返す
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		//相手のじゃんけんの手を配列にセット
		String[] opponentChoice = {"r", "s", "p"};
		//opponentChoice配列からランダムに相手のじゃんけんの手を選び、randomに代入
		int random =  (int) Math.floor(Math.random() * 3);
		//相手のじゃんけんの手を返す
		return opponentChoice[random];
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String user, String opponent) {
		//じゃんけんの手のHashMapを生成
		HashMap<String, String> janken = new HashMap<String, String>();
		//要素を追加
		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");
		//自分と相手のじゃんけんの手を出力
		System.out.println("自分の手は" + janken.get(user) + ",対戦相手の手は" + janken.get(opponent));
		//自分と相手のじゃんけんの比較
		//あいこ
		if(user.equals(opponent)) {
			System.out.println("あいこです");
			//自分が勝ち
		} else if(user.equals("r") && opponent.equals("s") || user.equals("s") && opponent.equals("p") || user.equals("p") && opponent.equals("r")) {
			System.out.println("自分の勝ちです");
			//自分が負け
		} else {
			System.out.println("自分の負けです");
		}
	}
}
