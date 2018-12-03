package hello;

import java.sql.Date;
/*+-----------------------------------------------------------------
||
|| Class ReceptinistsData
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
||	Constructors: public ReceptionistsData()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/

public class ReceptionistsData {
    private int aid;
    private int pid;
    private int eid;
    private String date;
    
    // Used to record exception info if necessary
    private String errorMsg;
    private String opreationName;

    public ReceptionistsData(){ errorMsg = "No errors occurred.";}
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

    public int getEid()
    {
        return eid;
    }

    public void setEid(int did)
    {
        this.eid = eid;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }
}
