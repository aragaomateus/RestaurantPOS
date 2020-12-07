import java.util.concurrent.TimeUnit;
import Screens.OpenTablesScreen;
import Screens.*;
import java.util.*;

public class Main {
    // Screen 1
    //
    // Enter a Password: 

        // Screen 2
        /*
        |  1    |  2    |  3    |  4 
        |  5    |  6    |  7    |  8 
        |  9    |  10   |  11   |  12 
        |  13   |  14   |  15   |  16 
        |  17   |  18   |  19   |  20 
        */
        // ADD TABLE (Press a)
            // Screen add table
            // Enter the table number:
            // Enter the amount of people:
                    /*Screen Add Order
                    ---------- FOOD MENU -----------
                    food 1 ....... $10
                    food 2 ....... $12
                    food 3 ....... $14
                    ---------- DRINK MENU -----------
                    drink 1 ....... $5
                    drink 2 ....... $10
                    drink 3 ....... $12
                    Add a food or drink(Press f or d)
                    BACK(press b)

                        which food (press the number of the item)

                            amount:
                            [Print info back]

                        Which drink (press the number of the item)

                            amount:
                            [Print info back]
                    */
        
        // OPEN TABLES (press o)
                // Screen Open Tables
                /*|  1    |  2    |  3    |  4 
                |  5    |  6    |  7    |  8 
                |  9    |  10   |  11   |  12 
                |  13   |  14   |  15   |  16 
                |  17   |  18   |  19   |  20 */
                // Choose a table: 12

                    // Screen table detail
                    /*Screen Add Order
                    ---------- FOOD MENU -----------
                    food 1 ....... $10
                    food 2 ....... $12
                    food 3 ....... $14
                    ---------- DRINK MENU -----------
                    drink 1 ....... $5
                    drink 2 ....... $10
                    drink 3 ....... $12
                    Add a food or drink(Press f or d)
                    BACK(press b)

                        which food (press the number of the item)
                            amount:
                            [Print info back]

                        Which drink (press the number of the item)
                            amount:
                            [Print info back]

                    */

                    // Print the bill(press p)
                        /*       Restaurant Do Mateus
                                    552 Jersey Ave
                                        Apt 3

                            11/20/20 10:10:10 PM
                            -------------------------------
                            Table: 4  Check: 777 Guest: 2
                            -------------------------------

                            #1 Food 1              $ 10.00
                            #1 Food 3              $ 14.00
                            #2 Drink 2             $ 20.00
                            
                                        SUBTOTAL:  $ 44.00
                                        GRATUITY:  $  5.50
                                       TOTAL DUE:  $ 49.50

                                       Thank you!!!!!
                        */

                    // Close the bill(press c)
                        // Total Due: $ 49.50
                        // Insert total paid:

                    // Back(press b)

                   /* try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {}*/
    public static void main(String[] args) {
        
        
        // char op;
        // int password;
        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter your password:");
        // password = input.nextInt();
        String nextScreen = EnterPassword.render();
        EnterPassword.destroy();
        
        if (nextScreen.contains("manager")){
            OpenTablesScreen.render();
            nextScreen = MainMenu.render();
            MainMenu.destroy();
            while (true) {
                if (nextScreen.contains("add-table")){
                    nextScreen = AddTableScreen.render();
                    AddTableScreen.destroy();
                    if (nextScreen.contains("add-order")){
                        RestaurantMenu.render();
                        AddOrder.AddFood();
                        AddOrder.AmtOfItem();
                        AddOrder.AddDrink();
                        AddOrder.AmtOfItem();
                        AddOrder.destroy();
                    }
                } else if (nextScreen == "open-table") {
                    OpenTablesScreen.render(); 
                    nextScreen = OpenTablesScreen.tableChoices();
                }
                
            }
        }
        if (nextScreen.contains("server")){
            //script for server functions.

        }

    //     if (password>0){
    //         Screens.TablesScreen.render();
    //         Screens.MainMenu.render();
    //         op = input.next().charAt(0);
    //         if (op == 'a'){
    //                 // ADD TABLE (Press a)
    //             // Screen add table
    //             // Enter the table number:
    //             // Enter the amount of people:
    //             Screens.AddTableScreen.renderAddTable();
    //             try {
    //                 Thread.sleep(1000);
    //             } catch (InterruptedException ex) {}
    //             Screens.AddTableScreen.renderAmtPeople();
    //             try {
    //                 Thread.sleep(1000);
    //             } catch (InterruptedException ex) {}
    //             int count =0;
    //             do{
    //                 Screens.RestaurantMenu.render();
    //                 op = input.next().charAt(0);
    //                 if(op == 'f'){
    //                     Screens.AddOrder.AddFood();
    //                     try {
    //                         Thread.sleep(1000);
    //                     } catch (InterruptedException ex) {}
    //                     Screens.AddOrder.AmtOfItem();
    //                     count = 0;
    //                 /* which food (press the number of the item)
    //                     amount:
    //                     [Print info back]*/
    //                     count=0;
    //                 }else if(op == 'd'){
    //                     /* which drinks (press the number of the item)
    //                     amount:
    //                     [Print info back]*/
    //                     Screens.AddOrder.AddDrink();
    //                     try {
    //                         Thread.sleep(1000);
    //                     } catch (InterruptedException ex) {}
    //                     Screens.AddOrder.AmtOfItem();
    //                 }
    //                 if (op == 'b'){
    //                     // Back(press b)
    //                     count--;
    //                 }
    //             }while(count==0);
    //         }else
    //        if (op == 'o'){
    //                 // OPEN TABLES (press o)
    //                 // Screen Open Tables
          
    //                 /*|  1    |  2    |  3    |  4 
    //                 |  5    |  6    |  7    |  8 
    //                 |  9    |  10   |  11   |  12 
    //                 |  13   |  14   |  15   |  16 
    //                 |  17   |  18   |  19   |  20 */
    //                 // Choose a table: 12
    //                 Screens.OpenTablesScreen.render();
    //                 int tableNum;
    //                 tableNum = input.nextInt();
    //                 if (tableNum > 0){
    //                     Screens.OpenTablesScreen.tableChoices();
    //                     op = input.next().charAt(0);
    //                     if(op == 'a'){
    //                         //add order process
    //                         int count =0;
    //                         do{
    //                             Screens.RestaurantMenu.render();
    //                             op = input.next().charAt(0);
    //                             if(op == 'f'){
    //                                 Screens.AddOrder.AddFood();
    //                                 try {
    //                                     Thread.sleep(1000);
    //                                 } catch (InterruptedException ex) {}
    //                                 Screens.AddOrder.AmtOfItem();
    //                                 count = 0;
    //                             /* which food (press the number of the item)
    //                                 amount:
    //                                 [Print info back]*/
    //                                 count=0;
    //                             }else if(op == 'd'){ 
    //                                 /* which drinks (press the number of the item)
    //                                     amount:
    //                                     [Print info back]*/
    //                                 Screens.AddOrder.AddDrink();
    //                                 try {
    //                                     Thread.sleep(1000);
    //                                 } catch (InterruptedException ex) {}
    //                                 Screens.AddOrder.AmtOfItem();
    //                             }
    //                             if (op == 'b'){
    //                                 // Back(press b)
    //                                 count--;
    //                             }
    //                         }while(count==0); 
    //                     }else if(op == 'r'){
    //                         //remove
    //                     }else if(op == 'p'){
    //                         //print bill
    //                     }else if(op == 's'){
    //                         //settle 
    //                     }

    //                 }

    //             }
        
        
        

    //     /*Screens.OpenTablesScreen.render();
    //     try {
    //         Thread.sleep(10000);
    //     } catch (InterruptedException ex) {}
    //     Screens.OpenTablesScreen.destroy();

    //     Screens.AddTableScreen.renderAddTable();
    //     Screens.AddTableScreen.renderAmtPeople();
    //     try {
    //         Thread.sleep(10000);
    //     } catch (InterruptedException ex) {}
    //     Screens.AddTableScreen.destroy();*/



    //     // Screens.Menu.render();
    //     // try {
    //     //     Thread.sleep(1000);
    //     // } catch (InterruptedException ex) {}
    //     // Screens.Menu.destroy(); 
       

    //     // // restaurant only has 20 tables to be used. The size of the array is 21 so it can call value allocated in 20. 0 is not used.
    //     // Table[] table = new Table[21];
    //     // // Initiates all objects table, even if the table is empty.
    //     // menuTables();
    //     // // This method is for adding guests and orders for a table that is being used.
    // }
    }
}
    // static void addTable(Table[] table, int tableNum){
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter amount of people in the table:");
    //     int amtOfPeople = input.nextInt();
    //     table[tableNum].setAmountOfPeople(amtOfPeople);
    //     table[tableNum].getOrders();
    //     table[tableNum].printOrders(tableNum);
    // }
    // static void printOrders(Table[] table, int tableNum){
    //     table[tableNum].printOrders(tableNum);
    // }

    // static void tableOccupied(int tableTaken, int tables[][]){
    //     int rows = 4, collumns = 5;

    //     for(int i = 0; i < collumns; i++){
    //         for(int j = 0; j < rows;j++)
    //             if (tables[i][j]==tableTaken) {
    //                 tables[i][j] = 0;
    //             }
    //     }
    //     for(int i = 0; i < collumns; i++){
    //         for(int j = 0; j < rows;j++) {
    //             if (tables[i][j]==0)
    //                 System.out.print("|  # \t");
    //             else
    //                 System.out.print("|  " + tables[i][j] + " \t");
    //         }
    //         System.out.println();
    //     }
    // }
    // static int menuTables(){
    //     int rows = 4, collumns = 5;
    //     int [][] tablesArray = new int[collumns][rows];
    //     int  tables = 1;
    //     System.out.println("Restaurant's Floor map: ");
    //     for(int i = 0; i <collumns; i++){
    //         for(int j = 0; j < rows;j++) {
    //             tablesArray[i][j] = tables++;
    //             System.out.print("|  "+tablesArray[i][j]+ " \t");
    //         }
    //         System.out.println();
    //     }
    //     //----------------------------
    //     Scanner input = new Scanner(System.in);
    //     Table[] table = new Table[21];
    //     for(int i = 0; i < table.length; i++){
    //         table[i] = new Table();
    //     }
    //     System.out.println("Enter table number:");
    //     int t = input.nextInt();
    //     // Press -1 for quitting the loop.
    //     while (t > 0){
    //         addTable(table,t);
    //         tableOccupied(t,tablesArray);
    //         System.out.println("Enter table number:");
    //         t = input.nextInt();

    //     }
    //     int aTable = 0;
    //     System.out.println("would you like to print the order from a table?(press y or n)");
    //     char op = input.next().charAt(0);
    //     if (op== 'y' ) {
    //         System.out.println("which table:");
    //         aTable = input.nextInt();
    //         printOrders(table,aTable);
    //     }
    //     return t;
    // }

