package hello;

import java.sql.Date;

public class Pharmacist {
	
	private int pharmacist_id;
	private int departmentId;
	private String lastName;
	private String firstName;
	private String date_of_birth;
	private int officeNo;
	
	public int getPharmacist_id()
	{
		return pharmacist_id;
	}
	
	public void setPharmacist_id(int pharmacist_id)
	{
		this.pharmacist_id = pharmacist_id;
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
