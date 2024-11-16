package Student.College.Regstration.froms.Service;

import Student.College.Regstration.froms.Entity.Student;
import Student.College.Regstration.froms.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public void saveStudent(Student student) {
         studentRepo.save(student);
    }

}
