package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
	
	
	List<Item> bucket = new ArrayList<Item>();
	
	double checkoutTotal;
	
	ShoppingCart(){
		
	}

	public void addItem(String tillItem) {
		if (tillItem.equalsIgnoreCase("Apple")){	
				bucket.add(new Item(tillItem,0.60));
				System.out.println("Apple added to the bucket");
		}
		else if (tillItem.equalsIgnoreCase("Orange")){
				bucket.add(new Item(tillItem,0.25));
				System.out.println("Orange added to the bucket");
		}
	}

	public double checkOut() {
		// TODO Auto-generated method stub
		for (int i=0;i<bucket.size();i++) {
			checkoutTotal = checkoutTotal +bucket.get(i).getPrice();
		}
		System.out.println("Checkout Total=$"+checkoutTotal);
		return checkoutTotal;
	}

	public void addOffer() {
		int appleCount=0;
		int orangeCount=0;
		System.out.println("Applying Discount");
		for(int i=0;i<bucket.size();i++) {
    		 Item bucketItem = bucket.get(i);
    		 if(bucketItem.getName().equalsIgnoreCase("Apple")) {
    			 appleCount=appleCount+1;
    			 if ((appleCount%2)==0)
    				 checkoutTotal=checkoutTotal-bucketItem.getPrice();
    		 }
    		 else if(bucketItem.getName().equalsIgnoreCase("Orange")) {
    			 orangeCount=orangeCount+1;
    			 if ((orangeCount%3)==0)
    				 checkoutTotal=checkoutTotal-bucketItem.getPrice();
    		 }  		   		 
    	}
		System.out.println("Checkout Total After Discount=$"+checkoutTotal);
	}

}
