package hello;

public class Pharmacist {
	
	private long pharmacist_id;
	private long departmentId;
	private String lastName;
	private String firstName;
	private String date_of_birth;
	private int officeNo;
	
	public long getPharmacist_id()
	{
		return pharmacist_id;
	}
	
	public void setPharmacist_id(long pharmacist_id)
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
