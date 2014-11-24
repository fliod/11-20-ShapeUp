// A Line object represents a line defined by a pair of Points.
public class Line{
  begin = new Point();
  end = new Point();
  public Line(){
    begin.setX(0);
    end.setX(0);
    begin.setY(0);
    end.setY(0);
  }
  public Line(Point start, Point finish){
    begin=start;
    end=finish;
  }
  public double length(){
    Double length= begin.distance(end);
    return length;
  }
  public double slope(){
    double slope= (begin.y-end.y)/(begin.x-end.x);
    return slope;
  }
  public String toString(){
    String x= ("["+begin.toString()+", "+end.toString()+"]");
    return x;
  }
  public void translate(int addx, int addy){
    start.translate(addx, addy);
    end.translate(addx, addy);
  }
}
