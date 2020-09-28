Product class

Implement a Product class with the following attributes.  Every product has an item name and price. The name and price are specified in the constructor of the Product class.

Methods  getName and getPrice should be supplied to access the item name and price.

Supply a method reduce which is passed a percent used to reduce the price of the item.    

//Example of product instantiation use as a pattern :

     Product myfavorite = new Product(“Ginsu Knife”,20.90);

    myfavorite.reduce(10);

    System.out.println(myfavorite.getPrice());         //output is 18.81

Write a tester class names AsSeenOnTV that instantiates three product items.

 

a Robot Sweeper for $24.95,

a  Samuri  Pro for $14.99,

and a Ronco Veg-a-matic for $19.95.

Declare a variable to be used as a shopping cart.

Display each item and its costs. Ask the user if they want to purchase this item . 

If the answer is yes, add the original cost to the user’s shopping cart.  If the answer is no, then print out “but wait, there’s more. It’s on sale today for”  followed by the price reduced by 15%.  Ask the user if he or she wants to purchase it at the new reduced cost. 

 If so, add that price to user’s shopping cart.

If not, go on to the next item and repeat the process.

When all items have been processed, display the total amount in the shopping cart.