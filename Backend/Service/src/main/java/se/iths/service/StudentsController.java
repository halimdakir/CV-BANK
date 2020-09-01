package se.iths.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {
    final StudentsRepository repository;

    public StudentsController(StudentsRepository storage) {
        this.repository = storage;
    }

    @GetMapping()
    public List<Student> allStudents() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> oneStudent(@PathVariable Integer id) {
        var studentOptional = repository.findById(id);
        return studentOptional.map(student -> new ResponseEntity<>(student, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        repository.save(student);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/students/" + student.getId());
        return new ResponseEntity<>(student, headers, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
