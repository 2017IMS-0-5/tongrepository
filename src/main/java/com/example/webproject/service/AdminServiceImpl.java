package com.example.webproject.service;

import com.example.webproject.entity.Admin;
import com.example.webproject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Transactional
    @Override
    public Admin saveNewAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Transactional
    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Page<Admin> selectAllAdmin(Pageable pageable) {

        return adminRepository.findAll(pageable);
    }

    @Override
    public Admin loginCheck(String account, String password) {
        List<Admin> adminList=adminRepository.findByAccount(account);
        for(Admin admin:adminList){
            if(admin.getPassword().equals(password)){
                return admin;
            }
        }
        return null;
    }
}

