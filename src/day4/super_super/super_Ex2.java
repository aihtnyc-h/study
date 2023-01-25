package day4.super_super;

public class super_Ex2 {
    class Point {
        int x, y;

        Point(){
            this.x = 10;
            this.y = 20;
        }

        void move(){
            ++x;
            ++y;
        }
    }

    class Point3D extends Point {
        int z;

        Point3D(){
            super();
            z = 30;
        }
        @Override
        void move() {
            super.move();
            ++z;
        }
    }

    class SuperCEx2 {
        public void main(String[] args) {
            Point point = new Point();
            Point3D point3D = new Point3D();

            point.move();
            System.out.println("point.x = " + point.x);
            System.out.println("point.y = " + point.y + "\n");

            point3D.move();
            System.out.println("point3D.x = " + point3D.x);
            System.out.println("point3D.y = " + point3D.y);
            System.out.println("point3D.z = " + point3D.z);

            // 생성자를 이용한 초기화 시 super() 예약어를 이용하여 부모의 멤버변수를 초기화 할 수 있습니다.
            // 이 때, super()를 생략 하여도 자동으로 컴파일러에서 추가 해 줍니다.
        }
    }
}
