package entity;
import java.time.LocalDate;
import java.util.*;


public class User {
    private String user_id;
    private String user_name;
    private int age;
    private LocalDate DOB;
    private String occupation;
    private String location;
    private Stack<Post> feeds;
    private Stack<Notification> notifications;


    public User(String user_id , String user_name , int age , LocalDate DOB , String occupation , String location){
        this.DOB = DOB;
        this.age= age ;
        this.user_id = user_id;
        this.location = location ;
        this.user_name = user_name ;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Stack<Post> getFeeds() {
        return feeds;
    }

    public void setFeeds(Stack<Post> feeds) {
        this.feeds = feeds;
    }

    public Stack<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Notification notification) {
        this.notifications.push(notification);
    }
}
