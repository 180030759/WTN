package wtn;
class Box{
	double l,b,h;
	public Box(double l, double b, double h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	double display() {
		return l*b*h;
	}
}
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		System.out.println("Volume of a Box="+b.display());
	}

}
