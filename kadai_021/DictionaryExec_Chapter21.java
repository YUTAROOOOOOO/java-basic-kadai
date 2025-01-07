package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {
	public static void main(String[] args) {
		//インスタンス
		DictionaryExec_Chapter21 dictionary = new DictionaryExec_Chapter21();
		
		//調べる英単語を配列にセット
		String[] check = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べるメソッドの呼び出し
		dictionary.checkDictionary(check);
	
	}
	
}
