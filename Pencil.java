
public class Pencil {
	private String color;
	private boolean sharp;
	private double price;
	//constructor
	public Pencil (String color, boolean sharp, double price) {
		this.color = color;
		this.sharp = sharp;
		this.price = price;
	}
	//copy constructor
	public Pencil (Pencil other) {
		this.color = other.color;
		this.sharp = other.sharp;
		this.price = other.price;
	}
	//returns the color
	public String getColor() {
		return color;
	}
	//returns true or false about if it's sharp
	public boolean getSharp() {
		return sharp;
	}
	//returns the price
	public double getPrice() {
		return price;
	}
	//sets the color
	public void setColor(String color) {
		this.color = color;
	}
	//sets if it's sharp or not
	public void setSharp(boolean sharp) {
		this.sharp = sharp;
	}
	//sets the price
	public void setPrice(double price) {
		this.price = price;
	}
	//prints out the information
	public String toString() {
		return "The pencil's color is: "+this.color+" The pencil's price is: "+this.price+" is the pencil sharp : "+this.sharp;
	}
	//gets 2 pencils and prints true or false on if their colors are the same
	public boolean sameColor(Pencil other) {
		if (this.getColor() == other.getColor()) {
			return true;
		}
		else {
			return false;
		}
	}
}
