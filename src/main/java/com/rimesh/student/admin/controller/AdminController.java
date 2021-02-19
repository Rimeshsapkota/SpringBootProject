package com.rimesh.student.admin.controller;

import com.rimesh.student.admin.entity.Admin;
import com.rimesh.student.admin.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//end point(API)--call by web , mobile, desktop, thirdparty service.......(client call)
@RestController
public class AdminController {
    //HttpMethod---GET, POST, PUT, DELETE, HEAD, PATCH
    //1. admin information--save
    //2. get
    //3. delete

    // @Autowired
    // private  AdminService adminService; //If final keyword  is not written then we used @Autowired
    // or
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/api/admin")
    public Admin createAdmin(@RequestBody Admin admin){ //@RequestBody----> json body {"key":"value"}
        return adminService.createAdmin(admin);
    }

    @GetMapping("/api/admin_by_name")          //Parameter
    public List<Admin> findByName(@RequestParam String firstName) {  //@RequestParam search parameter ?name=""&address=""
        return adminService.findByName(firstName);
    }

    @GetMapping("/api/admin/{id}")
    public Optional<Admin> findByID(@PathVariable Long id) {  //@PathVariable is used to find unique value"
        return adminService.findById(id);
    }

    @DeleteMapping("/api/admin/{id}/delete")
    public String deleteAdminById(@PathVariable Long id){
        adminService.deleteAdminById(id);
        return  "successfully deleted";
    }

   @GetMapping("/api/admin/{id}/deleted")
    public String deleteAdminByIds(@PathVariable Long id){
        return  adminService.deleteAdminByIds(id);

    }


    @GetMapping("/api/admin")
    public List<Admin> getAdminList() {
        return adminService.getAdminList();
    }
}
