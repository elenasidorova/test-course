package pack.first;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point a, Point b){
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    public double distanceTo(Point a){
        return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
    }

    public static void main(String[] args){
        Point p1 = new Point(1, 1);
        Point p2 = new Point (1,4);
        System.out.println(distance(p1, p2));
        System.out.println(p1.distanceTo(p2));
    }
}
