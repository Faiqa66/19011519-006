package Team;

public class TEAM {
     
	int TEAM_ID;
	int TEAMTYPE_ID;
	String TEAM_NAME;
	String TEAM_DESCRIPTION;
	String TEAM_IMAGE="\"C:\\Users\\faiqashabbir\\Pictures\\team.png\"";
	String TEAM_CODE;
	public int getTEAM_ID() {
		return TEAM_ID;
	}
	public void setTEAM_ID(int tEAM_ID) {
		TEAM_ID = tEAM_ID;
	}
	public int getTEAMTYPE_ID() {
		return TEAMTYPE_ID;
	}
	public void setTEAMTYPE_ID(int tEAMTYPE_ID) {
		TEAMTYPE_ID = tEAMTYPE_ID;
	}
	public String getTEAM_NAME() {
		return TEAM_NAME;
	}
	public void setTEAM_NAME(String tEAM_NAME) {
		TEAM_NAME = tEAM_NAME;
	}
	public String getTEAM_DESCRIPTION() {
		return TEAM_DESCRIPTION;
	}
	public void setTEAM_DESCRIPTION(String tEAM_DESCRIPTION) {
		TEAM_DESCRIPTION = tEAM_DESCRIPTION;
	}
	public void setTEAM_IMAGE(String tEAM_IMAGE) {
		TEAM_IMAGE = tEAM_IMAGE;
	}
	public String getTEAM_CODE() {
		return TEAM_CODE;
	}
	public void setTEAM_CODE(String tEAM_CODE) {
		TEAM_CODE = tEAM_CODE;
	}
	
	
}
