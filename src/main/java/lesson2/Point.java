package lesson2;

public class Point {
    public static void main(String[] args) {
        Point point=new Point();
        point.cordx=5;
        point.cordy=10;
        System.out.println(point.cordx);
        System.out.println(point.cordy);
        System.out.println(point);
    }
    int cordx;
    int cordy;
    @Override
    public String toString() {
        return "x= "+cordx+"y ="+cordy;
    }


   }
