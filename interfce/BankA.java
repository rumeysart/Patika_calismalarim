package interfce;

public class BankA implements IBank{
// burada ,IDeneme şeklinde birden fazla interface eklenebilir
	private String nameBank;
	private String termId;
	private String password;
	
	public BankA(String nameBank, String termId, String password)
	{
		this.nameBank = nameBank;
		this.password = password;
		this.termId = termId;
	}
	@Override
	public boolean connect(String ipAddress)
	{
		System.out.println("User ip: " + ipAddress);
		System.out.println("Machine ip: "+ this.hostIpAddress );
		System.out.println(this.nameBank + "  connected!");
		return true;
	}
	@Override
	public boolean payment(double price, String cardNumber, String date, String cvc) {
		//banka ödeme işlemleri
		System.out.println("Waiting answer from bank...");
		System.out.println("Successful transaction");
		return true;
	}

	public String getNameBank() {
		return nameBank;
	}

	public String getTermId() {
		return termId;
	}

	public String getPassword() {
		return password;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
