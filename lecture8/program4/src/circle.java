
/*() 1.	Define the class hierarchy as detailed in the following class diagram:
Write an application TestCylinder that uses the above class definitions to maintain and display: 
a)	Radius
b)	Height
c)	base area and 
d)	volume of a cylinder.
Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword
d)	Use getArea () function of the base class in the definition of getVolume()
*/
class Circle extends Shape
{
  protected double radius;

  Circle()
  {
    super();
    radius = 1;
  }

  Circle (double r)
  {
    super();
    radius = r;
  }

  Circle(double r,String c,boolean f)
  {
    super(c,f);
    radius=r;
  }

  double getRadius ()
  {
    return radius;
  }

  void setRadius(double r)
  {
    this.radius = r;
  }

  double getArea()
  {
    return (3.14*radius*radius);
  }

  double getPerimeter()
  {
    return (2*3.14*radius);
  }

  public String toString()
  {
    return (getColor()+"\t"+isFilled()+"\t"+getRadius()+"\t"+getArea()+"\t"+getPerimeter());
  }
}