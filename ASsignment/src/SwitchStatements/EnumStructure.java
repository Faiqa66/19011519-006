package SwitchStatements;

public class EnumStructure {
public enum day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    
public static void main(String[] args) {
	day[] DayNow=day.values();
	for(day now:DayNow) {
		switch(now) {
		case Sun:
			System.out.println("Sunday!");
			break;
		case Mon:
			System.out.println("Monday!");
			break;
		case Tue:
			System.out.println("Tuesday!");
			break;
		case Wed:
			System.out.println("Wednesday!");
			break;
		case Thu:
			System.out.println("Thursday!");
			break;
		case Fri:
			System.out.println("Friday!");
			break;
		case Sat:
			System.out.println("Saturday!");
			break;
		}
	}
}
}
