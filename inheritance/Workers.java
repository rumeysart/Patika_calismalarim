package inheritance;

public class Workers {
//burada aslında super(); şeklinde bir kod var ama 
	//gereksiz olduğundan gözükmüyor
	private String nameSurname;
	private String mp;
	private String eposta;
	
	public Workers(String nameSurname, String mp, String eposta) {
		this.nameSurname = nameSurname;
		this.mp = mp;
		this.eposta = eposta;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public String getMp() {
		return mp;
	}

	public String getEposta() {
		return eposta;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public void setMp(String mp) {
		this.mp = mp;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	public void enter() {
		System.out.println(this.getNameSurname() + " enter to the University");
	}
	
	public void exit()
	{
		System.out.println(this.getNameSurname() + " exit from the Univeristy");
	}
	
	public void cafeteria() {
		System.out.println(this.getNameSurname() + " enter to the Cafeteria");
	}
	
	
	
	
	
}
