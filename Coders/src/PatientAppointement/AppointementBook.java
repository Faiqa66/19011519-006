package PatientAppointement;

public class AppointementBook {

	private int DEPATEMENT_ID;
	
	private String DEPARTEMENT_NAME;
	
	private String APPOINTEMENT_DATE;
	
	private String APPOINTEMENT_TIME;
	

	public int getDEPATEMENT_ID() {
		return DEPATEMENT_ID;
	}
	public void setDEPATEMENT_ID(int dEPATEMENT_ID) {
		DEPATEMENT_ID = dEPATEMENT_ID;
	}
	public String getDEPARTEMENT_NAME() {
		return DEPARTEMENT_NAME;
	}
	public void setDEPARTEMENT_NAME(String dEPARTEMENT_NAME) {
		DEPARTEMENT_NAME = dEPARTEMENT_NAME;
	}
	public String getAPPOINTEMENT_DATE() {
		return APPOINTEMENT_DATE;
	}
	public void setAPPOINTEMENT_DATE(String aPPOINTEMENT_DATE) {
		APPOINTEMENT_DATE = aPPOINTEMENT_DATE;
	}
	public String getAPPOINTEMENT_TIME() {
		return APPOINTEMENT_TIME;
	}
	public void setAPPOINTEMENT_TIME(String aPPOINTEMENT_TIME) {
		APPOINTEMENT_TIME = aPPOINTEMENT_TIME;
	}
	
	public String toString() {
		String str=null;
		
		str=this.DEPATEMENT_ID+
		","+this.DEPARTEMENT_NAME+
		","+this.APPOINTEMENT_DATE+
		","+this.APPOINTEMENT_TIME;
		return str;
	}
	
}
