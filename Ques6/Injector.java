package com.tothenew.bootcamp.Springframework.Ques6;

import org.springframework.beans.factory.annotation.Autowired;

public class Injector {
    @Autowired
    public Something something;

    // Method 1 using Constructor

    @Autowired
    Injector(Something something)
    {
        this.something=something;
    }

    // Using Setters

    @Autowired
    void setSomething(Something something)

    {
        this.something=something;
    }


    public void showmsg()

    {
        something.show();
    }
}
