package day4.overriding;

public class two {
    class Point {
        int x,y;
        String getLocation() {
            return "x: " + x + ", y: " + y;
        }
    }

    class Point3D extends Point {
        int z;

//    @Override
//    String getLocation() {
//        return "x: " + x + ", y: " + y + ", z: " + z;
//    }
//    }

//    class OverrideEx1 {
//       public static void main(String[] args) {
//           Point3D point3D = new Point3D();
//            point3D.x = 10;
//            point3D.y = 20;
//            point3D.z = 30;
//            System.out.println(point3D.getLocation());

            // 조상 클래스 Point 의 getLocation 를 그대로 사용하면 z 는 출력되지 않습니다.
            // 위에 Point3D의 getLocation 주석을 제거해 주세요!
        }
    }
//}
