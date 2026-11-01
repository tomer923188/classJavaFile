import java.util.Scanner;
public class TestCircleArr {
	//gets a array and a circle objects and adds the circle to array
	public static void addsCircleToArr(CircleArr arr, Circle c) {
		arr.addCir(c);
	}
	//gets 2 points from the user and makes a circle from it
	public static void makeCircleFromUser(Scanner input) {
		System.out.println("Give the center point ");
		System.out.println("x: ");
		double x1 = input.nextDouble();
		System.out.println("y: ");
		double y1 = input.nextDouble();
		System.out.println("Give a edge point: ");
		System.out.println("x: ");
		double x2 = input.nextDouble();
		System.out.println("y: ");
		double y2 = input.nextDouble();
		Point center = new Point(x1,y1);
		Point edge = new Point(x2,y2);
		Circle result = new Circle(center, edge);
		System.out.println(result);
	}
	/* gets an array and returns the circle with the biggest area 
	 * hey samar :)
	 */
	public Circle returnBiggestCircle(CircleArr arr) {
		return arr.biggestCircle();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point x1 = new Point(8,9);
		Point y1 = new Point(6,1);
		Point x2 = new Point(4,7);
		Point y2 = new Point(3,6);
		Circle c = new Circle(x1,y1);
		c.getCenter();
		c.getEdge();
		c.setCenter(x2);
		c.setEdge(y2);
		c.toString();
		c.getParameter();
		c.getArea();
		Circle other = new Circle(x1,x2);
		c.isCircleEquals(other);
		other.returnBiggerArea(c);
		input.close();
	}

}
