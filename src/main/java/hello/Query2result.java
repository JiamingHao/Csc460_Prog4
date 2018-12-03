package hello;
/*+-----------------------------------------------------------------
||
|| Class Query2result
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
||	Constructors: public Query2result()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class Query2result {
    
    private String departmentName; // in department calss it is called "name"
    private int departmentId; // both department and doctor
    private int officeNo;
    private String lastName;
    private String firstName;
    private String buildingName;
    private String fullName;
		
    // Used to record exception info if necessary
    private String errorMsg; 
    private String opreationName;

    public Query2result(){ errorMsg = "No errors occurred.";};
	
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

    public String getDepartmentName()
    {
        return departmentName;
    }
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    public int getDepartmentId()
    {
        return departmentId;
    }
    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
    }
    public int getOfficeNo()
    {
        return officeNo;
    }
    public void setOfficeNo(int officeNo)
    {
        this.officeNo = officeNo;
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
    public String getBuildingName()
    {
        return buildingName;
    }
    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }
    
    public void setErrorMsg(String errorMsg){this.errorMsg = errorMsg;}
    public String getErrorMsg() {return errorMsg;} 
    public void setOpreationName(String opreationName){this.opreationName = opreationName;}

    public String getFullName() {return firstName + " " + lastName;}
}
