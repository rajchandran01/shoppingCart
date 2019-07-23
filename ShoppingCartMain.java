package shoppingCart;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartMain {

	public static void main(String[] args) {
		
		List<String> till = Arrays.asList(args);
		ShoppingCart shoppingCart = new ShoppingCart();
		if(!till.isEmpty()) {
    		for(String tillItem: till){
    			shoppingCart.addItem(tillItem);
    		}
    	}
		shoppingCart.checkOut();
		shoppingCart.addOffer();
		
	}

}
