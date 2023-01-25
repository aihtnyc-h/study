/*
참조변수의 형변환
사용할 수 있는 멤버의 개수를 조절하는 것
조상, 자손 관계의 참조변수는 서로 형변환이 가능하다.
 */

package day4.ReferenceVariable;

public class WhaleEx1 {
     class Whale_Ex2 extends Mammalia2{
        // 고래는 포유류 이면서 바다에 살며 수영이 가능하다.
        public void swimming(){
            System.out.println("수영 하다.");
        }
        @Override
        public void feeding(){
            System.out.println("고래는 모유 수유를 합니다.");
        }
        @Override
        public void giveBirth(){
            System.out.println("고래는 새끼를 낳습니다.");
        }
    }
    class Mammalia2{
        // 포유류는 새끼를 낳고 수유를 한다.
        public void feeding() {
            System.out.println("모유 수유를 합니다.");
        }
        public void giveBirth(){
            System.out.println("새끼를 낳습니다.");
        }
    }

    static class Bird {
        public void fly() {
            System.out.println("bird.fly");
        }
    }

    class PolyTest2{
        public void main(String[] args) {
            Whale_Ex2 whale = new Whale_Ex2();
            Mammalia2 mammalia2 = (Mammalia2) whale;    //(Mammalia2) 생략 가능!
            mammalia2.giveBirth();
            mammalia2.feeding();

            // 형변환을 통해 담긴 mammalia 참조변수를 형변환을 통해
            // 다시 Whale 로 변환할 수 있습니다.
            Whale_Ex2 whale2 = (Whale_Ex2) mammalia2;   //(Whale_Ex2) 생략 불가능!
            whale2.swimming();

            // 조상, 자손 관계에서만 형변환이 가능합니다.
            Bird bird = new Bird();
            // Mammalia mammalia1 = bird; // Error
            // Mammalia mammalia2 = (Mammalia) bird; // Error

        }
    }
}
