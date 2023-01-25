package day4.parameter_polymorphism;

public class Parent_ex2 {

        void accost() {
            System.out.println("Parent.accost");
        }
    }

    class Child1 extends Parent_ex2 {
        @Override
        void accost() {
            System.out.println("Child1.accost");
        }
    }

    class Child2 extends Parent_ex2 {
        @Override
        void accost() {
            System.out.println("Child2.accost");
        }
    }

    class Child3 extends Parent_ex2 {
        @Override
        void accost() {
            System.out.println("Child3.accost");
        }
    }

    class Poly {
        //    void checkChild(Child1 child) { // 이렇게 하면 Child2,3를 사용하지 못하니 활용성이 떨어진다.
//        child.accost();
//    }
        void checkChild(Parent_ex2 child) {
            child.accost();
        }
    }

    class ParPoly2 {
        public void main(String[] args) {
            Poly poly = new Poly();

            Child1 child1 = new Child1();
            Child2 child2 = new Child2();
            Child3 child3 = new Child3();

            poly.checkChild(child1);
            poly.checkChild(child2);
            poly.checkChild(child3);

            // checkChild(Parent parent) 이렇게 부모클래스를 참조형 매개변수로 사용하여
            // 자식 클래스 3가지 모두를 하나의 checkChild 메서드로 처리 할 수 있다.
        }
    }


