
public class Time {
	private long hour;
	private long minute;
	private long second;
	
	Time() {
	long totalmilliseconds = System.currentTimeMillis();
	long totalSeconds = totalmilliseconds / 1000;
	second = totalSeconds % 60;
	long totalMinutes = totalSeconds / 60;
	minute = totalMinutes % 60;
	long totalHours = totalMinutes / 60;
	hour = totalHours % 24;
	}
	


	public  Time(long elapseTime) {
		setTime(elapseTime);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
}
	public long getHour() {
		return hour;
	}


	public long getMinute() {
		return minute;
	}


	public long getSecond() {
		return second;
	}

	
	public void setTime(long elapseTime) {
		long totalMilliseconds =  elapseTime;
		long totalSeconds = totalMilliseconds / 1000;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

}
}
