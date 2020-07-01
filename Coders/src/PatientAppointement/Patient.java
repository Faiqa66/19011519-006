package PatientAppointement;

public class Patient {

	private int PATIENT_ID;
	
	private String PATIENT_NAME;
	
	public int getPATIENT_ID() {
		return PATIENT_ID;
	}
	public void setPATIENT_ID(int pATIENT_ID) {
		PATIENT_ID = pATIENT_ID;
	}
	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}
	public void setPATIENT_NAME(String pATIENT_NAME) {
		PATIENT_NAME = pATIENT_NAME;
	}
	
	
	public String toString() {
		String str=null;
		str=this.PATIENT_ID+
		","+this.PATIENT_NAME;
		
		return str;
	}
}
