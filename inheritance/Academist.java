package inheritance;

public abstract class Academist extends Workers {
//kalıtımda bir sınıf bir sınıfı extends ediyorsa
//atası olan sınıfta constructorlar varsa aynısını 
	//çağırmak zorundadır der

	private String position;
	private String section;
	public Academist(String nameSurname, String mp, String eposta, String position, String section) 
{//değişkenleri üst sınıftan miras alıyoruz
		super(nameSurname, mp, eposta);
//ata sınıftaki constructor boş olsaydı hiçbir şey yazmamıza gerek yoktu
		this.section = section;
		this.position = position;
}
	public String getPosition() {
		return position;
	}
	public String getSection() {
		return section;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	public abstract void gotoClass();
	
	@Override
	public void enter() {
		System.out.println(this.getNameSurname() + " academist is enter from A Port");
	}

}
