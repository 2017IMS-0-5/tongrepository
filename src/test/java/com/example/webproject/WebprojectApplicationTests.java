package com.example.webproject;

import com.example.webproject.entity.Hobby;
import com.example.webproject.service.AdminService;
import com.example.webproject.service.HobbyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class WebprojectApplicationTests {


/*    @Autowired
    private AdminService adminService;*/

    @Autowired
    private HobbyService hobbyService;
    /**
   @Test
   void testSave(){
       Admin admin=new Admin("testManager","123","manager");
       System.out.println(adminService.saveNewAdmin(admin).toString());
   }

    @Test
    void testUpdate(){
        Admin admin=new Admin("test","123","manager");
        admin.setId(1);
        System.out.println(adminService.updateAdmin(admin));
    }

    @Test
    void testSelectAll(){
        Pageable pageable= PageRequest.of(1,2);
        Page<Admin> page=adminService.selectAllAdmin(pageable);
        for(Admin admin:page){
            System.out.println(admin.toString());
        }
    }
 **/

    @Test
    void testSaveNew(){
       Hobby hobby=new Hobby("孙静彤","游泳");
       System.out.println(hobbyService.saveNew(hobby).toString());
    }

    @Test
    void testupdate(){
        Hobby hobby=new Hobby("孙静彤","骑自行车");
        hobby.setId(1);
        System.out.println(hobbyService.update(hobby).toString());
    }

    @Test
    void testSelectAllHobby(){
        Pageable pageable= PageRequest.of(1,2);
        Page<Hobby> pagehobby=hobbyService.selectAllHobby(pageable);
        for(Hobby hobby:pagehobby){
            System.out.println(hobby.toString());
        }
    }

    @Test
    void contextLoads() {
    }

}
