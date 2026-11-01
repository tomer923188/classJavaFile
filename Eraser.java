
public class Eraser {
	private String color;
	private String shape;
	private double price;
	//constructor
	public Eraser(String color, String shape, double price) {
		this.color = color;
		this.shape = shape;
		this.price = price;
	}
	//copy constructor
	public Eraser(Eraser other) {
		this.color = other.color;
		this.shape = other.shape;
		this.price = other.price;
	}
	//returns the price
	public double getPrice() {
		return price;
	}
	//sets the price
	public void setPrice(double price) {
		this.price = price;
	}
	//returns the color
	public String getColor() {
		return color;
	}
	//sets the color
	public void setColor(String color) {
		this.color = color;
	}
	//returns the shape
	public String getShape() {
		return shape;
	}
	//sets the shape
	public void setShape(String shape) {
		this.shape = shape;
	}
	//prints out the information
	public String toString() {
		return "The eraser's color is: "+this.color+" The eraser's shape is: "+this.shape+" the eraser's price is : "+this.price;
	}
}
