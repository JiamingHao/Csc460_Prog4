package hello;

import java.sql.Date;
/*+-----------------------------------------------------------------
||
|| Class Patient	
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
||	Constructors: public Patient()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Patient {

	private int pid;
	private String lastName;
	private String firstName;
	private String gender;
	private String date_of_birth;
	private String address;
	private String contactNumber;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Patient(){errorMsg = "No errors occurred.";};
	
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
	public String getOpreationName() { return opreationName;}
	public int getPid(){
		return pid;
	}
	
	public void setPid(int pid){
		this.pid = pid;
	}
	
	public String getLastName(){
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
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(String date_of_birth)
	{
		this.date_of_birth = date_of_birth;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getContactNumber()
	{
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
}
