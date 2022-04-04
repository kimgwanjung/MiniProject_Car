package mini2;
import java.util.*;

public class Programming2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("drive 호출 횟수 =");
		int driveNum = kb.nextInt();
		Ecar.drive(driveNum);
		Ecar car = Ecar.getInstance();
		System.out.printf("주행거리: %dkm 배터리:%d%%",car.dispDistance(),car.dispBattery());
	}
	
}

