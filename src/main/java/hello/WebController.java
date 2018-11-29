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
    // TODO update table prefix below.
    private String prefix = "";

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @GetMapping("/addPatient")
    public String patientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "addPatient";
    }

    @PostMapping("/addPatient")
    public String patientSubmit(@ModelAttribute Patient patient) {
        jdbcTemplate.update("insert into ?.patient values (?, ?, ?, ?, ?, ?, ?)", prefix, patient.getPid(), patient.getLastName(), patient.getFirstName(), patient.getGender(), patient.getDate_of_birth(), patient.getAddress(), patient.getContactNumber());
        return "resultPatient";
    }

    @GetMapping("/deletePatient")
    public String patientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "deletePatient";
    }

    @PostMapping("/deletePatient")
    public String patientSubmit(@ModelAttribute Patient patient) {
        // TODO add db query here.
        return "deletePatientResult";
    }

    @GetMapping("/updatePatient")
    public String patientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "updatePatient";
    }

    @PostMapping("/updatePatient")
    public String patientSubmit(@ModelAttribute Patient patient) {
        // TODO add db query here.
        return "updatePatientResult";
    }



    @GetMapping("/addDoctor")
    public String doctorForm(Model model){
	model.addAttribute("doctor", new Doctor());
	return "addDoctor";
    }

    @PostMapping("/addDoctor")
    public String doctorSubmit(@ModelAttribute Doctor doctor) {
	// TODO add db query here.
 	return "resultDoctor";
    }

    @GetMapping("/deleteDoctor")
    public String DoctorForm(Model model) {
        model.addAttribute("Doctor", new Doctor());
        return "deleteDoctor";
    }

    @PostMapping("/deleteDoctor")
    public String DoctorSubmit(@ModelAttribute Doctor doctor) {
        // TODO add db query here.
        return "deleteDoctorResult";
    }

    @GetMapping("/updateDoctor")
    public String DoctorForm(Model model) {
        model.addAttribute("Doctor", new Doctor());
        return "updateDoctor";
    }

    @PostMapping("/updateDoctor")
    public String DoctorSubmit(@ModelAttribute Doctor doctor) {
        // TODO add db query here.
        return "updateDoctorResult";
    }



    @GetMapping("/addNurse")
    public String nurseForm(Model model){
	model.addAttribute("nurse", new Nurse());
	return "addNurse";
    }

    @PostMapping("/addNurse")
    public String nurseSubmit(@ModelAttribute Nurse nurse) {
	// TODO add db query here.
 	return "resultNurse";
    }

    @GetMapping("/deleteNurse")
    public String NurseForm(Model model) {
        model.addAttribute("Nurse", new Nurse());
        return "deleteNurse";
    }

    @PostMapping("/deleteNurse")
    public String NurseSubmit(@ModelAttribute Nurse nurse) {
        // TODO add db query here.
        return "deleteNurseResult";
    }

    @GetMapping("/updateNurse")
    public String NurseForm(Model model) {
        model.addAttribute("Nurse", new Nurse());
        return "updateNurse";
    }

    @PostMapping("/updateNurse")
    public String NurseSubmit(@ModelAttribute Nurse nurse) {
        // TODO add db query here.
        return "updateNurseResult";
    }



    @GetMapping("/addStaff")
    public String staffForm(Model model){
	model.addAttribute("staff", new Staff());
	return "addStaff";
    }

    @PostMapping("/addStaff")
    public String staffSubmit(@ModelAttribute Staff staff) {
	// TODO add db query here.
 	return "resultStaff";
    }

    @GetMapping("/deleteStaff")
    public String StaffForm(Model model) {
        model.addAttribute("Staff", new Staff());
        return "deleteStaff";
    }

    @PostMapping("/deleteStaff")
    public String StaffSubmit(@ModelAttribute Staff staff) {
        // TODO add db query here.
        return "deleteStaffResult";
    }

    @GetMapping("/updateStaff")
    public String StaffForm(Model model) {
        model.addAttribute("Staff", new Staff());
        return "updateStaff";
    }

    @PostMapping("/updateStaff")
    public String StaffSubmit(@ModelAttribute Staff staff) {
        // TODO add db query here.
        return "updateStaffResult";
    }

    /* TODO add&update patient treatment record.
    When adding PID, appointment number, reason of visit, and date of visit cannot be left as blank.
    When updating, everything can be updated except the PID, appointment number, reason of visit, and the date of visit.
    */



    /* TODO add&update cashier record.
    When adding, only the payment date can be left as blank.
    The update must not change the PID where as other records should be allowed to modify including the EID.
    */



    /* TODO Update department room number and building name from the department table.
    In fact, anything in this table can be modified and updated except the DID.
    */
}
