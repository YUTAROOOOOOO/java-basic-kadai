package kadai_015;

public class CarExec_Chapter15 {
	
	public static void main(String[] args) {
	
	//車データの生成
	Car_Chapter15 car = new Car_Chapter15(1, 10);
	
	//ギアを3に変更
	car.gearChange(3);
	
	//メソッドrun()を呼び出し
	car.run();
	}
}
