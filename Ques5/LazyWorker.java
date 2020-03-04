package com.tothenew.bootcamp.Springframework.Ques5;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker implements Worker {
    @Override
    public void Work() {
        System.out.println("LazyWorker is working..");
    }
}
