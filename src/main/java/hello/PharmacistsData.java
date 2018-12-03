package hello;
/*+-----------------------------------------------------------------
||
|| Class PharmacistsData
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
||	Constructors: public PharmacistsData()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class PharmacistsData {
    private int pharmacistId;
    private int pid;
    private String medicineName;
    private int numberOfDays;
    
    // Used to record exception info if necessary
    private String errorMsg;
    private String opreationName;

    public PharmacistsData(){ errorMsg = "No errors occurred.";}
	
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

    public int getPharmacistId() { return pharmacistId; }

    public void setPharmacistId(int pharmacistId) { this.pharmacistId = pharmacistId; }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public String getMedicineName() { return medicineName; }

    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }

    public int getNumberOfDays() { return numberOfDays; }

    public void setNumberOfDays(int numberOfDays) { this.numberOfDays = numberOfDays; }
}
