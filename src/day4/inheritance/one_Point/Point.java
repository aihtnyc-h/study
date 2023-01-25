package day4.inheritance.one_Point;

public class Point {
    int x = 10;
    int y = 10;
}

class Point3D extends Point{
    int z = 30;
}
class PointEx1 {
    public static void main(String[] args){
        Point point = new Point();
        Point3D point3D = new Point3D();

        System.out.println("point.x = " + point.x);
        System.out.println("point.y = " + point.y + "\n");

        System.out.println("point3D.x = " + point3D.x);
        System.out.println("point3D.z = " + point3D.y);
        System.out.println("point3D.y = " + point3D.z);
        // 조상의 멤버를 상속받아 Point3D 클래스에 자동으로 Point의 멤버변수가 추가!
    }
}
