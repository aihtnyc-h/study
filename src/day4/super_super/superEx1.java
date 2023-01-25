package day4.super_super;

public class superEx1 {
    class Parent1 {
        int x = 10;
    }

    class Child1_1 extends Parent1 {
        int x = 30; // 조상 클래스 x 와 변수명이 동일
        // 이름이 같아도 둘다 존재합니다. 그래서 super 참조변수로 구별합니다.

        Child1_1() {
            System.out.println("생성자에서 조상의 변수 x 접근 = " + super.x);
            System.out.println("생성자에서 현재 객체 자신의 x = " + this.x);
        }

        void child1Method() {
            System.out.println("Child 의 x = " + x);
            System.out.println("현재 객체 자신의 x = " + this.x);
            System.out.println("Parent 의 x 의 " + super.x);

            // 만약 Child 에 변수 x 가 없다고 한다면
            // 위 int x = 30; 을 주석하시면 this.x 는 부모클래스의 x를 가리킵니다.
            // Child 의 x = 10 이 됩니다.
        }

    }

    class SuperEx1 {
        public void main(String[] args) {
            Child1_1 child = new Child1_1();
            child.child1Method();
        }
    }
}
