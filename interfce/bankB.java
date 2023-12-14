package interfce;

public class bankB implements IBank{
	private String nameBank;
	private String password;
	private String termId;

	public bankB(String nameBank, String termId, String password)
	{
		this.nameBank = nameBank;
		this.password = password;
		this.termId = termId;
	}

	public String getNameBank() {
		return nameBank;
	}

	public String getPassword() {
		return password;
	}

	public String getTermId() {
		return termId;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	@Override
	public boolean connect(String ipAddress) 
	{
		System.out.println("User ip: " + ipAddress);
		System.out.println("Machine ip: "+ this.hostIpAddress );
		System.out.println(this.nameBank + "  connected!");
		return false;
	}

	@Override
	public boolean payment(double price, String cardNumber, String date, String cvc) {
		System.out.println("Waiting answer from bank...");
		System.out.println("Successful transaction");
		return false;
	}
}
