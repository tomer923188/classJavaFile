public class CircleArr {
	private Circle[] circleArr;
	private int noOfCir;
	private final int MAX = 50;
	//constructor
	public CircleArr() {
		circleArr = new Circle[MAX];
		noOfCir = 0;
	}
	//adds a new circle to the array and checks if the arry is full if it is returns false
	public boolean addCir(Circle other) {
		if(noOfCir == MAX) {
			return false;
		}
		else {
			circleArr[noOfCir] = other;
			noOfCir++;
			return true;
		}
	}
	//removes a circle from the array
	public void deleteCir(Circle target) {
		for(int i = 0; i < noOfCir; i++) {
			if (circleArr[i].equals(target)) {
				for (int j = i; j < noOfCir - 1; j++) {
				    circleArr[j] = circleArr[j + 1];
				}
				noOfCir--;
	            circleArr[noOfCir] = null;
	            break;
			}
		}
	}
	//goes through the array and finds the circle with the biggest area
	public Circle biggestCircle() {
		if(noOfCir == 0) {
			return null;
		}
		int indexOfMaxArea = 0;
		double max = 0;
		for(int i = 0; i < noOfCir; i++) {
			if(circleArr[i].getArea() > max) {
				max = circleArr[i].getArea();
				indexOfMaxArea = i;
			}
		}
		System.out.println("The biggest area found was: "+max);
		return new Circle(circleArr[indexOfMaxArea]);
	}
	
}
