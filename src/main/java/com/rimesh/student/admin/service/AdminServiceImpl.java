package com.rimesh.student.admin.service;

import com.rimesh.student.admin.entity.Admin;
import com.rimesh.student.admin.repository.AdminRepository;
import com.rimesh.student.shared.Status;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//business logic (implementations)
@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> getAdminList(){
        return adminRepository.findAll();
    }

    @Override
    public Admin createAdmin(Admin admin) {
        admin.setStatus(Status.ACTIVE);
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> findByName(String firstName) {
        return adminRepository.findByName(firstName);
    }

    @Override
    public Optional<Admin> findById(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public void deleteAdminById(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public String deleteAdminByIds(Long id) {
        Optional<Admin> admin = adminRepository.findById(id);
        if( admin.get().getStatus().equals(Status.ACTIVE)){
           admin.get().setStatus(Status.DELETED);
            adminRepository.save(admin.get());
            return  "successfully deleted";
        }
        else{
            return "Already Deleted";
        }

    }
}
