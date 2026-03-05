package service;

import entity.Post;
import entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MediaService {

    Map<String,User> users = new HashMap<>();
    Map<String,List<Post>> posts = new HashMap<>();
    Map<String,List<String>> friends = new HashMap<>();

    public void addUser(String User_id, String User_name, int Age, LocalDate Dob, String Location, String Occupation){
        try{
            User user = new User(User_id,User_name,Age, Dob,Occupation,Location);
            users.put(User_id,user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public User getuser(String User_id)
    {
        if(checkUser(User_id))
        {
            return users.get(User_id);
        }
        return null;
    }

    public boolean checkUser(String user_id)
    {
        return users.containsKey(user_id);
    }

    public List<String> getFriends(String user_id)
    {
        return friends.get(user_id);
    }


}
