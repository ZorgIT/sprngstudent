package ru.matushov.springstudents.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.matushov.springstudents.model.Student;

//@Repository - автоматические выдается спрингом т.к. расширяется JpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);

    Student findByEmail(String email);
}
