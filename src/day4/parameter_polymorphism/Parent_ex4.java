package day4.parameter_polymorphism;

public class Parent_ex4 {
        void accost() {
            System.out.println("Parent.accost");
        }
    }

    class Child_1 extends Parent_ex4 {
        @Override
        void accost() {
            System.out.println("Child1.accost");
        }
    }

    class Child_2 extends Parent_ex4 {
        @Override
        void accost() {
            System.out.println("Child2.accost");
        }
    }

    class Child_3 extends Parent_ex4 {
        @Override
        void accost() {
            System.out.println("Child3.accost");
        }
    }

    class ObjArray2 {
        public void main(String[] args) {
            Parent_ex4[] parents = new Parent_ex4[3];
            parents[0] = new Child_1();
            parents[1] = new Child_2();
            parents[2] = new Child_3();

            for (Parent_ex4 child : parents) {
                child.accost();
            }
        }
    }

