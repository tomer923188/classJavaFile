
public class PencilCase {
	private String color;
	private Pen[] pens;
	private Pencil[] pencils;
	private Eraser[] erasers;
	public PencilCase(String color) {
		pens = new Pen[5];
		pencils = new Pencil[12];
		erasers = new Eraser[3];
	}
	//adds a pen returns true if it's possible and false if not.
	public boolean addPen(Pen pen) {
		for (int i = 0; i < pens.length; i++) {
			if (pens[i] == null) {
				pens[i] = new Pen(pen);
				return true;
			}
		}
		return false;
	}
	//adds a pencil returns true if it's possible and false if not.
	public boolean addPencil(Pencil pencil) {
		for (int i = 0; i < pencils.length; i++) {
			if (pencils[i] == null) {
				pencils[i] = new Pencil(pencil);
				return true;
			}
		}
		return false;
	}
	//adds a eraser returns true if it's possible and false if not.
	public boolean addEraser(Eraser eraser) {
		for (int i = 0; i < erasers.length; i++) {
			if (erasers[i] == null) {
				erasers[i] = new Eraser(eraser);
				return true;
			}
		}
		return false;
	}
	//prints out the information
	public String toString() {
		return "pen: "+this.pens+" pencils: "+this.pencils+" eraser: "+this.erasers;
	}
	//calculates the total price
	public double calculateOverallPrice() {
		double totalPensPrice = 0;
		double totalPencilsPrice = 0;
		double totalErasersPrice = 0;
		for (int i = 0; i < pens.length; i++) {
			totalPensPrice += pens[i].getPrice();
		}
		for (int i = 0; i < pencils.length; i++) {
			totalPencilsPrice += pencils[i].getPrice();
		}
		for (int i = 0; i < erasers.length; i++) {
			totalErasersPrice += erasers[i].getPrice();
		}
		return (totalPensPrice+totalPencilsPrice+totalErasersPrice);
	}
	//returns pencilcase's color
	public String getColor() {
		return color;
	}
}
