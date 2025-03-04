package com.springboot.app.model;

import org.springframework.stereotype.Component;

@Component("desktop")
public class Desktop implements Computer{

   public Desktop(){
       System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Deskop");
    }
}
