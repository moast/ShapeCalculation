

import java.lang.*;

public class Circle extends Shape{
	
	 float radius;
	
	 public Circle(){
		 
	 }
	
	public Circle(float r){
	    this.radius = r;	
	}

	@Override
	public float area(float radius[]) {
		
		float pi = (float) Math.PI;
		this.area = (float) (pi * (Math.pow(radius[0], 2)));
		return area;
	}
	
	@Override
	protected float circumfrance(float radius[]) {
		// TODO Auto-generated method stub
		float pi = (float) Math.PI;
		this.circumfrance = 2*pi* radius[0];
		return this.circumfrance;
	}


	




}
