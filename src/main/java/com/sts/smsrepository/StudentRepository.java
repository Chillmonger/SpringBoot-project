package com.sts.smsrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.sms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}