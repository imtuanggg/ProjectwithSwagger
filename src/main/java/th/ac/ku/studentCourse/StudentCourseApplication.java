package th.ac.ku.studentCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class StudentCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseApplication.class, args);
	}

}
