package th.ac.ku.studentCourse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.studentCourse.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
