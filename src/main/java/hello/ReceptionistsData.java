package hello;

import java.sql.Date;

public class ReceptionistsData {
    private int aid;
    private int pid;
    private int eid;
    private String date;

    public int getAid(){
        return aid;
    }

    public void setAid(int aid){
        this.aid = aid;
    }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int did)
    {
        this.eid = eid;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }
}
