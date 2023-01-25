/*
A(객체) instanceof B(클래스) 연산자
A 객체가 B 클래스로 부터 상속을 받았는지 확인할 수 있습니다.
참조변수를 형변환 하기 전에 형변환 가능여부를 확인하기 위해 사용됩니다.
형변환 전에 반드시 instanceof 로 확인을 해야합니다.

어떤 타입에 대한 instanceof 연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다!
 */
package day4.instanceof_Ex;

public class instancrof_Ex1 {
    class A {}
    class B extends A{}
    class Instanceof {
        public void main(String[] args) {
            A a = new A();
            B b = new B();

            System.out.println("a instanceof A = " + (a instanceof A));

            // a 객체는 B 클래스의 부모 클래스 입니다.
            // 따라서 아래는 false 입니다.
            System.out.println("a instanceof B = " + (a instanceof B));

            System.out.println("b instanceof A = " + (b instanceof A));

            System.out.println("b instanceof B = " + (b instanceof B));
        }
    }
}
