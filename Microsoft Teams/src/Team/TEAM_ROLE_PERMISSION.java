package Team;

public class TEAM_ROLE_PERMISSION {
   
	TEAM TEAM_ID;
	ROLE ROLE_ID;
	PERMISSION PERMISSION_ID;
	public TEAM getTEAM_ID() {
		return TEAM_ID;
	}
	public void setTEAM_ID(TEAM tEAM_ID) {
		TEAM_ID = tEAM_ID;
	}
	public ROLE getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(ROLE rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public PERMISSION getPERMISSION_ID() {
		return PERMISSION_ID;
	}
	public void setPERMISSION_ID(PERMISSION pERMISSION_ID) {
		PERMISSION_ID = pERMISSION_ID;
	}
	
}
