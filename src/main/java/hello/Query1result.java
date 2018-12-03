package hello;

/*+-----------------------------------------------------------------
||
|| Class Query1result	
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
||	Constructors: public Query1result()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Query1result {
	private int pid;
	private String firstName;
	private String lastName;
	private String gender;
	private String date_of_birth;
	private String visitDate;
	private String visitReason;
	private String treatmentMethod;
	private int did;
	private String fullName;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Query1result(){ errorMsg = "No errors occurred.";};
	
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
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getVisitReason() {
		return visitReason;
	}
	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}
	public String getTreatmentMethod() {
		return treatmentMethod;
	}
	public void setTreatmentMethod(String treatmentMethod) {
		this.treatmentMethod = treatmentMethod;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}

	public String getFullName()
	{
		return this.firstName + " " + this.lastName;
	}	
	
	
}
