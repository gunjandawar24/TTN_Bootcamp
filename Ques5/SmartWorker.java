package com.tothenew.bootcamp.Springframework.Ques5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmartWorker implements Worker {
    @Override
    public void Work(){
        System.out.println();
        System.out.println("Smart Worker is working..");
    }

}
