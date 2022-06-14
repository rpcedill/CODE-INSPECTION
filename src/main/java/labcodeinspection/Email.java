package labcodeinspection;

public class Email {

	final transient private String mFirstName;
	final transient private String mLastName;
	transient private String password;
	private transient String department;
	final private transient int defpwrdLngth = 8;
	private transient String email;
	/*
	 * Email class's constructor
	 *
	*/
	public Email(final String firstName, final String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
	}
	/*
	 * showInfo function
	 *
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mFirstName + "\nLAST NAME= " + mLastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/*
	 * setDeparment function
	 *
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}
	/*
	 * randomPassword function
	 *
	*/
	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/*
	 * generateEmail function
	 *
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defpwrdLngth);
		this.email = this.mFirstName.toLowerCase() + this.mLastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
