package hello;

import java.sql.Date;

public class Doctor {
	private int did;
	private String lastName;
	private String firstName;
	private Date date_of_birth;
	private String status;
	private int departmentId;
	private int officeNo;
	
	public int getDid()
	{
		return did;
	}
	
	public void setDid(int did)
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
	
	public Date getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(Date date_of_birth)
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

}
