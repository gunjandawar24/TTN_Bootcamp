package com.tothenew.bootcamp.Springframework.Ques4;

import org.springframework.stereotype.Component;

@Component
public class SmartWorker implements Worker{
    @Override
    public void Work(){
        System.out.println();
        System.out.println("Smart Worker is working..");
    }

}
