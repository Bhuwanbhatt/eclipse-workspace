
public class TestTime {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(555550000);

		// Display Time objects hour, minute, and 
		// second in the format hour:minute:second 
		if (t1.getHour()<5)
		System.out.println(t1.getHour()+19 + ":" + t1.getMinute() + ":" + t1.getSecond());
		else
			System.out.println(t1.getHour()-5 + ":" + t1.getMinute() + ":" + t1.getSecond());
		System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2. getSecond());
			
	}

}
