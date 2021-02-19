package com.rimesh.student.admin.repository;

import com.rimesh.student.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//get,set ,delete(Crud) data from database  ---database logic
public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("select a from Admin a where a.firstName = ?1")
    List<Admin> findByName(String firstName);
    //List<Admin> findByFirstName(String firstName);

}

