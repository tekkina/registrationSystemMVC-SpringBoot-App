package edu.miu.e_registrar.repository;


import edu.miu.e_registrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query( "select s from Student s where s.firstName = :firstName")
    List<Student> findStudentByStudentIdOrFirstNameOrLastNameOrMiddleName(String firstName);

}
