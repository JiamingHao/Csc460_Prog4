package hello;

public class CashiersData {
	private long recordId;
    private long pid;
    private double dueAmount;
    private String dueDate;
    private String status;
    private String paymentDate;
    private long eid;

    public long getRecordId() { return recordId; }

    public void setRecordId(long recordId) { this.recordId = recordId; }

    public long getPid(){
        return pid;
    }

    public void setPid(long pid){
        this.pid = pid;
    }

    public double getDueAmount() { return dueAmount; }

    public void setDueAmount(double dueAmount) { this.dueAmount = dueAmount; }

    public String getDueDate() { return dueDate; }

    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getPaymentDate() { return paymentDate; }

    public void setPaymentDate(String paymentDate) { this.paymentDate = paymentDate; }

    public long getEid()
    {
        return eid;
    }

    public void setEid(long did)
    {
        this.eid = eid;
    }
}
