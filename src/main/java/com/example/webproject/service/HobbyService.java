package com.example.webproject.service;

import com.example.webproject.entity.Hobby;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface HobbyService {

    /**
     * 插入新数据
     * @param hobby
     * @return
     */
    Hobby saveNew(Hobby hobby);

    /**
     * 更新数据
     * @param hobby
     * @return
     */
    Hobby update(Hobby hobby);

    /**
     * 展示所有
     * @param pageale
     * @return
     */
    Page<Hobby> selectAllHobby(Pageable pageale);

    /**
     * 查询用户爱好
     * @param name
     */
    Hobby selectByName(String name);
}