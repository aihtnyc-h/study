/*
오버라이딩
상속받은 조상의 메서드를 자신에게 맞게 변경하는 것 => 자식이 상속받아서 나한테 맞춰 변경하는 것
-선언부는 변경 불가 !
-메서드 내부의 내용만 변경할 수 있다.
 */

package day4.overriding;

public class one {
    class Point {
        int x;
        int y;

        String getLocation() {
            return "x : " + x + ", y :"+ y;
        }
    }

    class Point3D extends Point {
        int z;

        @Override
        String getLocation() {
            return "x :" + x + ", y :" + y + ", + z :" + z;
        }
    }
}
