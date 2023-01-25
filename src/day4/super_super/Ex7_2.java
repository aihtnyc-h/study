/*
super
객체 자신을 가리키는 참조변수입니다.
인스턴스 메서드(생성자) 내에서만 존재합니다.
조상의 멤버를 자신의 멤버와 구별할 때 사용합니다.
 */

package day4.super_super;

public class Ex7_2 {
    public static void main(String args[]) {
        Child2 c = new Child2();
        c.method();
    }
}
    class Parent2 {int x = 10; /* super.x */}
    class Child2 extends Parent2 {
        int x = 20; // this.x
        public void method() {
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("super.x=" + super.x);

        }
    }

