package com.yagoinc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.course.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
