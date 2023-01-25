package day4.overriding;

public class three {
    class Point {
        int x = 10;
        int y = 20;

        void move(){
            ++x;
            ++y;
        }
    }

    class Point3D extends Point {
        int z = 30;

        @Override
        void move() {
            ++x;
            ++y;
            ++z;
        }
    }
/*
    class OverrideEx2 {
        public static void main(String[] args) {
            Point point = new Point();
            Point3D point3D = new Point3D();

            point.move();
            System.out.println("point.x = " + point.x);
            System.out.println("point.y = " + point.y + "\n");

            point3D.move();
            System.out.println("point3D.x = " + point3D.x);
            System.out.println("point3D.y = " + point3D.y);
            System.out.println("point3D.z = " + point3D.z);

            // Point의 move는 x, y축으로 1칸씩 앞으로 이동하지만, Point3D의 move는 z축으로도 1만큼 움직입니다.
        }
    }

 */
}
