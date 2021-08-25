import java.util.Scanner;
public class Client {
	String details;
	String email;
	String creditCard;
	String payPalAccount;
	int choice;
	Scanner sc=new Scanner(System.in);
	public String getDetails() {
		System.out.println("Enter your details:");
		details=sc.next();
		return details;  }
	public String emailInputForVerification () {
		System.out.println("Enter your email for verification:");
		email=sc.next();
		return email;   }
	public void register() {
		getDetails();
		emailInputForVerification (); }
	public boolean login(String e_mail) {
		if(e_mail.equals(email))
			return true;
		else 
			return false;
	}
	public String chooseItems() {
		System.out.println("How many items?");
		int numOfItems=sc.nextInt();
		String itemList="";
		for (int i=0;i<numOfItems;i++) {
			System.out.println("Enter item no."+(i+1)+" :");
			itemList+=sc.next();
			itemList+="\n";
		}
		return itemList;
	}
	public String buyCart() {
		  System.out.println("For credit card- enter 1, for PayPal Enter 2:");
		  choice=sc.nextInt();
		  if (choice==1)
			  return buyWithCreditCard();
		  else if (choice==2)
			  return buyWithPayPal();
		  else
			  return "wrong choice.";
	}
	  public String buyWithCreditCard() {
		  System.out.println("Enter credit card number:");
		  creditCard=sc.next();
		  return creditCard;	  }
	  public String buyWithPayPal() {
		  System.out.println("Enter PayPal number:");
		  payPalAccount=sc.next();
		  return payPalAccount;	  		  }
}
