package util;

import beans.User;
import java.util.Scanner;

public class UserUtil{

    public static User login(String username, String password) {
        User user=new User();
        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
            System.out.println("Successfully login!");
            return user;
        }
        throw new IllegalArgumentException("Username or Password is incorrect!");
    }

    public static User regiserLogin(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Username: ");
        String username=scan.nextLine();
        System.out.print("Password: ");
        String password=scan.nextLine();
        User user=login(username,password);
        return user;
    }
    public static User registerLogin(int tryCount){
        for(int i=0;i<tryCount;i++){
           try {
               User user=regiserLogin();
               return user;
           }catch (IllegalArgumentException e){
               System.out.println(e.getMessage());
               System.out.println("Try again!");
           }
        }
        throw new IllegalArgumentException("You have banned!");
    }
}
