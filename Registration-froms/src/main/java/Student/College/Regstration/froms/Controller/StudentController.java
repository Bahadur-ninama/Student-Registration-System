package Student.College.Regstration.froms.Controller;

import Student.College.Regstration.froms.Entity.Student;
import Student.College.Regstration.froms.Repository.StudentRepo;
import Student.College.Regstration.froms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@org.springframework.stereotype.Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "index"; // This maps to src/main/resources/templates/index.html
    }

    @PostMapping
    public String registerStudent(@ModelAttribute Student student, Model model) {
        studentService.saveStudent(student);
        model.addAttribute("successMessage", "Student registered successfully!");
        return "index"; // Reloads the form after submission
    }
}


