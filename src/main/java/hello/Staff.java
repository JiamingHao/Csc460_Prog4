package hello;

import java.sql.Date;

public class Staff {
	private int eid;
	private String lastName;
	private String firstName;
	private Date date_of_birth;
	private int departmentId;
	private int officeNo;
	private int salary;
	private String jobTitle;
	private String gender;
	private int contactNumber;
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEid(int eid)
	{
		this.eid = eid;
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
	
	public int getSalary()
	{	
		return salary;
	}

	public void setSalary(int salary)
	{	
		this.salary = salary;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;	
	}

	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public int getContactNumber()
	{
		return contactNumber;
	}
	
	public void setContactNumber(int contactNumber)
	{
		this.contactNumber = contactNumber;
	}

}
