package GenericUtility;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class JavaUtility {
	public void date() {
		LocalDate l = LocalDate.now();
		int dm = l.getDayOfMonth();
		DayOfWeek dw = l.getDayOfWeek();
		int dy = l.getDayOfYear();
		System.out.println(dm);
		System.out.println(dw);
		System.out.println(dy);
	}
	public void random() {
		Random random = new Random();
		int low=3;
		int high=20;
			int num = random.nextInt(high-low)+low;
			System.out.println(num);
	}
	
}



