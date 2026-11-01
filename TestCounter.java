
public class TestCounter {
	//random number from 1 to 50 and returns the count
	public static void main(String[] args) {
		int x =(int)( Math.random()*50) +1;
		for (int i = 0; i < x; i++) {
			Counter num = new Counter();
		}
		System.out.println(Counter.getCount());
	}
}
