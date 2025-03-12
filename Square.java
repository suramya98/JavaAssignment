class Square
{
	void area(int a)
	{
		int res = a*a;
		System.out.println("Area of Square is "+res);
	}

	public static void main(String[] args)
	{
		new Square().area(5);
	}
}
