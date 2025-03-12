class Ellipse
{
	void area(){
		int a = 10, b = 20;
		final double pi = 3.142;
		double res = pi*a*b;
		System.out.println("Area of Ellipse is "+res);
	}

	public static void main(String[] args){
		new Ellipse().area();
	}
}