# shoppingCart

Step 1:

1) Create a bean with name & price corresponding to apple & orange.
2) Create a ShoppingCart class which will store the apple & oranges in a ArrayList.
3) ShoppingCart class will contain a method to add item and a method to checkout items.
4) We will have a main class which will instantiate the ShoppingCart class, add the items to the Array list in ShoppingCart and call the checkout method after all the items are added.


Item.java
  This class will hold the name & price of each item.

ShoppingCart.java Finally call the checkOut()method to 
  This class will have 2 methods and a array list to hold the objects of Item class.
  addItem(String) method will be called each item scanned at the till.
  finally after all the items are added, checkOut() method will be called to display the total amount due.

ShoppingCartMain.java

  This class will get the items to be added to the cart from the String[] arguments passed to the program.
  Convert the String array to an list.
  Create an instance of the ShoppingCart class and call addItem(String) to add apple & oranges. Finally call the checkOut()
  method to display the Checkout total.
  
  Step 2:
  
  Now add the offers to be applied. Add another method addOffer() to add the offer by looping through the ArrayList of items.
  Keep a count variable to count the number of Apples and Oranges in the ArrayList to dedcut the amount of 0.60 for every 2 apples in the
  cart and deduct the amount of 0.25 for every 3 oranges. And finally display the 
