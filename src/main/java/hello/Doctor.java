package hello;

public class Doctor {
	private long did;
	private String lastName;
	private String firstName;
	private String date_of_birth;
	private String status;
	private long departmentId;
	private int officeNo;
	
	public long getDid()
	{
		return did;
	}
	
	public void setDid(long did)
	{
		this.did = did;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(String date_of_birth)
	{
		this.date_of_birth = date_of_birth;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public long getDepartmentId()
	{
		return departmentId;
	}

	public void setDepartmentId(long departmentId)
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

}
