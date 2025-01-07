package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//HashMapを定義
	private HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	//コンストラクタ
	public Dictionary_Chapter21() {
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウイ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}
	//辞書を調べるメソッド
	public void checkDictionary(String[] check) {
		//check配列の値を順番にkeyに代入
		for(String key : check) {
			//directionMapからkeyと紐づいた値を取得しvalueに代入
			String value = dictionaryMap.get(key);
			//もしvalueの値がnullでなければ出力するメソッド
			if(value != null) {
				System.out.println(key + "の意味は" + value);
			//それ以外であれば出力するメソッド
			} else {
				System.out.println(key + "は辞書に存在しません");
			}
		}
	}
	//拡張for文をfor文に書き換えると
//	public void checkDictionary1(String[] check) {
//		//辞書を調べるメソッド
//		for(int i = 0; i <= check.length; i++) {
//			String value = dictionaryMap.get(check[i]);
//			if(value != null) {
//				System.out.println(check[i] + "の意味は" + value);
//			} else {
//				System.out.println(check[i] + "は辞書に存在しません");
//			}
//		}
//	}
}
