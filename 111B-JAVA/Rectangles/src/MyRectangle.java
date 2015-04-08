public class MyRectangle {
	double x;
	double y;
	double width;
	double height;
	
	public MyRectangle(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	} 
	public MyRectangle(){
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
	} 

	
	public void setX(double value){
		value = x;
	}
	public void setY(double value){
		value = y;
	}
	public void setOrigin(double valueX, double valueY){
		x = valueX;
		y = valueY;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getArea(){
		return width * height;
	}
	public void setHeight(double valueH){
		height = valueH;
	}
	public void setWidth(double valueW){
		width = valueW;
	}
	public boolean containsPoint(double valueX, double valueY){
		double testX = valueX;
		double testY = valueY;
		
		if (testY < y || testY > y+height) {
			return false;
		}
		else if (testX < x || testX > x+height){
			    return false;
		}
		else{
			return true;
		}
	}
	public boolean isLargerThan(MyRectangle r){
	    return this.getArea() > r.getArea(); //keyword this is optional
	}
	public boolean isContained(MyRectangle r){
		double x2 = r.x;
		double y2 = r.y;
		double width2 = r.width;
		double height2 = r.height;		
		
		if(containsPoint(x2,y2)){
			containsPoint(x2+width2,y2+height2);
		}
		return false;
	}
}