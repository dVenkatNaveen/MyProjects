package com.springboot.app.service;

import com.springboot.app.model.Laptop;
import com.springboot.app.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;
    List<Laptop> listlap =new ArrayList<>();

    public void add(Laptop lap) {
        laptopRepo.save();
    }

    public void show(){
        System.out.println(listlap);
    }
}
