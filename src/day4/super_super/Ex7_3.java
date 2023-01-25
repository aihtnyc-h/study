package day4.super_super;

public class Ex7_3 {
    public static void main(String args[]) {
        Child3 c = new Child3();
        c.method();
    }
}
class Parent3 { int x = 10; /* super.x와 tis.x 둘 다 가능 */}
class Child3 extends Parent3{
    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
