package Screens;
import java.util.*;

public class AddTableScreen {
     // Screen add table
    //  add table
    // Enter the amount of people:

    public static String render() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int tableNumber = input.nextInt();
        
        System.out.println("Enter the amount of people: ");
        int numberOfPepple  = input.nextInt();

        return "add-order";
        
    }

    public static void destroy(){
        System.out.print("\033[H\0a33[2J");  
        System.out.flush();  
    }

    
}
