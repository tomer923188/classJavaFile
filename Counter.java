
public class Counter {
	private static int count = 0;
	//constructor
	public Counter() {
		count++;
	}
	//returns the count
	public static int getCount() {
		return count;
	}
}
