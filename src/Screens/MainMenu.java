package Screens;
import java.util.*;

public class MainMenu{
    public static String render(){
        String output = "";
        System.out.println("---");
        System.out.println("ADD TABLE (Press a)\nOPEN TABLES (press o)\n");
        System.out.println("---");
        Scanner input = new Scanner(System.in);
        

        char option = input.next().charAt(0);
        if (option == 'a') {
            output = "add-table";
        } else if (option == 'o') {
            output = "open-table";
        }
        return output;

     }
    

    public static void destroy(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
