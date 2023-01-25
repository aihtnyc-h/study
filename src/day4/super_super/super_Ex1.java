package day4.super_super;

public class super_Ex1 {
    class Parent11 {
        int x,y,z;

        public Parent11() {
            System.out.println("난 부모 클래스 생성자");
        }

        public Parent11(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    class Child11 extends Parent11 {

        Child11() {
            // super() 를 통해서 부모 클래스의 멤버변수를 초기화합니다.
            super(10,20,30);
        }

        Child11(int num) {
            // 이렇게 생성자에 this() or super() 가 없으면 자동으로 컴파일러가 super(); 를 붙여준다.

            // 주의!!
            // 그런데 만약 위에 부모클래스의 기본 생성자를 넣지 않으면 현재 오버로딩한 부모클래스의 생성자가 있기 때문에
            // 컴파일러가 기본 생성자를 만들어주지 않지만 여기에는 super(); 로 부모클래스의 기본생성자를 호출하기 때문에 오류가 발생한다.
            // 위에 부모클래스 기본 생성자 주석 해보자!
            System.out.println("오버로딩 생성자");
        }
    }

    class SuperCEx1 {
        public void main(String[] args) {
            Child11 child = new Child11(); // 이렇게 하면 super(10,20,30);를 통해 값 초기화
            System.out.println("child11.x = " + child.x);
            System.out.println("child11.y = " + child.y);
            System.out.println("child11.z = " + child.z);
            System.out.println();

            new Child11(10000);
        }
    }
}
