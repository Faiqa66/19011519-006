import java.time.LocalDate;
import java.time.ZoneId;
class Hello{
	private static final ZoneId clock = null;

	public static void main(String[] args) {
		LocalDate myDate=LocalDate.now(clock);
		System.out.println(myDate);
	}
}