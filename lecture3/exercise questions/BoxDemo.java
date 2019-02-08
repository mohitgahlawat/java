class box
{
	double width;
	double height;
	double depth;

	void setDim()
	{
	 height=3.0;
	 width=4.0;
	 depth=5.0;
	}

	double volume()
	{
	return height*depth*width;
    }
}
class boxDemo
{
	public static void main(String args[])
	{
		box b1 = new box();
		box b2 = new box();
		double var1;
		b1.setDim();
		var1 = b1.volume();		
		System.out.println("volume of box b1 is " + var1 );
    }
}