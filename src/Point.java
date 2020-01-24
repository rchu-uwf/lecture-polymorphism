
public class Point {

	private int pointa;
	private int pointb;
	
	Point(int pointa, int pointb){
		this.pointa = pointa;
		this.pointb = pointb;
	}
	
	public int distanceFromOrigin() {
		double hypotenuse;
		hypotenuse = Math.hypot(pointa, pointb);
		return (int)Math.round(hypotenuse);
	}
}
