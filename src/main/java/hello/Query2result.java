package hello;

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
