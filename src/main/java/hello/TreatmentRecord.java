package hello;

import java.sql.Date;
/*+-----------------------------------------------------------------
||
|| Class TreatmentRecord	
||
||	Author: Group members
||
||      Purpose: Receive and transfer the data provided by users
||               on html pages
||	Inherits From: None
||	Interfaces: None
|+-------------------------------------------------------------------
||
||	Constants: None
|+-------------------------------------------------------------------
||	Constructors: public TreatmentRecord()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

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
	/*--------------------------------------------------------------
	| Group of getter and setter methods
	| 
	| Purpose: Provide access to the fields of the object
	|          to methods defined in the controlled and
	|          on the web pages.
	|
	| Pre-condition:  For non-static method, methods depend
	|                 on instances of objects
	| Post-condition: Changed the fields in the object or
	|                 get desired fileds
	| Parameters:     No parameters required for getter
	|                 Corresponding values are required for setters
        *----------------------------------------------------------------*/
	
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
