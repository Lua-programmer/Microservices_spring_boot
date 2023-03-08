package io.github.luaprogrammer.course.endpoint.controller;


import io.github.luaprogrammer.course.endpoint.service.CourseService;
import io.github.luaprogrammer.model.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("v1/admin/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Course>> list (Pageable pageable) {
        return new ResponseEntity<>(courseService.list(pageable), HttpStatusCode.valueOf(200));
    }
}
