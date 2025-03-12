class Rectangle
{
	int area(int w, int h)
	{
		int res = w*h;
		return res;
	}

	public static void main(String[] args)
	{
		int a = new Rectangle().area(10,30);
		System.out.println("Area of Rectangle is "+a);
	}
}