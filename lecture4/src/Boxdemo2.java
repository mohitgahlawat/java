
class Box {
double width;
double height;
double depth;
}
// This class declares an object of type Box.
class BoxDemo2 {
public static void main(String args[]) {
Box mybox1 = new Box();
Box mybox2= new Box();
double vol;
// assign values to mybox's instance variables
mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 15;

mybox2.width = 20;
mybox2.depth = 25;
mybox2.height = 30;
// compute volume of box
vol = mybox1.width * mybox1.height * mybox1.depth;
System.out.println("Volume of box1 is  " + vol);


vol = mybox2.width * mybox2.height * mybox2.depth;
System.out.println("Volume of box2 is  " + vol);
}
}