package com.tothenew.bootcamp.Springframework.Ques3;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker implements Worker{
    @Override
    public void Work(){
        System.out.println();
        System.out.println("Lazy Worker is working..");
    }

}
