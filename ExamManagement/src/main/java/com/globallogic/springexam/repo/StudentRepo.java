package com.globallogic.springexam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globallogic.springexam.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
/*@Query("select name from student")
List<String> StudentsByName();*/
}
