package com.example.webproject.service;

import com.example.webproject.entity.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdminService {
    /**
     * 插入新的Admin
     * @param admin
     * @return
     */
    Admin saveNewAdmin(Admin admin);

    /**
     * 更新
     * @param admin
     * @return
     */
    Admin updateAdmin(Admin admin);

    /**
     * 展示所有Admin
     * @param pageable
     * @return
     */
    Page<Admin> selectAllAdmin(Pageable pageable);

    /**
     * 登录功能
     * @param account
     * @param password
     */
    Admin loginCheck(String account,String password);
}
