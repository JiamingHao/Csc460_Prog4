package hello;

public class PharmacistsData {
    private long pharmacistId;
    private long pid;
    private String medicineName;
    private int numberOfDays;

    public long getPharmacistId() { return pharmacistId; }

    public void setPharmacistId(long pharmacistId) { this.pharmacistId = pharmacistId; }

    public long getPid(){
        return pid;
    }

    public void setPid(long pid){
        this.pid = pid;
    }

    public String getMedicineName() { return medicineName; }

    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }

    public int getNumberOfDays() { return numberOfDays; }

    public void setNumberOfDays(int numberOfDays) { this.numberOfDays = numberOfDays; }
}
