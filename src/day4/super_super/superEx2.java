package day4.super_super;

public class superEx2 {
    class Point2 {
        int x = 10;
        int y = 20;

        void move(){
            ++x;
            ++y;
        }
    }

    class Point3D_2 extends Point2 {
        int z = 30;

        @Override
        void move() {
            super.move();
            ++z;
        }
    }

    class SuperEx2 {
        public void main(String[] args) {
            Point2 point = new Point2();
            Point3D_2 point3D = new Point3D_2();

            point.move();
            System.out.println("point.x = " + point.x);
            System.out.println("point.y = " + point.y + "\n");

            point3D.move();
            System.out.println("point3D.x = " + point3D.x);
            System.out.println("point3D.y = " + point3D.y);
            System.out.println("point3D.z = " + point3D.z);

            // 부모 클래스의 메서드에 기능 추가가 필요 할 경우 super 예약어를 사용할 수 있습니다.
        }
    }
}
