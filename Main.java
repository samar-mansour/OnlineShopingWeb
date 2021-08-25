
public class Main {
	public static void main(String[] args) {
	Client client=new Client();
	Admin admin=new Admin();
	BillingSystem billingSystem=new BillingSystem();
	ShoppingSystem shoppingSystem=new ShoppingSystem(client, admin, billingSystem);
	shoppingSystem.register();
	if(shoppingSystem.login()) {
	  shoppingSystem.chooseItems();
	  if(shoppingSystem.buyCart())
	      System.out.println("Thank you for buying in shop4MeAndYouToo!");
	  else {
		  System.out.println("Something went wrong in the buying process, please try again.");
	  }
	}
	else {
		System.out.println("Wrong login!");
	}
		
	
	}

}
