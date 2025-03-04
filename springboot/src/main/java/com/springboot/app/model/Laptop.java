package com.springboot.app.model;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Laptop");
    }
}
