
public class Admin {
	public boolean emailVerification (Client client, String email) {
		if (client.email.equals(email))
			return true;
		else
			return false;
	}

}
