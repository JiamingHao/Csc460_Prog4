package hello;

public class Department {
	private int departmentId;
	private String name;
	private String buildingName;
	private int officeNo;
	
	// Used to record exception info if necessary
	private String errorMsg;
	private String opreationName;

	public Department(){ errorMsg = "No errors occurred.";};
	
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
