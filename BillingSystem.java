
public class BillingSystem {

  public boolean buyCart(Client client, String num) {
	  if(client.choice==1)
		  return buyWithCreditCard(client, num);
	  else if (client.choice==2)
		  return buyWithPayPal(client, num);
	  else
		 return false;
  }
  public boolean buyWithCreditCard(Client client, String credit) {
	  if(client.creditCard.equals(credit)) {
		  System.out.println("Thank you for shopping with us, credit card accepted.");
	      return true; 
	  }
	  else {
	      System.out.println("Wrong number.");
          return false;
	  }

  }
  public boolean buyWithPayPal(Client client, String paypal) {
	  if (client.payPalAccount.equals(paypal)) {
	      System.out.println("Thank you for shopping with us, PayPal accepted.");
	      return true;
	  }
	  else {
	      System.out.println("Wrong number.");
          return false;
	  }
  }
}
