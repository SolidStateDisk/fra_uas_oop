package oopProject;

public class ticket {
	private String vorname;
	private String nachname;
	private String fehlerart;
	private String [] eintrag;
	private String [] kategorie;
	private String produktnummer;
	private int id;
	
	public ticket(  String vorname,String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		//addTicketToKunde();
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}	
	
}
