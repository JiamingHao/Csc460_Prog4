package hello;

import java.sql.Date;

public class Patient {

	private int pid;
	private String lastName;
	private String firstName;
	private String gender;
	private Date date_of_birth;
	private String address;
	private String contactNumber;


	public int getPid(){
		return pid;
	}
	
	public void setPid(int pid){
		this.pid = pid;
	}
	
	public String getLastName(){
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
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public Date getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(Date date_of_birth)
	{
		this.date_of_birth = date_of_birth;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getContactNumber()
	{
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
}
