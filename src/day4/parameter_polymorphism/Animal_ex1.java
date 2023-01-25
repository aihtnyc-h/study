package day4.parameter_polymorphism;

public class Animal_ex1 {
        public void move() {
            System.out.println("동물이 움직입니다.");
        }
        public void onomatopoeia(){
            System.out.println("동물이 소리냅니다.");
        }
    }
    class Dog extends Animal_ex1{
        @Override
        public void move(){
            System.out.println("강아지가 달립니다.");
        }
        @Override
        public void onomatopoeia() {
            System.out.println("멍멍!");
        }
    }

    class Bird extends Animal_ex1 {
        @Override
        public void move() {
            System.out.println("새가 날아다닙니다.");
        }
        @Override
        public void onomatopoeia() {
            System.out.println("짹짹!");
        }
    }

    class Action {
        static void doMove(Animal_ex1 animal){
            animal.move();
        }

        static void doCry(Animal_ex1 animal){
            animal.onomatopoeia();
        }
    }

    class ParPoly1{
        public void main(String[] args) {
            Dog dog = new Dog();
            Bird fish = new Bird();

            Action.doMove(dog);
            Action.doCry(dog);

            System.out.println();

            Action.doMove(fish);
            Action.doCry(fish);
        }
    }

