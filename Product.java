/*
* This program is created by Akhil Devarapalli
* I have neither given or recived unathourized help of this assignment - Akhil Devarapalli
*
*/



public class Product{
   //Instance variables
   private String name;
   private double cost;
   
   //Constructor class
   public Product(String name, double cost){
      this.name = name;
      this.cost = cost;
   }
   
   //Methods, getName, Price and reduce
   public String getName(){
      return name;
   }
   
   public double getPrice(){
      return cost;
   }
   
   public void Reduce(double perOff){
      perOff = (100.0 - perOff) / 100.0;
      cost = cost * perOff;
      
   }
   
   public void setItemName (String nm) {
      this.name = nm;
   }
   
   public void setCost (double updatedCost) {
      this.cost = updatedCost;
   }
}