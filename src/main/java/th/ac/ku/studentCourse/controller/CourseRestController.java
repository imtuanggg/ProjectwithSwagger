package th.ac.ku.studentCourse.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.studentCourse.data.CourseRepository;
import th.ac.ku.studentCourse.model.Course;

import java.util.List;


@RestController
@RequestMapping("/api/course")
public class CourseRestController {

    private CourseRepository repository;

    public CourseRestController(CourseRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Course> getAll(){
        return  repository.findAll();
    }

    @GetMapping("/{id}")
    public Course getOne(@PathVariable int id){
        return repository.findById(id).get();
    }

    /*@ApiOperation(value = "Add a course")*/
    @PostMapping
    public Course create(@RequestBody Course course){
        Course record = repository.save(course);
        return record;
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable int id,
                         @RequestBody  Course course){
        Course record = repository.findById(id).get();
        record.setCourseNo(course.getCourseNo());
        record.setCourseName(course.getCourseName());
        record.setCredits(course.getCredits());
        record.setDepartment(course.getDepartment());
        record.setTeacherId(course.getTeacherId());
        repository.save(record);
        return record;
    }

    @DeleteMapping("/{id}")
    public Course delete(@PathVariable int id){
        Course record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
