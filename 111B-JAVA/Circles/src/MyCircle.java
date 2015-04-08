/**
 * 
 * This class defines:
 *     circle center X position,
 *     circle center Y position,  
 *     circle radius,
 *     circle area 
 *  and check if 2 circles interpolates.
 * 
 * @author Vinicius Santana
 * @version 1.0
 */

public class MyCircle {
	
	double x;
	double y;
	double radius;
	
	void setX(double x){
		this.x = x;
	}
	
	double getX(){
		return this.x;
	}
	
	void setY(double y){
		this.y = y;
	}
	
	double getY(){
		return this.y;
	}
	
	void setRadius(double radius){
		this.radius = radius; 
	}
	
	double getRadius(){
		return this.radius;
	}
	
	double calculateArea(){
		return radius * radius * Math.PI;
	}
	
	double getArea(){
		return calculateArea();
	}
	
	boolean doesOverlap(MyCircle otherCircle){
		double x2 = otherCircle.x;
		double y2 = otherCircle.y;
		double radius2 = otherCircle.radius;
		
		double sidex = Math.abs(x2 - x);
		double sidey = Math.abs(y2 - y);
		double hypotenuse = Math.sqrt(Math.pow(sidex,2) + Math.pow(sidey,2));
		
		return (hypotenuse <=  radius+radius2);
	}
}
