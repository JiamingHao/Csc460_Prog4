package hello;

import java.sql.Date;

public class TreatmentRecord {
	private int aid;
	private int pid;
	private String visitReason;
	private Date visitDate;
	private Date initialHospitalizedDate;
	private Date expectedDischargeDate;
	private Date dischargeDate;
	private int hospitalizedRoomNo;
	private String treatmentMethod;
	private int did;

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

	public Date getVisitReason() { return visitReason; }

	public void setVisitReason(String visitReason) { this.visitReason = visitReason; }

	public Date getVisitDate() { return visitDate; }

	public void setVisitDate(Date visitDate) { this.visitDate = visitDate; }

	public Date getInitialHospitalizedDate() { return initialHospitalizedDate; }

	public void setInitialHospitalizedDate(Date initialHospitalizedDate) { this.initialHospitalizedDate = initialHospitalizedDate; }

	public Date getExpectedDischargeDate() { return expectedDischargeDate; }

	public void setExpectedDischargeDate(Date expectedDischargeDate) { this.expectedDischargeDate = expectedDischargeDate; }

	public Date getDischargeDate() { return dischargeDate; }

	public void setDischargeDate(Date dischargeDate) { this.dischargeDate = dischargeDate; }

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
