//Imports 
import java.util.Scanner;
import java.lang.String;

public class AsSeenOnTv{
   public static void main (String [] args){
      double cart = 0;
      String ans;
      
      //Create the products
      Product Robot_Sweeper = new Product("Robot Sweeper", 24.95);
      Product Samuri_Pro = new Product("Samuri pro", 14.99);
      Product Veg_a_matic = new Product("Ranco Veg-a-matic", 19.95);
      
      //Ask if they want to buy product and show sale price
      
      //Start of robot Sweeper code
      Scanner scan = new Scanner(System.in);
      System.out.println("Would you like to buy " + Robot_Sweeper.getName() + " for $" + Robot_Sweeper.getPrice() + " Please type y for yes and n for no");
      ans = scan.nextLine();
      if(ans.equals("y") || ans.equals("Y")){
         cart += Robot_Sweeper.getPrice();
      }else{
         Robot_Sweeper.Reduce(15);
         System.out.println("But wait we have a sale the product is $" + Robot_Sweeper.getPrice() + " Would you like to purchase is now? y for yes and n for no");
         ans = scan.nextLine();
         if (ans.equals("y") || ans.equals("Y")){
            cart += Robot_Sweeper.getPrice();
         }
      }
      //End Robot Sweeper code
      
      //Start of Samuri pro
      System.out.println("Would you like to buy " + Samuri_Pro.getName() + " for $" + Samuri_Pro.getPrice() + " Please type y for yes and n for no");
      ans = scan.nextLine();
      if(ans.equals("y") || ans.equals("Y")){
         cart += Samuri_Pro.getPrice();
      }else{
         Samuri_Pro.Reduce(15);
         System.out.println("But wait we have a sale the product is $" + Samuri_Pro.getPrice() + " Would you like to purchase is now? y for yes and n for no");
         ans = scan.nextLine();
         if (ans.equals("y") || ans.equals("Y")){
            cart += Samuri_Pro.getPrice();
         }
      }
      //End of Sumuri pro code
      
      //Start of Veg-a-Matic code
           
      System.out.println("Would you like to buy " + Veg_a_matic.getName() + " for $" + Veg_a_matic.getPrice() + " Please type y for yes and n for no");
      ans = scan.nextLine();
      if(ans.equals("y") || ans.equals("Y")){
         cart += Veg_a_matic.getPrice();
      }else{
         Veg_a_matic.Reduce(15);
         System.out.println("But wait we have a sale the product is $" + Veg_a_matic.getPrice() + " Would you like to purchase is now? y for yes and n for no");
         ans = scan.nextLine();
         if (ans.equals("y") || ans.equals("Y")){
            cart += Veg_a_matic.getPrice();
         }
      }
      //End of Veg-O-Matic code
      System.out.println("Thank you for shopping with us. Your total is " + cart);
   }
}