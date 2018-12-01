package hello;

import java.sql.Date;

public class Nurse {
	private int nid;
	private String lastName;
	private String firstName;
	private Date date_of_birth;
	private int departmentId;
	private int roomNo;
	
	public int getNid()
	{
		return nid;
	}
	
	public void setNid(int nid)
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

	public int getRoomNo()
	{
		return roomNo;
	}
	
	public void setRoomNo(int roomNo)
	{
		this.roomNo = roomNo;
	}

}
