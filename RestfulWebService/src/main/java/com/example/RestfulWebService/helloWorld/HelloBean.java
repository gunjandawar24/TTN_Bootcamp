package com.example.RestfulWebService.helloWorld;

public class HelloBean {

    private String name;
    public HelloBean(String message) {
        this.name=message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloBean{" + "name='" + name + '\'' + '}';
    }
}
