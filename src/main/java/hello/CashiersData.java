package hello;

import java.sql.Date;

public class CashiersData {
    private int aid;
    private int pid;
    private double dueAmount;
    private Date dueDate;
    private String status;
    private Date paymentDate;
    private int eid;

    public int getAid() { return aid; }

    public void setAid(int aid) { this.aid = aid; }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public double getDueAmount() { return dueAmount; }

    public void setDueAmount(double dueAmount) { this.dueAmount = dueAmount; }

    public Date getDueDate() { return dueDate; }

    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public Date getPaymentDate() { return paymentDate; }

    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int eid)
    {
        this.eid = eid;
    }
}
