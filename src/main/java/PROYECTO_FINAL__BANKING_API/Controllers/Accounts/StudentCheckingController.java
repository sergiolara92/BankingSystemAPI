package PROYECTO_FINAL__BANKING_API.Controllers.Accounts;

import PROYECTO_FINAL__BANKING_API.Models.Accounts.StudentChecking;
import PROYECTO_FINAL__BANKING_API.Services.StudentCheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCheckingController {



    @Autowired
    StudentCheckingService studentCheckingService;

    @GetMapping("/all-student-accounts")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentChecking> allStudentAccounts() {
        return studentCheckingService.allStudentAccounts();
    }


}
