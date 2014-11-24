// A Circle object represents a circle defined by a center point and a radius.
public class Circle
{
  Point cent;
  double r;
  public Circle()
  {
    center.setX(0);
    center.setY(0);
    r =0.0;
  }
  public Circle(Point begin, Point end){
    radius= begin.distance(end);
    center=begin;
  }
  public Circle(Point cent, double r){
    this.cent=cent;
    this.radius=r;
  }
  public double getRadius(){
    return r;
  }
  public double diameter(){
    double diam=2*r;
    return diam;
  }
  public double circumference(){
    double circl=(2*Math.pi*r);
    return circl;
  }
  public double area()
  {
    double area=Math.pi*(r*r);
    return area;
  }
  public String toString()
  {
    return (cent.toString()+", "+r);
  }
  public void changeRadius(double change)
  {
    r=r+change;
  }
  public void translate(int addx, int addy)
  {
    cent.translate(addx, addy);
  }
}
