

public class Square extends Shape {

	 float edge;
	 float area;
	 float circumfrance;
	 
	@Override
	public float area(float[] p) {
		// TODO Auto-generated method stub
		this.area = p[0]*p[0];
		return area;
	}

	@Override
	protected float circumfrance(float[] l) {
		// TODO Auto-generated method stub
		 this.circumfrance = l[0]*4;
		return this.circumfrance;
	}
	

}
