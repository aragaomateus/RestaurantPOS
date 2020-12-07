package Screens;

public class OpenTablesScreen {
    // Screen Open Tables
    /*|  1    |  2    |  3    |  4 
      |  5    |  6    |  7    |  8 
      |  9    |  10   |  11   |  12 
      |  13   |  14   |  15   |  16 
      |  17   |  18   |  19   |  20 */
    // Choose a table: 12

    // Screen table detail
    // ?Modify table(press m)
    // Print the bill(press p)
    // Close the bill(press c)
    // Back(press b)

    
    
    public static void render(){
        int count = 1;

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++)
                System.out.print("|  " + count++ + "\t");
            System.out.println();
        }
        System.out.println("Choose a table:");
    }
    public static void tableChoices(){
        System.out.println("Add An item:(press a)");
        System.out.println("Remove An item:(press r)");
        System.out.println("print the bill: (press p)");
        System.out.println("Settles the bill:(press s)");
    }

    public static void destroy(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }



    
}
