import controller.MediaController;

import java.util.List;
import java.util.Scanner;

public class Main{

  public static void Options(String user_id)
  {
    Scanner sc = new Scanner(System.in);
    MediaController controller = new MediaController();
    boolean check = true;

    while(check)
    {

      System.out.println("1. Friends Suggestion ");
      System.out.println("2. Create a Post");
      System.out.println("3. View Friends");
      System.out.println("4. View Your Feed");
      System.out.println("5. Notifications");
      System.out.println("6. Logout");

      System.out.print("Enter the Option to Explore : ");
      int option = sc.nextInt();

      switch (option)
      {
        case 1:

        case 2:

        case 3:
          controller.viewFriends(user_id);
        case 4:

        case 5:

        case 6:
          System.out.println("User Logged Out Successfully !!.....");

        default:
          System.out.println("Invalid Options Enter the Valid Options.....");
          break;
      }

    }
  };

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    MediaController controller = new MediaController();

    boolean check = true;

    System.out.println("=========================================");
    System.out.println("Welcome to The Social Media Application");
    System.out.println("=========================================");

    while(check)
    {


      System.out.println("1. SignUp");
      System.out.println("2. Login");

      System.out.print("Enter the Option to Explore : ");
      int option = sc.nextInt();

      switch(option){
        case 1:
          System.out.println("=========================================");
          System.out.println("User SignUp");
          System.out.println("=========================================");

          controller.UserSignup();
          break;

        case 2:

          System.out.println("=========================================");
          System.out.println("User Login");
          System.out.println("=========================================");

          System.out.print("Enter your UserID : ");
          String user_id = sc.nextLine();

          if(controller.isLogin(user_id))
          {
            Options(user_id);
          }
          else{
            System.out.println("Invalid User..");
            System.out.println("Try Creating the User first.....");
          }
          break;

        case 3:
          check = false;
          break;

        default:
          System.out.println("Choose a Valid Option!!.....");

      }




    }
  }
}