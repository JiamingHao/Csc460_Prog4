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
        jdbcTemplate.update("insert into " + prefix + ".patient (pid, lastName, firstName, gender, date_of_birth, address, contactNumber) values (?, ?, ?, ?, to_date(?,'YYYY-MM-DD'), ?, ?)", patient.getPid(), patient.getLastName(), patient.getFirstName(), patient.getGender(), patient.getDate_of_birth(), patient.getAddress(), patient.getContactNumber());
        return "resultPatient";
    }

    @GetMapping("/deletePatient")
    public String deletePatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "deletePatient";
    }

    @PostMapping("/deletePatient")
    public String deletePatientSubmit(@ModelAttribute Patient patient) {
        jdbcTemplate.update("delete from " + prefix + ".patient where pid = ?", patient.getPid());
        return "deletePatientResult";
    }

    @GetMapping("/updatePatient")
    public String updatePatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "updatePatient";
    }

    @PostMapping("/updatePatient")
    public String updatePatientSubmit(@ModelAttribute Patient patient) {
        jdbcTemplate.update("update " + prefix + ".patient set lastName = ?, firstName = ?, gender = ?, address = ?, contactNumber = ? where pid = ?", patient.getLastName(), patient.getFirstName(), patient.getGender(), patient.getAddress(), patient.getContactNumber(), patient.getPid());
        return "updatePatientResult";
    }



    @GetMapping("/addDoctor")
    public String doctorForm(Model model){
    model.addAttribute("doctor", new Doctor());
    return "addDoctor";
    }

    @PostMapping("/addDoctor")
    public String doctorSubmit(@ModelAttribute Doctor doctor) {
        jdbcTemplate.update("insert into " + prefix + ".doctor values (?,?,?,?,?,?,?)", doctor.getDid(), doctor.getLastName(), doctor.getFirstName(), doctor.getDate_of_birth(), doctor.getStatus(), doctor.getDepartmentId(), doctor.getOfficeNo());
    return "resultDoctor";
    }

    @GetMapping("/deleteDoctor")
    public String deleteDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "deleteDoctor";
    }

    @PostMapping("/deleteDoctor")
    public String deleteDoctorSubmit(@ModelAttribute Doctor doctor) {
        jdbcTemplate.update("delete from " + prefix + ".doctor where did = ?", doctor.getDid());
        return "deleteDoctorResult";
    }

    @GetMapping("/updateDoctor")
    public String updateDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "updateDoctor";
    }

    @PostMapping("/updateDoctor")
    public String updateDoctorSubmit(@ModelAttribute Doctor doctor) {
        jdbcTemplate.update("update " + prefix + ".doctor set lastName = ?, firstName = ?, status = ?, departmentId = ?, officeNo = ? where did = ?", doctor.getLastName(), doctor.getFirstName(), doctor.getStatus(), doctor.getDepartmentId(), doctor.getOfficeNo(), doctor.getDid());
        return "updateDoctorResult";
    }



    @GetMapping("/addNurse")
    public String nurseForm(Model model){
    model.addAttribute("nurse", new Nurse());
    return "addNurse";
    }

    @PostMapping("/addNurse")
    public String nurseSubmit(@ModelAttribute Nurse nurse) {
        jdbcTemplate.update("insert into " + prefix + ".nurse values (?,?,?,?,?,?)", nurse.getNid(), nurse.getLastName(), nurse.getFirstName(), nurse.getDate_of_birth(), nurse.getDepartmentId(), nurse.getRoomNo());
    return "resultNurse";
    }

    @GetMapping("/deleteNurse")
    public String deleteNurseForm(Model model) {
        model.addAttribute("nurse", new Nurse());
        return "deleteNurse";
    }

    @PostMapping("/deleteNurse")
    public String deleteNurseSubmit(@ModelAttribute Nurse nurse) {
        jdbcTemplate.update("delete from " + prefix + ".nurse where nid = ?", nurse.getNid());
        return "deleteNurseResult";
    }

    @GetMapping("/updateNurse")
    public String updateNurseForm(Model model) {
        model.addAttribute("nurse", new Nurse());
        return "updateNurse";
    }

    @PostMapping("/updateNurse")
    public String updateNurseSubmit(@ModelAttribute Nurse nurse) {
        jdbcTemplate.update("update " + prefix + ".nurse set lastName = ?, firstName = ?, status = ?, departmentId = ?, roomNo = ? where nid = ?", nurse.getLastName(), nurse.getFirstName(), nurse.getDepartmentId(), nurse.getRoomNo(), nurse.getNid());
        return "updateNurseResult";
    }

    @GetMapping("/addStaff")
    public String staffForm(Model model){
    model.addAttribute("staff", new Staff());
    return "addStaff";
    }

    @PostMapping("/addStaff")
    public String staffSubmit(@ModelAttribute Staff staff) {
        jdbcTemplate.update("insert into " + prefix + ".staff values (?,?,?,?,?,?,?,?,?,?)", staff.getEid(), staff.getLastName(), staff.getFirstName(), staff.getDate_of_birth(), staff.getDepartmentId(), staff.getOfficeNo(), staff.getSalary(), staff.getJobTitle(), staff.getGender(), staff.getContactNumber());
    return "resultStaff";
    }

    @GetMapping("/deleteStaff")
    public String deleteStaffForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "deleteStaff";
    }

    @PostMapping("/deleteStaff")
    public String deleteStaffSubmit(@ModelAttribute Staff staff) {
        jdbcTemplate.update("delete from " + prefix + ".staff where eid = ?", staff.getEid());
        return "deleteStaffResult";
    }

    @GetMapping("/updateStaff")
    public String updateStaffForm(Model model) {
        model.addAttribute("staff", new Staff());
        return "updateStaff";
    }

    @PostMapping("/updateStaff")
    public String updateStaffSubmit(@ModelAttribute Staff staff) {
        jdbcTemplate.update("update " + prefix + ".staff set lastName = ?, firstName = ?, status = ?, departmentId = ?, officeNo = ?, salary = ?, jobTitle = ?, gender = ?, contactNumber = ? where eid = ?", staff.getLastName(), staff.getFirstName(), staff.getDepartmentId(), staff.getOfficeNo(), staff.getSalary(), staff.getJobTitle(), staff.getGender(), staff.getContactNumber(), staff.getEid());
        return "updateStaffResult";
    }
    
    @GetMapping("/addPharmacist")
    public String pharmacistForm(Model model){
    model.addAttribute("pharmacist", new Pharmacist());
    return "addPharmacist";
    }

    @PostMapping("/addPharmacist")
    public String pharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
        jdbcTemplate.update("insert into " + prefix + ".pharmacist values (?,?,?,?,?,?)", pharmacist.getPharmacist_id(), pharmacist.getDepartmentId(), pharmacist.getLastName(), pharmacist.getFirstName(), pharmacist.getDate_of_birth(), pharmacist.getOfficeNo());
    return "resultPharmacist";
    }

    @GetMapping("/deletePharmacist")
    public String deletePharmacistForm(Model model) {
        model.addAttribute("pharmacist", new Pharmacist());
        return "deletePharmacist";
    }

    @PostMapping("/deletePharmacist")
    public String deletePharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
        jdbcTemplate.update("delete from " + prefix + ".pharmacist where pharamacist_id = ?", pharmacist.getPharmacist_id());
        return "deletePharmacistResult";
    }
    
    @GetMapping("/updatePharmacist")
    public String updatePharmacistForm(Model model) {
        model.addAttribute("pharmacist", new Pharmacist());
        return "updatePharmacist";
    }
    
    @PostMapping("/updatePharmacist")
    public String updatePharmacistSubmit(@ModelAttribute Pharmacist pharmacist) {
        jdbcTemplate.update("update " + prefix + ".pharmacist set lastName = ?, firstName = ?, departmentId = ?, officeNo = ? where pharamacist_id = ?", pharmacist.getLastName(), pharmacist.getFirstName(), pharmacist.getDepartmentId(), pharmacist.getDate_of_birth(), pharmacist.getOfficeNo(), pharmacist.getPharmacist_id());
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
 	return "resultTreatmentRecord";
    }
    
    @GetMapping("/updateTreatmentRecord")
    public String updateTreatmentForm(Model model){
	model.addAttribute("treatmentRecord", new TreatmentRecord());
	return "updateTreatmentRecord";
    }
    
    @PostMapping("/updateTreatmentRecord")
    public String updatetreatmentSubmit(@ModelAttribute TreatmentRecord  treatmentRecord) {
	// TODO add db query here.
 	return "updateTreatmentRecordResult";
    }

    /* TODO add&update cashier record.
    When adding, only the payment date can be left as blank.
    The update must not change the PID where as other records should be allowed to modify including the EID.
    */



    /* TODO Update department room number and building name from the department table.
    In fact, anything in this table can be modified and updated except the DID.
    */
}
