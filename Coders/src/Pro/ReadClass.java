package Pro;

public class ReadClass {
   
	private String name;
	private int roll_name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_name() {
		return roll_name;
	}
	public void setRoll_name(int roll_name) {
		this.roll_name = roll_name;
	}
	public String toString() {
		String str=null;
		str=this.name+
				" "+this.roll_name;
		return str;
		
	}	
}
