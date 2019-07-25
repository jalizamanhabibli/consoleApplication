package util;

import beans.User;
import config.Inititization;

import java.util.Scanner;

public class UserUtil{

    public static User login(String username, String password) {
        if(Inititization.config.getUser().getUsername().equals(username)&&
                Inititization.config.getUser().getPassword().equals(password)){
            System.out.println("Successfully login!");
            return Inititization.config.getUser();
        }
        throw new IllegalArgumentException("Username or Password is incorrect!");
    }

    public static User regiserLogin(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Username: ");
        String username=scan.nextLine();
        System.out.print("Password: ");
        String password=scan.nextLine();
        return  login(username,password);
    }
    public static User registerLogin(int tryCount){
        for(int i=0;i<tryCount;i++){
           try {
               return regiserLogin();
           }catch (IllegalArgumentException e){
               System.out.println(e.getMessage());
               System.out.println("Try again!");
           }
        }
        throw new IllegalArgumentException("You have banned!");
    }
}
