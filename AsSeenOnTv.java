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
      
      //robot Sweeper code
      Scanner scan = new Scanner(System.in);
      System.out.println("Would you like to buy " + Robot_Sweeper.getName() + " for $" + Robot_Sweeper.getPrice() + " Please type y for yes and n for no");
      ans = scan.nextLine();
      if(ans.equals("y") || ans.equals("Y")){
         cart += Robot_Sweeper.getPrice();
         System.out.println(cart);
      }else{
         Robot_Sweeper.Reduce(15);
         System.out.println("But wait we have a sale the product is $" + Robot_Sweeper.getPrice() + " Would you like to purchase is now? y for yes and n for no");
         ans = scan.nextLine();
         if (ans.equals("y")){
            cart += Robot_Sweeper.getPrice();
            System.out.println(cart);
         }
      }
      //End Robot Sweeper code
      
      //Start of Samuri pro
      
      //End of Sumuri pro code
   }
}