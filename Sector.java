class Sector
{
	void area(int r, double t){
		double res = (r*r*t)/2;
		System.out.println("Area of Sector is "+res);
	}

	public static void main(String[] args){
		new Sector().area(5,80.92);
	}
}