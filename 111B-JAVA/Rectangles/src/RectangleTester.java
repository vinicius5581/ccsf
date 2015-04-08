public class RectangleTester{
	public static void main(String[] args){
	   MyRectangle r1 = new MyRectangle();
	   MyRectangle r2 = new MyRectangle();
	   
	   r1.setOrigin(3,3);
	   r1.setHeight(2);
	   r1.setWidth(4);
	   r1.setX(4);
	   
	   
	   r2.setOrigin(3,3);
	   r2.setHeight(2);
	   r2.setWidth(10);
	   
	   System.out.println(r1.getArea());
	   System.out.println(r2.getArea());
	   
	   
	   System.out.println(r1.containsPoint(4,4));
	   System.out.println(r1.isContained(r2));
	   
	}
}