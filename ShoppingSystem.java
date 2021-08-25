import java.util.Scanner;

public class ShoppingSystem {
  Client client;
  Admin admin;
  BillingSystem billingSystem;
  public ShoppingSystem(Client c, Admin a, BillingSystem bs) {
	  client=c;
	  admin=a;
	  billingSystem=bs;
  }
  Scanner sc=new Scanner(System.in);
  public boolean register() {
	  client.register();
	  return admin.emailVerification(client, client.email);
  }
  public boolean login() {
	  System.out.println("Enter your email for login:");
	  String email= sc.next();
	  return client.login(email);
  }
  public void chooseItems() {
	  System.out.println(client.chooseItems());
  }
  public boolean buyCart() {
	  return billingSystem.buyCart(client, client.buyCart());
  }


}
