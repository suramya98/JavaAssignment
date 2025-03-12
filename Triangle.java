class Triangle
{
	void area()
	{
		double b = 5, h = 10;
		double res = (b*h)/2;
		System.out.println("Area of Triangle is "+res);
	}

	public static void main(String[] args)
	{
		new Triangle().area();
	}
}