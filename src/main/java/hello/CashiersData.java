package hello;

import java.sql.Date;

/*+-----------------------------------------------------------------
||
|| Class CashiersData	
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
||	Constructors: public CashiersData()
||
||	Class Methods: None
||
||	Inst.Methods: Group of setter and getter methods
||
||
++--------------------------------------------------------------------*/
public class CashiersData {
    private int aid;
    private int pid;
    private double dueAmount;
    private String dueDate;
    private String status;
    private String paymentDate;
    private int eid;
	
    // Used to record exception info if necessary
    private String errorMsg;
    private String opreationName;

    public CashiersData(){ errorMsg = "No errors occurred.";};
	
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

    public int getAid() { return aid; }

    public void setAid(int aid) { this.aid = aid; }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public double getDueAmount() { return dueAmount; }

    public void setDueAmount(double dueAmount) { this.dueAmount = dueAmount; }

    public String getDueDate() { return dueDate; }

    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getPaymentDate() { return paymentDate; }

    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int eid)
    {
        this.eid = eid;
    }
}
