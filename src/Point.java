// A Point object represents a pair of (x, y) coordinates.
public class Point
{
  int x;
  int y;
  public Point(){
  x=0;
  y=0;
  }
  public Point(int x, int y){
    this.x=x;
    this.y=y;
  }
  public void setX(int x){
    this.x=x;
  }
  public void setY(int y){
    this.y=y;
  }
  public String toString(){
    return ("("+x+", "+y+")");
  }
  public double distanceFromOrigin(){
   double dist= java.lang.Math.sqrt((x*x)+(y*y));
   return dist;
  }
  public double distance(Point k){
   double kx=k.x;
   double ky=k.y;
   return Math.sqrt((kx-x)*(kx-x) + (ky-y)*(ky-y));
  }
  public void translate(int addx, int addy)
  {
    x=x+addx;
    y=y+addy;
  }
}
