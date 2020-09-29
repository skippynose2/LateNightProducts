public class Product{
   //Instance variables
   private String name;
   private double price;
   
   //Constructor class
   public Product(String name, double price){
      this.name = name;
      this.price = price;
   }
   
   //Methods, getName, Price and reduce
   public String getName(){
      return name;
   }
   
   public double getPrice(){
      return price;
   }
   
   public void Reduce(double perOff){
      perOff = (100.0 - perOff) / 100.0;
      price = price * perOff;
      
   }
}