package controller;

import service.MediaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entity.User;


public class MediaController {
    Scanner sc = new Scanner(System.in);
    MediaService service = new MediaService();

    public void UserSignup()
    {

        try {
            System.out.print("Enter the Username : ");
            String name = sc.nextLine();

            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();

            System.out.print("Enter your Data of Birth (DOB) in (\" dd-mm-yyyy \"): ");
            String dob = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dob,formatter);

            System.out.print("Enter your Location : ");
            String location = sc.nextLine();

            System.out.print("Enter your Occupation : ");
            String occupation = sc.nextLine();

            String user_id;
            while(true)
            {
                System.out.print("Enter your User Handle : ");
                user_id = sc.nextLine();
                if(service.checkUser(user_id))
                {
                    System.out.println("This username is already taken!!....");
                    System.out.println("Try another username....");
                }
                else{
                    break;
                }

            }

            service.addUser(user_id,name,age,date,location,occupation);

            System.out.println("User Created Successfully !! ......");

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isLogin(String user_id)
    {
        return service.checkUser(user_id);
    }

    public void viewFriends(String user_id)
    {
        System.out.println("===================================");
        System.out.println("--------- Your Friends ------------");
        System.out.println("===================================");

        List<String> friends = service.getFriends(user_id);
        if(friends.isEmpty())
        {
            System.out.println("No friends Till Now !!...");
            return;
        }
        int i = 1;
        for(String friend : friends)
        {
            User friend_data = service.getuser(friend);
            System.out.println("Friend : "+ i++);
            System.out.println("Name : "+ friend_data.getUser_name());
            System.out.println("Age : "+ friend_data.getAge());
            System.out.println("Location : "+ friend_data.getLocation());
            System.out.println("Occupation : " + friend_data.getOccupation());
            System.out.println("==============================================");
        }
    }



}
