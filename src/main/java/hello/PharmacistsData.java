package hello;

public class PharmacistsData {
    private int pharmacistId;
    private int pid;
    private String medicineName;
    private int numberOfDays;
    
    // Used to record exception info if necessary
    private String errorMsg;
    private String opreationName;

    public PharmacistsData(){ errorMsg = "No errors occurred.";};
	
    public void setErrorMsg(String errorMsg){this.errorMsg = errorMsg;}
    public String getErrorMsg() {return errorMsg;} 
    public void setOpreationName(String opreationName){this.opreationName = opreationName;}

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
