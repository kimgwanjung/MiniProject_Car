package mini2;

public class Ecar {
	static int cnt =0;
	public static void drive(int s) {
		cnt = s;
	}
	public static int dispDistance() {
		return cnt;
	}
	public static int dispBattery() {
		return 100-cnt*10;
	}
	public static Ecar getInstance() {
		return null;
	}

}
