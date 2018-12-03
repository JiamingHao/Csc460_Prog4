package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class WebController {

  @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    /*
     * Prefix below is used to specify the table
     * owner when writing queries. 
    */
    private String prefix;

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
	prefix = "dmcccccc";
    }

    @GetMapping("/addPatient")
    public String patientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "addPatient";
    }

    @PostMapping("/addPatient")
    public String patientSubmit(@ModelAttribute Patient patient) {
	try{
        jdbcTemplate.update("insert into " + prefix + ".patient (pid, lastName, firstName, gender, date_of_birth, address, contactNumber) values (?, ?, ?, ?, to_date(?,'YYYY-MM-DD'), ?, ?)", patient.getPid(), patient.getLastName(), patient.getFirstName(), patient.getGender(), patient.getDate_of_birth(), patient.getAddress(), patient.getContactNumber());
	} catch (RuntimeException e)
	{	
		/*
		* Pass the error message to the attribute
		* object as record.
		*/
		patient.setErrorMsg(e.getMessage());
		patient.setOpreationName("addPatient");
	}

        return "resultPatient";
    }

    @GetMapping("/deletePatient")
    public String deletePatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "deletePatient";
    }

    @PostMapping("/deletePatient")
    public String deletePatientSubmit(@ModelAttribute Patient patient) {
	try{
        jdbcTemplate.update("delete from " + prefix + ".patient where pid = ?", patient.getPid());
	} catch (RuntimeException e)
	{	
		patient.setErrorMsg(e.getMessage());
		patient.setOpreationName("deletePatient");
	}

        return "deletePatientResult";
    }

    @GetMapping("/updatePatient")
    public String updatePatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "updatePatient";
    }

    @PostMapping("/updatePatient")
    public String updatePatientSubmit(@ModelAttribute Patient patient) {
	try{
        jdbcTemplate.update("update " + prefix + ".patient set lastName = ?, firstName = ?, gender = ?, address = ?, contactNumber = ? where pid = ?", patient.getLastName(), patient.getFirstName(), patient.getGender(), patient.getAddress(), patient.getContactNumber(), patient.getPid());
	} catch (RuntimeException e)
	{	
		patient.setErrorMsg(e.getMessage());
		patient.setOpreationName("updatePatient");
	}
	
        return "updatePatientResult";
    }



    @GetMapping("/addDoctor")
    public String doctorForm(Model model){
    model.addAttribute("doctor", new Doctor());
    return "addDoctor";
    }

    @PostMapping("/addDoctor")
    public String doctorSubmit(@ModelAttribute Doctor doctor) {
	try{
        jdbcTemplate.update("insert into " + prefix + ".doctor values (?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?)", doctor.getDid(), doctor.getLastName(), doctor.getFirstName(), doctor.getDate_of_birth(), doctor.getStatus(), doctor.getDepartmentId(), doctor.getOfficeNo());
	} catch (RuntimeException e)
	{	
		doctor.setErrorMsg(e.getMessage());
		doctor.setOpreationName("addDoctor");
	}
    return "resultDoctor";
    }

    @GetMapping("/deleteDoctor")
    public String deleteDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "deleteDoctor";
    }

    @PostMapping("/deleteDoctor")
    public String deleteDoctorSubmit(@ModelAttribute Doctor doctor) {
	try{
        jdbcTemplate.update("delete from " + prefix + ".doctor where did = ?", doctor.getDid());
	} catch (RuntimeException e)
	{	
		doctor.setErrorMsg(e.getMessage());
		doctor.setOpreationName("deleteDoctor");
	}
        return "deleteDoctorResult";
    }

    @GetMapping("/updateDoctor")
    public String updateDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "updateDoctor";
    }

    @PostMapping("/updateDoctor")
    public String updateDoctorSubmit(@ModelAttribute Doctor doctor) {
	try{
        jdbcTemplate.update("update " + prefix + ".doctor set lastName = ?, firstName = ?, status = ?, departmentId = ?, officeNo = ? where did = ?", doctor.getLastName(), doctor.getFirstName(), doctor.getStatus(), doctor.getDepartmentId(), doctor.getOfficeNo(), doctor.getDid());
	} catch (RuntimeException e)
	{	
		doctor.setErrorMsg(e.getMessage());
		doctor.setOpreationName("updateDoctor");
	}
        return "updateDoctorResult";
    }



    @GetMapping("/addNurse")
    public String nurseForm(Model model){
    model.addAttribute("nurse", new Nurse());
    return "addNurse";
    }

    @PostMapping("/addNurse")
    public String nurseSubmit(@ModelAttribute Nurse nurse) {
	try{
        jdbcTemplate.update("insert into " + prefix + ".nurse values (?,?,?,to_date(?,'YYYY-MM-DD'),?,?)", nurse.getNid(), nurse.getLastName(), nurse.getFirstName(), nurse.getDate_of_birth(), nurse.getDepartmentId(), nurse.getRoomNo());
	} catch (RuntimeException e)
	{	
		nurse.setErrorMsg(e.getMessage());
		nurse.setOpreationName("addNurse");
	}
    return "resultNurse";
    }

    @GetMapping("/deleteNurse")
    public String deleteNurseForm(Model model) {
        model.addAttribute("nurse", new Nurse());
        return "deleteNurse";
    }

    @PostMapping("/deleteNurse")
    public String deleteNurseSubmit(@ModelAttribute Nurse nurse) {
	try{
        jdbcTemplate.update("delete from " + prefix + ".nurse where nid = ?", nurse.getNid());
	} catch (RuntimeException e)
	{	
		nurse.setErrorMsg(e.getMessage());
		nurse.setOpreationName("deleteNurse");
	}
        return "deleteNurseResult";
    }

    @GetMapping("/updateNurse")
    public String updateNurseForm(Model model) {
        model.addAttribute("nurse", new Nurse());
        return "updateNurse";
    }

    @PostMapping("/updateNurse")
    public String updateNurseSubmit(@ModelAttribute Nurse nurse) {
	try{
        jdbcTemplate.update("update " + prefix + ".nurse set lastName = ?, firstName = ?, status = ?, departmentId = ?, roomNo = ? where nid = ?", nurse.getLastName(), nurse.getFirstName(), nurse.getDepartmentId(), nurse.getRoomNo(), nurse.getNid());
	} catch (RuntimeException e)
	{	
		nurse.setErrorMsg(e.getMessage());
		nurse.setOpreationName("updateNurse");
	}
        return "updateNurseResult";
    }

    @GetMapping("/addStaff")
    public String staffForm(Model model){
    model.addAttribute("staff", new Staff());
    return "addStaff";
    }

    @PostMapping("/addStaff")
    public String staffSubmit(@ModelAttribute Staff staff) {
	try{
        jdbcTemplate.update("insert into " + prefix + ".staff values (?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?,?,?,?)", staff.getEid(), staff.getLastName(), staff.getFirstName(), staff.getDate_of_birth(), staff.getDepartmentId(), staff.getOfficeNo(), staff.getSalary(), staff.getJobTitle(), staff.getGender(), staff.getContactNumber());
	} catch (RuntimeException e)
	{	
		staff.setErrorMsg(e.getMessage());
		staff.setOpreationName("addStaff");
	}
    return "resultStaff";
    }

    @GetMapping("/deleteStaff")
    public String deleteStaffForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "deleteStaff";
    }

    @PostMapping("/deleteStaff")
    public String deleteStaffSubmit(@ModelAttribute Staff staff) {
	try{
        jdbcTemplate.update("delete from " + prefix + ".staff where eid = ?", staff.getEid());
	} catch (RuntimeException e)
	{	
		staff.setErrorMsg(e.getMessage());
		staff.setOpreationName("deleteStaff");
	}
        return "deleteStaffResult";
    }

    @GetMapping("/updateStaff")
    public String updateStaffForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "updateStaff";
    }

    @PostMapping("/updateStaff")
    public String updateStaffSubmit(@ModelAttribute Staff staff) {
	try{
        jdbcTemplate.update("update " + prefix + ".staff set lastName = ?, firstName = ?,  departmentId = ?, officeNo = ?, salary = ?, jobTitle = ?, gender = ?, contactNumber = ? where eid = ?", staff.getLastName(), staff.getFirstName(), staff.getDepartmentId(), staff.getOfficeNo(), staff.getSalary(), staff.getJobTitle(), staff.getGender(), staff.getContactNumber(), staff.getEid());
	} catch (RuntimeException e)
	{	
		staff.setErrorMsg(e.getMessage());
		staff.setOpreationName("updateStaff");
	}
        return "updateStaffResult";
    }
    
    @GetMapping("/addPharmacist")
    public String pharmacistForm(Model model){
    model.addAttribute("pharmacist", new Pharmacist());
    return "addPharmacist";
    }

    @PostMapping("/addPharmacist")
    public String pharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
	try{
        jdbcTemplate.update("insert into " + prefix + ".pharmacist values (?,?,?,?,to_date(?,'YYYY-MM-DD'),?)", pharmacist.getPharmacist_id(), pharmacist.getDepartmentId(), pharmacist.getLastName(), pharmacist.getFirstName(), pharmacist.getDate_of_birth(), pharmacist.getOfficeNo());
	} catch (RuntimeException e)
	{	
		pharmacist.setErrorMsg(e.getMessage());
		pharmacist.setOpreationName("addPharmacist");
	}
    return "resultPharmacist";
    }

    @GetMapping("/deletePharmacist")
    public String deletePharmacistForm(Model model) {
        model.addAttribute("pharmacist", new Pharmacist());
        return "deletePharmacist";
    }

    @PostMapping("/deletePharmacist")
    public String deletePharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
	try{
        jdbcTemplate.update("delete from " + prefix + ".pharmacist where pharamacist_id = ?", pharmacist.getPharmacist_id());
	} catch (RuntimeException e)
	{	
		pharmacist.setErrorMsg(e.getMessage());
		pharmacist.setOpreationName("deletePharmacist");
	}
        return "deletePharmacistResult";
    }
    
    @GetMapping("/updatePharmacist")
    public String updatePharmacistForm(Model model) {
        model.addAttribute("pharmacist", new Pharmacist());
        return "updatePharmacist";
    }
    
    @PostMapping("/updatePharmacist")
    public String updatePharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
	try{
        jdbcTemplate.update("update " + prefix + ".pharmacist set lastName = ?, firstName = ?, departmentId = ?, officeNo = ? where pharamacist_id = ?", pharmacist.getLastName(), pharmacist.getFirstName(), pharmacist.getDepartmentId(), pharmacist.getDate_of_birth(), pharmacist.getOfficeNo(), pharmacist.getPharmacist_id());
	} catch (RuntimeException e)
	{	
		pharmacist.setErrorMsg(e.getMessage());
		pharmacist.setOpreationName("updatePharmacist");
	}
        return "updatePharmacistResult";
    }

    /* TODO add&update patient treatment record.
    When adding PID, appointment number, reason of visit, and date of visit cannot be left as blank.
    When updating, everything can be updated except the PID, appointment number, reason of visit, and the date of visit.
    */


    @GetMapping("/addTreatmentRecord")
    public String addTreatmentForm(Model model){
	model.addAttribute("treatmentRecord", new TreatmentRecord());
	return "addTreatmentRecord";
    }

    @PostMapping("/addTreatmentRecord")
    public String treatmentSubmit(@ModelAttribute TreatmentRecord  treatmentRecord) {
	// TODO add db query here.
	try{
    	jdbcTemplate.update("insert into " + prefix + ".treatmentRecord values (?,?,?,to_date(?,'YYYY-MM-DD'),to_date(?,'YYYY-MM-DD'),to_date(?,'YYYY-MM-DD'),to_date(?,'YYYY-MM-DD'),?,?,?)", treatmentRecord.getAid(), treatmentRecord.getPid(), treatmentRecord.getVisitReason(), treatmentRecord.getVisitDate(), treatmentRecord.getInitialHospitalizedDate(), treatmentRecord.getExpectedDischargeDate(), treatmentRecord.getDischargeDate(), treatmentRecord.getHospitalizedRoomNo(), treatmentRecord.getTreatmentMethod(), treatmentRecord.getDid());
	} catch (RuntimeException e)
	{	
		treatmentRecord.setErrorMsg(e.getMessage());
		treatmentRecord.setOpreationName("addTreatmentRecord");
	}
 	return "resultTreatmentRecord";
    }
    
    @GetMapping("/updateTreatmentRecord")
    public String updateTreatmentForm(Model model){
	model.addAttribute("treatmentRecord", new TreatmentRecord());
	return "updateTreatmentRecord";
    }
    
    @PostMapping("/updateTreatmentRecord")
    public String updateTreatmentSubmit(@ModelAttribute TreatmentRecord  treatmentRecord) {
	// TODO add db query here.
	try{
    	jdbcTemplate.update("update " + prefix + ".treatmentRecord set initialHospitalizedDate = to_date(?,'YYYY-MM-DD'), expectedDischargeDate = to_date(?,'YYYY-MM-DD'), dischargeDate = to_date(?,'YYYY-MM-DD'), hospitalizedRoomNo = ?, treatmentMethod = ?, did = ? where aid = ?", treatmentRecord.getInitialHospitalizedDate(), treatmentRecord.getExpectedDischargeDate(), treatmentRecord.getDischargeDate(), treatmentRecord.getHospitalizedRoomNo(), treatmentRecord.getTreatmentMethod(), treatmentRecord.getDid(), treatmentRecord.getAid());
	} catch (RuntimeException e)
	{	
		treatmentRecord.setErrorMsg(e.getMessage());
		treatmentRecord.setOpreationName("updateTreatmentRecord");
	}
 	return "updateTreatmentRecordResult";
    }

    /* TODO add&update cashier record.
    When adding, only the payment date can be left as blank.
    The update must not change the PID where as other records should be allowed to modify including the EID.
    */
    @GetMapping("/addCashierData")
    public String addCashierDataForm(Model model){
	model.addAttribute("cashiersData", new CashiersData());
	return "addCashierData";
    }
    
    @PostMapping("/addCashierData")
    public String addCashierDataSubmit(@ModelAttribute CashiersData  cashiersData) {
	// TODO add db query here.
	try{
    	jdbcTemplate.update("insert into " + prefix + ".cashiersData values (?,?,?,to_date(?,'YYYY-MM-DD'),?,to_date(?,'YYYY-MM-DD'),?)", cashiersData.getAid(), cashiersData.getPid(), cashiersData.getDueAmount(), cashiersData.getDueDate(), cashiersData.getStatus(), cashiersData.getPaymentDate(), cashiersData.getEid());
	} catch (RuntimeException e)
	{	
		cashiersData.setErrorMsg(e.getMessage());
		cashiersData.setOpreationName("addCashierData");
	}
 	return "addCashierDataResult";
    }
    

    @GetMapping("/updateCashierData")
    public String updateCashierDataForm(Model model){
	model.addAttribute("cashiersData", new CashiersData());
	return "updateCashierData";
    }
    
    @PostMapping("/updateCashierData")
    public String updateCashierDataSubmit(@ModelAttribute CashiersData  cashiersData) {
	// TODO add db query here.
	try{
    	jdbcTemplate.update("update " + prefix + ".cashiersData set dueAmount = ?, dueDate = to_date(?,'YYYY-MM-DD'), status = ?, paymentDate = to_date(?,'YYYY-MM-DD'), eid = ? where aid = ?", cashiersData.getDueAmount(), cashiersData.getDueDate(), cashiersData.getStatus(), cashiersData.getPaymentDate(), cashiersData.getEid(), cashiersData.getAid());
	} catch (RuntimeException e)
	{	
		cashiersData.setErrorMsg(e.getMessage());
		cashiersData.setOpreationName("updateCashierData");
	}
 	return "updateCashierDataResult";
    }

    /* TODO Update department room number and building name from the department table.
    In fact, anything in this table can be modified and updated except the DID.
    */
    
    @GetMapping("/updateDepartment")
    public String updateDepartmentForm(Model model){
	model.addAttribute("department", new Department());
	return "updateDepartment";
    }
    
    @PostMapping("/updateDepartment")
    public String updateDepartmentSubmit(@ModelAttribute Department  department) {
	// TODO add db query here.
	try{
    	jdbcTemplate.update("update " + prefix + ".department set name = ?, buildingName = ?, officeNo = ? where departmentId = ", department.getName(), department.getBuildingName(), department.getOfficeNo(), department.getDepartmentId());
	} catch (RuntimeException e)
	{	
		department.setErrorMsg(e.getMessage());
		department.setOpreationName("updateDepartment");
	}
 	return "updateDepartmentResult";
    }

    @GetMapping("/query1")
    public String query1Form(Model model) {
        model.addAttribute("query1result", new Query1result());
        return "query1";
    }

    @PostMapping("/query1")
    public String query1Submit(@ModelAttribute Patient patient, Model model) {
        //TODO query to check result, if found return "query1ResultFound", if not return "query1ResultNotFound";
	
    	List<Query1result> query1result = this.jdbcTemplate.query(
    	"select patient.pid as pid, firstName, lastName, gender, date_of_birth, visitDate, visitReason, treatmentMethod, did from dmcccccc.patient inner join dmcccccc.treatmentRecord on patient.pid = treatmentRecord.pid and firstName = ? and lastName = ? and date_of_birth = (to_date(?,'YYYY-MM-DD')) and rownum = 1 order by visitDate desc",
    	new RowMapper<Query1result>() {
    		public Query1result mapRow(ResultSet rs, int rowNum) throws SQLException {
    			Query1result result = new Query1result();
    			result.setPid(rs.getInt("pid"));
    			result.setFirstName(rs.getString("firstName"));
    			result.setLastName(rs.getString("lastName"));
    			result.setGender(rs.getString("gender"));
    			result.setDate_of_birth(rs.getString("date_of_birth").split(" ")[0]);
    			result.setVisitDate(rs.getString("visitDate").spilt(" ")[0]);
    			result.setVisitReason(rs.getString("visitReason"));
    			result.setTreatmentMethod(rs.getString("treatmentMethod"));
    			result.setDid(rs.getInt("did"));
    			model.addAttribute("result", result);
    			return result;
    		}
    	 }, patient.getFirstName(), patient.getLastName(), patient.getDate_of_birth());
	
    	
    	if(query1result.size() == 0)
    		return "query1ResultNotFound";
    	else
    		return "query1ResultFound";
    }

    @GetMapping("/query2")
    public String query2Form(Model model) {
        model.addAttribute("department", new Department());
        return "query2";
    }

    @PostMapping("/query2")
    public String query2Submit(@ModelAttribute Department department, Model model) {
        // TODO query2 add attribute of array of doctors,if department name unmatch throw error
        return "query2Result";
    }


}
