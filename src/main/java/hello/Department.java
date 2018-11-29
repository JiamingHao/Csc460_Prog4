package hello;

public class Department {
	private long departmentId;
	private String name;
	private String buildingName;
	private int officeNo;

    public long getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(long departmentId)
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

    public String getBuildName()
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
