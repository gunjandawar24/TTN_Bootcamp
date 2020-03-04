//(4) Get a Spring Bean from application context and display its properties.

package com.tothenew.bootcamp.Springframework.Ques4;

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