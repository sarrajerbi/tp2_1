package tp02;

public class Note {
	private String nomcours;
	private double note;
	public Note(String nomcours, double note) {
		this.nomcours = nomcours;
		this.note = note;
	}
	
	public String getNomcours() {
		return nomcours;
	}
	public void setNomcours(String nomcours) {
		this.nomcours = nomcours;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
}
