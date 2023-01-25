/*
추상 클래스의 형태
일반 클래스 와 똑같은데 추상 메서드가 추가된 미완성된 클래스!
 */

package day4.abstractclass;
/*
abstract class Player { // 추상 메서드를 가진 클래스 abstract
    // 속성 : 인스턴스 변수 선언 가능
    boolean pause; // 일시정지 상태를 저장하기 위한 변수
    int currentPos; // 현재 Play 되고 있는 위치 저장하기 위한 변수

    // 추상클래스도 생성자 필요!
    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos); // 추상 메서드 (몸통 {} 블럭이 없음)
    abstract void stop(); // 추상 메서드

    // 일반 인스턴스 메서드
    void play() {
        // 메서드는 선언부만 알고 있어도 호출이 가능하다
        // 따라서 추상 메서드도 호출이 가능하다
        play(currentPos); // 추상 메서드 호출
        // 위 추상 메서드를 구현한 클래스의 인스턴스를 통해 호출되기 때문에
        // 해당 클래스에 구현한 play(int pos)의 구현부가 실행될 것입니다.
    }
}

 */

abstract class Player {
    boolean pause; // 일시정지 상태를 저장하기 위한 변수
    int currentPos; // 현재 Play 되고 있는 위치 저장하기 위한 변수

    Player() {
        pause = true;
        currentPos = 0;
    }

    abstract void play(int pos); // 추상 메서드 (몸통 {} 블럭이 없음)
    abstract void stop(); // 추상 메서드

    // 일반 인스턴스 메서드
    void play() {
        System.out.println();
        System.out.println("play() 일반 인스턴스 메서드");
        play(currentPos);
    }
}

class AudioPlayer extends Player {
    @Override
    void play(int pos) {
        System.out.println();
        this.currentPos =  pos;
        this.pause = false;
        System.out.println("추상클래스 Player 의 play(int pos) 구현");
        System.out.println("현재 위치 = " + this.currentPos);
        System.out.println("다시 시작합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
        this.pause = true;
    }
}

class AudioPlayerTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(100);
        audioPlayer.stop();
        audioPlayer.play();

    }
}