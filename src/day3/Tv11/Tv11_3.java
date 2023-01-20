package day3.Tv11;
//생성자 초기화
public class Tv11_3 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    Tv11_3() {
        this.power = false;
        this.channel = 1;
    }
    // ...
}