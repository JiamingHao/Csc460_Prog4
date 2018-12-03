package hello;
/*+-----------------------------------------------------------------
||
||   Class Building	
||
||	Author: Group members
||
||      Purpose: Receive and transfer the data provided by users
||               on html pages
||	Inherits From: None
||      Interfaces: None
|+-------------------------------------------------------------------
||
||      Constants: None
|+-------------------------------------------------------------------
||      Constructors: public Building()
||
||      Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Building {
	
	private String name;
	private String address;
	
	// Used to record exception info if necessary
	private String errorMsg;
	// Record the name of the opreation casuing the exception
	private String opreationName;
	
	// set the default value of errorMsg once the object is created
	public Building(){ errorMsg = "No errors occurred.";};
	
	
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
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}

}
