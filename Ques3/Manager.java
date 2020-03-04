//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management

package com.tothenew.bootcamp.Springframework.Ques3;

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