package ru.matushov.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.matushov.springstudents.model.Student;
import ru.matushov.springstudents.repository.inMemoryStudentDAO;
import ru.matushov.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryStudentService implements StudentService {
    private final inMemoryStudentDAO repository;

    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
