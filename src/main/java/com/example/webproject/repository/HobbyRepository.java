package com.example.webproject.repository;

import com.example.webproject.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HobbyRepository extends JpaRepository<Hobby, Long> {

    /**
     * 输入姓名查询爱好
     * @param name
     * @return
     */
    List<Hobby> findByName(String name);
}
