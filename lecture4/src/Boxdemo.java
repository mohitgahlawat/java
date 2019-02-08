class Box{
	double width;
	double height;
	double depth;
     }
	class Boxdemo{
	public static void main( String args[] ){
	Box mybox = new Box();
	double volume;

	 mybox.width = 10;
	 mybox.height = 20;
	 mybox.depth = 30;

	 volume = mybox.width * mybox.depth * mybox.height;

	 System.out.println(" volume is " +volume);
	}
}