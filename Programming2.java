package mini2;
import java.util.*;

public class Programming2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("drive ȣ�� Ƚ�� =");
		int driveNum = kb.nextInt();
		Ecar.drive(driveNum);
		Ecar car = Ecar.getInstance();
		System.out.printf("����Ÿ�: %dkm ���͸�:%d%%",car.dispDistance(),car.dispBattery());
	}
	
}

