package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	//抽象メソッドに具体的な処理を記述
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}
