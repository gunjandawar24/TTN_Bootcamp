package com.example.RestfulWebService.Versioning;

public class UserV2 {
    public UserV2(){

    }
    public UserV2(Name name) {
        this.name = name;
    }

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}