package kadai_015;

public class Car_Chapter15 {

	public static void main(String[] args) {
		
		//車データの生成
		CarExec_Chapter15 car = new CarExec_Chapter15(1, 10);
		
		car.gearChange(3);
		car.run();
	}
}
