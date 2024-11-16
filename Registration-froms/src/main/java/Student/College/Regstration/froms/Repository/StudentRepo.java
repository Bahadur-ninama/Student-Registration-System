package Student.College.Regstration.froms.Repository;

import Student.College.Regstration.froms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
