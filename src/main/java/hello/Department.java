package hello;

/*+-----------------------------------------------------------------
||
|| Class Department	
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
||	Constructors: public Department()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Department {
	private int departmentId;
	private String name;
	private String buildingName;
	private int officeNo;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Department(){ errorMsg = "No errors occurred.";};
	
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

    	public int getDepartmentId()
    	{
        	return departmentId;
    	}

    	public void setDepartmentId(int departmentId)
    	{
        	this.departmentId = departmentId;
    	}

    	public String getName()
    	{
        	return name;
    	}

    	public void setName(String name)
    	{
        	this.name = name;
    	}

    	public String getBuildingName()
    	{
        	return buildingName;
    	}

    	public void setBuildingName(String buildingName)
    	{
        	this.buildingName = buildingName;
    	}

    	public int getOfficeNo()
    	{
        	return officeNo;
    	}

    	public void setOfficeNo(int officeNo)
    	{
        	this.officeNo = officeNo;
    	}
}
