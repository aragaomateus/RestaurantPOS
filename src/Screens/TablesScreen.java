package Screens;

public class TablesScreen {
    public static void render(){
        System.out.println("------Tables-----");
        int count = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++)
                System.out.print("|  " + count++ + "\t");
            System.out.println();
        }
    }
    
}
