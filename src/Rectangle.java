// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  Point ori;
  Point topRight;
  int wid;
  int heig;
  public Rectangle(Point one, Point two){
    topRight=two;
    ori=one;
    wid=topRight.x-ori.x;
    heig=topRight.y-ori.y;
  }
  public Rectangle (Point p, int width, int height){
    ori=p;
    this.wid=width;
    this.heig=height;
    topRight.setX(ori.x+width);
    topRight.setY(ori.y+height);
  }
  public Rectangle(){
    heig=0;
    wid=0;
    ori.setX(0);
    ori.setY(0);
  }
  public void translate(int addx, int addy){
    ori.translate(addx, addy);
    topRight.translate(addx, addy);
  }
  public void scale(int upx, int outy){
    wid+=upx;
    heig+=outy;
    topRight.setX(topRight.x+upx);
    topRight.setY(topRight.y+outy);
  }
  public int getHeight(){
    return heig;
  }
  public int getWidth(){
    return wid;
  }
  
  public double perimeter(){
    return (double) (wid*2)+(heig*2);
  }
  public double area(){
    return (double) wid*heig;
  }
  public double diagonal(){
    return ori.distance(topRight);
  }
  public Point getBottomLeft(){
    return ori;
  }
  public Point getTopRight(){
    return topRight;
  }
  public boolean isSquare(){
    if (wid==heig){
      return true;
    }
    else{
      return false;
    }
  }
  public String toString(){
    return (ori.toString()+", "+topRight.toString());
  }
}
