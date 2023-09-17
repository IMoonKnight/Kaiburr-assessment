package com.Kaiburrassessment.Springboot.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor

public class KaiburService {

    private final KaiburRepository repository;
    public String save(assessment a1){
        return repository.save(a1).get_Id();
    }

    public  assessment findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<assessment> findAll(){
        return repository.findAll();
    }

    public void delete(String id){
        repository.deleteById(id);

    }

}


