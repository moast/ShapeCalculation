 

public class Triangle extends Shape{

	
	@Override
	public float area(float[] p) {
		// TODO Auto-generated method stub
		this.area = 0;
		return 0;
	}

	@Override
	protected float circumfrance(float[] l) {
		// TODO Auto-generated method stub
		this.circumfrance = l[0]+l[1]+l[2];
		return this.circumfrance;
	}

}
