package inheritance;

public abstract class prelector extends Academist{

	public String flNo;

	public prelector(String nameSurname, String mp, String eposta, String position, String section, String flNo) {
		super(nameSurname, mp, eposta, position, section);
		this.flNo = flNo;
	}

}
