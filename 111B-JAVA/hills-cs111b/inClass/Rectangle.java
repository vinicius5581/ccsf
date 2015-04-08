public class RectangleTester{
	public void main(string[] args){
	   MyRectangle r1 = new MyRectangle();
	   MyRectangle r2 = new MyRectangle();
	   
	   r1.setOrigin(3,3);
	   r1.setHeight(2);
	   r1.setWidth(4);
	   r1.setX(-10);
	   System.out.println(r1.getArea());
	}
}
public class Rectangle {
	double x;
	double y;
	double width;
	double height;
	public void setX(double value){
		value = x;
	}
	public double getX(){
		return x;
	}
	public double getArea(){
		return width * height;
	}
}
