package hello;

public class Nurse {
	private long nid;
	private String lastName;
	private String firstName;
	private String date_of_birth;
	private long departmentId;
	private int roomNo;
	
	public long getNid()
	{
		return nid;
	}
	
	public void setNid(long nid)
	{
		this.nid = nid;
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

	public int getRoomNo()
	{
		return roomNo;
	}
	
	public void setRoomNo(int roomNo)
	{
		this.roomNo = roomNo;
	}

}
