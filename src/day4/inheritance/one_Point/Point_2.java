/*
실패 케이스!!
부모(조상)클래스에서 int y 를 지정을 안해줬기 때문에
자식(자손)클래스에서 받아들일 수 가 없다!

package day4;

public class Point_2 {
    int x = 10;
}

class Point_2_3D extends Point_2{
    int z = 30;
}

class Point_2_Ex2 {
    public static void main(String[] args){
        Point_2 point_2 = new Point_2();
        Point_2_3D point_2_3D = new Point_2_3D();

        System.out.println("Point_2.x = " + point_2.x);
        System.out.println("Point_2.y = " + point_2.y + "\n");

        System.out.println("Point_2_3D.x = " + point_2_3D.x);
        System.out.println("Point_2_3D.y = " + point_2_3D.y);
        System.out.println("Point_2_3D.z = " + point_2_3D.z);
        // 조상 클래스인 Point 클래스의 멤버변수 y가 없어지면서 Point3D 클래스에서도 멤버변수 y를 사용할 수 없게 됨!!
    }
    }
}
*/
