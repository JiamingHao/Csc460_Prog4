package hello;

public class TreatmentRecord {
	private long aid;
	private long pid;
	private String visitReason;
	private String visitDate;
	private String initialHospitalizedDate;
	private String expectedDischargeDate;
	private String dischargeDate;
	private int hospitalizedRoomNo;
	private String treatmentMethod;
	private long did;

	public long getAid(){
		return aid;
	}

	public void setAid(long aid){
		this.aid = aid;
	}

	public long getPid(){
		return pid;
	}

	public void setPid(long pid){
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

	public long getDid()
	{
		return did;
	}

	public void setDid(long did)
	{
		this.did = did;
	}
}