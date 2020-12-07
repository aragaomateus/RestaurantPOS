package Screens;
import java.util.*;

public class EnterPassword {
    static private int managerPassword = 3434;
    static private int serverPassword = 1223;

    public static String render(){
        int password = 0;
        String output = "";
        Scanner input = new Scanner(System.in);
        do {
            EnterPassword.destroy();
            System.out.println("Enter your password:");
            password = input.nextInt();
        } while (password != EnterPassword.managerPassword && password != EnterPassword.serverPassword); 
        if (password == EnterPassword.managerPassword)
            output = "manager";
        if (password == EnterPassword.serverPassword)
            output = "server";
        return output;
    }
    public static void destroy(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    
}
