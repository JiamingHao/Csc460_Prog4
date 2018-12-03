package hello;

import java.sql.Date;
/*+-----------------------------------------------------------------
||
|| Class Nurse	
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
||	Constructors: public Nurse()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Nurse {
	private int nid;
	private String lastName;
	private String firstName;
	private String date_of_birth;
	private int departmentId;
	private int roomNo;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Nurse(){errorMsg = "No errors occurred.";};
	
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
	
	public int getNid()
	{
		return nid;
	}
	
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(String date_of_birth)
	{
		this.date_of_birth = date_of_birth;
	}
	
	public int getDepartmentId()
	{
		return departmentId;
	}
	

	public void setDepartmentId(int departmentId)
	{
		this.departmentId = departmentId;	
	}

	public int getRoomNo()
	{
		return roomNo;
	}
	
	public void setRoomNo(int roomNo)
	{
		this.roomNo = roomNo;
	}

}
