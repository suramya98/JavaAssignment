class Circle
{
	double area(int r){
		final double pi = 3.142;
		double res = pi*r*r;
		return res;
	}

	public static void main(String[] args)
	{
		double a = new Circle().area(10);
		System.out.println("Area of Circle is "+a);
	}
}