package com.example.webproject.repository;


import com.example.webproject.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    /**
     * 用于登录
     * @param account
     * @return
     */
    List<Admin> findByAccount(String account);
}

