package hello;
/*+-----------------------------------------------------------------
||
|| Class Query3result	
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
||	Constructors: None
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Query3result {
	private int pid;
	private String lastName;
	private String firstName;
	private int remainDays;
	private int hospitalizedRoomNo;
	private double dueAmount;
	private String fullName;

	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Query3result(){ errorMsg = "No errors occurred.";};
	
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getRemainDays() {
		return remainDays;
	}
	public void setRemainDays(int remainDays) {
		this.remainDays = remainDays;
	}
	public int getHospitalizedRoomNo() {
		return hospitalizedRoomNo;
	}
	public void setHospitalizedRoomNo(int hospitalizedRoomNo) {
		this.hospitalizedRoomNo = hospitalizedRoomNo;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public String getFullName() {return firstName + " " + lastName;}

	public void setErrorMsg(String errorMsg){this.errorMsg = errorMsg;}
	public String getErrorMsg() {return errorMsg;}
	public void setOpreationName(String opreationName){this.opreationName = opreationName;}

}
