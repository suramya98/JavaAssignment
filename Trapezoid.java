class Trapezoid
{
	void area(int a, int b, double h)
	{
		double res = ((a+b)/2)*h;
		System.out.println("Area of Trapezoid is "+res);
	}

	public static void main(String[] args)
	{
		new Trapezoid().area(10,5,80.97);
	}
}