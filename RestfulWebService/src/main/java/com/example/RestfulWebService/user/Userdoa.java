package com.example.RestfulWebService.user;

//import javafx.beans.binding.When;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component //bcz want to get managed by the spring
//to manage the user we create dao
//userdao will be talking to the databse and getting details back to you
public class Userdoa {

    private static List<User> users=new ArrayList<>();
    private static int userCount=3;

    static{
        users.add(new User(1,"gunjan",new Date()));
        users.add(new User(2,"gaurav",new Date()));
        users.add(new User(3,"himanshi",new Date()));
    }

    //To return a list of users back
    public List<User> findAll(){
        return users;
    }

    //to add users to the list
    public User save(User user){
        if(user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    //to find a particular user
    public User findOne(int id){
        for(User user:users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;

    }

    public User deleteByID(int id){
        Iterator<User> iterator= users.iterator();
        while (iterator.hasNext()) {
            User user=iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;

    }
}
