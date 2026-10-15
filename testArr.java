public class testArr {
	public static Point maxSumCordArr(Point [] p) {
		double max=p[0].getX() + p[0].getY();
		int maxi=0;
		for (int i=1; i<p.length; i++) {
			if (p[i].getX()+p[i].getX() > max) {
				maxi = i;
				max = p[i].getX()+p[i].getY();
			}
		}
		return new Point (p[maxi].getX(),p[maxi].getY());
	}
	public static double shortestDistanceFunc(Point [] p){
		double minDistance=p[0].distance(p[1]);
		for(int i=0; i<p.length; i++){
			for(int j=i+1; j<p.length; j++){
				if(p[i].distance(p[j])<minDistance) {
					minDistance=p[i].distance(p[j]);
				}
			}
		}
		return minDistance;
	}
	public static void main(String[] args) {
		Point p[]=new Point[3];
		p[0]=new Point(4,9);
		p[1]=new Point(8,5);
		p[2]=new Point(3,7);
		Point result=maxSumCordArr(p);
		System.out.println("The biggest sum num is: "+result);
		double shortestResult=shortestDistanceFunc(p);
		System.out.println("The shortest distance num is: "+shortestResult);
	}

}
