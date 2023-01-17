import java.util.Scanner;
public class Business {
    public static void main(String[] args) throws InterruptedException {
        
        String companyName = "Aryan's Food Truck";
        String userName = "Aryan";
        String[] menuItems = new String[] { "Tacos", "Burger", "Sandwich", "Nachos", "Pizza", "Fries", "Pasta", "Soda", "Water", "Cake" };
        
        
        Scanner scan = new Scanner(System.in);
        String decorativeLine = "\n****************************************\n";
        
        //opening lines
        System.out.println(decorativeLine);
        Thread.sleep(750);
        System.out.println("Welcome to " + companyName + "!");
        Thread.sleep(750);
        System.out.println("I'm " + userName + ". What's your name?");
        Thread.sleep(400);
        String getName = scan.next();
        Thread.sleep(400);
        System.out.println("Hello " + getName + "!\n...\n");
        Thread.sleep(400);
        System.out.println("Here's what we serve, " + getName + ". Have a look:");
        Thread.sleep(400);

       //display menu items
        int x = 1; 
        for (String i : menuItems){
            System.out.println(x + ":" + i);
            x++;
            }

        //ask user how many items they want
        System.out.println("How many items would you like to buy " + getName + "?");
        int getNumItems = scan.nextInt();
        int[] purchase = new int[getNumItems];

        int var1 = 0;
        while(var1 < purchase.length){
            int var2;
            System.out.println("What's the menu number?");
            var2 = scan.nextInt();
            while(var2 > 10 || var2 < 1){
                System.out.println("Please pick a number between 1-10");
                var1 = scan.nextInt();
            }
            purchase[var1] = var2;
            var1++;
        }
        //order display
        System.out.println("\n...\n\nThanks for ordering with " + companyName + "!\nYou ordered the following items:");
        int var3 = 0;
        for(int var4 : purchase){
            System.out.print(menuItems[var4 - 1]);
            if (var3 < getNumItems - 1){
                System.out.print(", ");
                var3++;
            }
        }
        System.out.println("\n\nHave a nice day!");
        scan.close();
            
        }
    }

