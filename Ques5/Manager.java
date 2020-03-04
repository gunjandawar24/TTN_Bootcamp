//(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)

package com.tothenew.bootcamp.Springframework.Ques5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Manager{

    @Autowired
    private Worker worker;

    Manager(Worker worker)
    {
        this.worker=worker;
    }
    public void mangeWork()
    {
        worker.Work();
    }
}