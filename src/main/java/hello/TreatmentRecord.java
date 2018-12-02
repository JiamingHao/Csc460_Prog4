package hello;

import java.sql.Date;

public class TreatmentRecord {
	private int aid;
	private int pid;
	private String visitReason;
	private String visitDate;
	private String initialHospitalizedDate;
	private String expectedDischargeDate;
	private String dischargeDate;
	private int hospitalizedRoomNo;
	private String treatmentMethod;
	private int did;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public TreatmentRecord(){errorMsg = "No errors occurred.";};
	
	public void setErrorMsg(String errorMsg){this.errorMsg = errorMsg;}
	public String getErrorMsg() {return errorMsg;} 
	public void setOpreationName(String opreationName){this.opreationName = opreationName;}

	public int getAid(){
		return aid;
	}

	public void setAid(int aid){
		this.aid = aid;
	}

	public int getPid(){
		return pid;
	}

	public void setPid(int pid){
		this.pid = pid;
	}

	public String getVisitReason() { return visitReason; }

	public void setVisitReason(String visitReason) { this.visitReason = visitReason; }

	public String getVisitDate() { return visitDate; }

	public void setVisitDate(String visitDate) { this.visitDate = visitDate; }

	public String getInitialHospitalizedDate() { return initialHospitalizedDate; }

	public void setInitialHospitalizedDate(String initialHospitalizedDate) { this.initialHospitalizedDate = initialHospitalizedDate; }

	public String getExpectedDischargeDate() { return expectedDischargeDate; }

	public void setExpectedDischargeDate(String expectedDischargeDate) { this.expectedDischargeDate = expectedDischargeDate; }

	public String getDischargeDate() { return dischargeDate; }

	public void setDischargeDate(String dischargeDate) { this.dischargeDate = dischargeDate; }

	public int getHospitalizedRoomNo() { return hospitalizedRoomNo; }

	public void setHospitalizedRoomNo(int hospitalizedRoomNo) { this.hospitalizedRoomNo = hospitalizedRoomNo; }

	public String getTreatmentMethod() { return treatmentMethod; }

	public void setTreatmentMethod(String treatmentMethod) { this.treatmentMethod = treatmentMethod; }

	public int getDid()
	{
		return did;
	}

	public void setDid(int did)
	{
		this.did = did;
	}
}
