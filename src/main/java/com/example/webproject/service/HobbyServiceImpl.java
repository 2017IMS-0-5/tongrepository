package com.example.webproject.service;

import com.example.webproject.entity.Hobby;
import com.example.webproject.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HobbyServiceImpl implements HobbyService{
    @Autowired
    private HobbyRepository hobbyRepository;

    @Transactional
    @Override
    public Hobby saveNew(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    @Transactional
    @Override
    public Hobby update(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    @Override
    public Page<Hobby> selectAllHobby(Pageable pageable) {
        return hobbyRepository.findAll(pageable);
    }

    @Override
    public Hobby selectByName(String name) {
        List<Hobby> hobbyList=hobbyRepository.findByName(name);
        for(Hobby hobby:hobbyList){
            if(hobby.getHobby()!=null){
                return hobby;
            }
        }
        return null;
    }
}
