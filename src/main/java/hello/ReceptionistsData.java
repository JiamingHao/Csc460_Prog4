package hello;

public class ReceptionistsData {
	private long aid;
    private long pid;
    private long eid;
    private String date;

    public long getAid(){
        return aid;
    }

    public void setAid(long aid){
        this.aid = aid;
    }

    public long getPid(){
        return pid;
    }

    public void setPid(long pid){
        this.pid = pid;
    }

    public long getEid()
    {
        return eid;
    }

    public void setEid(long did)
    {
        this.eid = eid;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }
}
