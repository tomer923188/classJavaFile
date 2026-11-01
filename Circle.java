
public class Circle {
	//constructor
	private Point center,edge;
	public Circle(Point center, Point edge) {
		this.center = center;
		this.edge = edge;
	}
	//copy constructor
	public Circle(Circle other) {
		this.center = other.center;
		this.edge = other.edge;
	}
	//returns the center
	public Point getCenter() {
		return center;
	}
	//returns the edge
	public Point getEdge() {
		return edge;
	}
	//sets a new center
	public void setCenter(Point center) {
		this.center = center;
	}
	//sets a new edge
	public void setEdge(Point edge) {
		this.edge = edge;
	}
	//returns the details of the center
	public String toString() {
		return "The center is: "+center+" The edge is: "+edge;
	}
	//calculates the parameter
	public double getParameter() {
		double p = center.distance(edge);
		return 2*Math.PI*p;
	}
	//calculates the area
	public double getArea() {
		double a = center.distance(edge);
		return Math.PI*Math.pow(a, 2);
	}
	//checks if 2 circles are equal
	public boolean isCircleEquals(Circle other) {
		double e1, e2;
		e1 = this.center.distance(this.edge);
		e2 = other.center.distance(other.edge);
		return e1==e2 && this.center.isEquale(other.center);
	}
	//gets 2 circles and returns the one that is bigger
	public Circle returnBiggerArea(Circle other) {
		if(this.getArea() > other.getArea()) {
			return new Circle(this);
		}
		else {
			return new Circle(other);
		}
	}
}
