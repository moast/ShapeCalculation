

import java.awt.*;
import javax.swing.*;

public class MainApp extends JApplet {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(1);
		Square square = new Square();
		Triangle triangle = new Triangle();
	
		float[] radius = {3};
		float[] length = {2};
		float[] edges = {1,2,3};
		
		
		System.out.println("Circle Area: " + circle.area(radius));
		System.out.println("Circle Circumfrance: " + circle.circumfrance(radius));
		
		System.out.println("Square Area: " + square.area(length));
		System.out.println("Square Circumfrance: " + square.circumfrance(length));
		
		System.out.println("Triangle Area: " + triangle.area(edges));
		System.out.println("Triangle Circumfrance: " + triangle.circumfrance(edges));
		
		
	}
      public void paint(Graphics g,Circle c,float[] radius){
		
		g.drawString("Circle Area:" + c.area(radius), 12, 12);
		
		
	}
	
	
	
	


}
