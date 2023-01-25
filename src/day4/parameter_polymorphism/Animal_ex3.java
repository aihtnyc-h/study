package day4.parameter_polymorphism;

public class Animal_ex3 {
        public void move() {
            System.out.println("동물이 움직입니다.");
        }

        public void onomatopoeia(){
            System.out.println("동물이 소리냅니다.");
        }
    }

    class Dog3 extends Animal_ex3 {
        @Override
        public void move() {
            System.out.println("강아지가 달립니다.");
        }

        @Override
        public void onomatopoeia() {
            System.out.println("멍멍!");
        }
    }

    class Bird3 extends Animal_ex3 {
        @Override
        public void move() {
            System.out.println("새가 날아다닙니다.");
        }

        @Override
        public void onomatopoeia() {
            System.out.println("짹짹!");
        }
    }

    class Action3{
        static void doMove(Animal_ex3 animal){
            animal.move();
        }

        static void doCry(Animal_ex3 animal){
            animal.onomatopoeia();
        }
    }

    class ObjArray1 {

        public void main(String[] args) {
            Animal_ex3[] animals = new Animal_ex3[3];

            animals[0] = new Animal_ex3();
            animals[1] = new Dog3();
            animals[2] = new Bird3();

            for (Animal_ex3 animal : animals) {
                animal.move();
                animal.onomatopoeia();
                System.out.println();
            }
        }
    }

