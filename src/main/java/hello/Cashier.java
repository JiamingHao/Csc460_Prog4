package hello;

import java.sql.Date;

/*+-----------------------------------------------------------------
||
|| Class Cashier	
||
||	Author: Group members
||
||      Purpose: Receive and transfer the data provided by users
||               on html pages
||	Inherits From: Staff
||	Interfaces: None
|+-------------------------------------------------------------------
||
||	Constants: None
|+-------------------------------------------------------------------
||	Constructors: None
||
||	Class Methods: None
||
||	Inst.Methods: None
||
||
++--------------------------------------------------------------------*/
public class Cashier extends Staff {
    private int eid;
    private String lastName;
    private String firstName;
    private String date_of_birth;
    private int departmentId;
    private int officeNo;
    private int salary;
    private String jobTitle;
    private String gender;
    private String contactNumber;
}
