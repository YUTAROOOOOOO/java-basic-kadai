package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	//名を表すフィールドの値をセット
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	//抽象メソッドに具体的な処理を記述
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
