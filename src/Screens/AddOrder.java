package Screens;

public class AddOrder {
    
    public static void AddFood(){
        System.out.println("Which food would you like to add:");
    }
    public static void AmtOfItem(){
        System.out.println("How many:");
    }
    public static void AddDrink(){
        System.out.println("Which drink would you like to add:");
    }
    public static void destroy(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
