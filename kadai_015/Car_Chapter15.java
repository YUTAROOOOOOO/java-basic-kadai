package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 0;
	private int speed = 0;
	
	//コンストラクタ（初期化）
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//ギアの値の表示とギアの値によって速度を変えるメソッド
	public void gearChange(int afterGear) {
		int newGear = afterGear;
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		System.out.println("ギア" + gear + "から" + newGear + "に切り替えました");
	}
	
	//ギアチェンジ後の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}