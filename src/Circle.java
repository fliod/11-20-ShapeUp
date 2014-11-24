import java.lang.Math;
public class Circle{
  Point cent;
  double r;
  public Circle(){
    cent.setX(0);
    cent.setY(0);
    r =0.0;
  }
  public Circle(Point begin, Point end){
    r= begin.distance(end);
    cent=begin;
  }
  public Circle(Point cent, double r){
    this.cent=cent;
    this.r=r;
  }
  public double getRadius(){
    return r;
  }
  public double diameter(){
    double diam=2*r;
    return diam;
  }
  public double circumference(){
    double circl=(2*Math.PI*r);
    return circl;
  }
  public double area(){
    double area=Math.PI*(r*r);
    return area;
  }
  public String toString(){
    return (cent.toString()+", "+r);
  }
  public void changeRadius(double change){
    r=r+change;
  }
  public void translate(int addx, int addy){
    cent.translate(addx, addy);
  }
}
