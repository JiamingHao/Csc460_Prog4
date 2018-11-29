package hello;

public class Room {
	private int roomNo;
	private String buildingName;
	private String type;
	private int capacity;

	public int getRoomNo()
    {
        return roomNo;
    }

    public void setRoomNo(int roomNo)
    {
        this.roomNo = roomNo;
    }

    public String getBuildName()
    {
        return buildingName;
    }

    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

}
