package com.springboot.app.repo;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save(){
        System.out.println("Saved in Database!!!!");
    }
}
