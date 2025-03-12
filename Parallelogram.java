class Parallelogram
{
	void area(){
		int b = 20, h = 30;
		int res = b*h;
		System.out.println("Area of Parallelogram is "+res);
	}

	public static void main(String[] args)
	{
		new Parallelogram().area();
	}
}