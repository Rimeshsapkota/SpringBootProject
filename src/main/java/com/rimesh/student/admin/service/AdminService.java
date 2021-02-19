package com.rimesh.student.admin.service;

import com.rimesh.student.admin.entity.Admin;

import java.util.List;
import java.util.Optional;


public interface AdminService {

    List<Admin> getAdminList();

    Admin createAdmin(Admin admin);

    List<Admin> findByName(String firstName);

    Optional<Admin> findById(Long id);

    void deleteAdminById(Long id);

    String deleteAdminByIds(Long id);
}
