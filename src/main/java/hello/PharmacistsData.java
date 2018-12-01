package hello;

public class PharmacistsData {
    private int pharmacistId;
    private int pid;
    private String medicineName;
    private int numberOfDays;

    public int getPharmacistId() { return pharmacistId; }

    public void setPharmacistId(int pharmacistId) { this.pharmacistId = pharmacistId; }

    public int getPid(){
        return pid;
    }

    public void setPid(int pid){
        this.pid = pid;
    }

    public String getMedicineName() { return medicineName; }

    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }

    public int getNumberOfDays() { return numberOfDays; }

    public void setNumberOfDays(int numberOfDays) { this.numberOfDays = numberOfDays; }
}
