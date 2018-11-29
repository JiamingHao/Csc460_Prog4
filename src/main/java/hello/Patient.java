package hello;

public class Patient {

	private long pid;
	private String lastName;
	private String firstName;
	private String gender;
	private String date_of_birth;
	private String address;
	private int contactNumber;


	public long getPid(){
		return pid;
	}
	
	public void setPid(long pid){
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
	
	public String getDate_of_birth()
	{
		return this.date_of_birth;
	}
	
	public void setDate_of_birth(String date_of_birth)
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
	
	public int getContactNumber()
	{
		return contactNumber;
	}
	
	public void setContactNumber(int contactNumber)
	{
		this.contactNumber = contactNumber;
	}
}
