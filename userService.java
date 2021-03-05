package com.upgrad.techincalbogpost;


import org.apache.catalina.User;

public class userService {
    public boolean login(User user){
        if(user.getUsername().equals("admin")){
            return true;
        }else{
            return false;
        }
    }
}
