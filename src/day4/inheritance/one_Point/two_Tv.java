package day4.inheritance.one_Point;

public class two_Tv {
    boolean power; // 전원상태 (on/off)
    int channl; // 채널

    void power() { power = !power;}
    void channlUp() {++channl;}
    void channlDown() {--channl;}
}

class SmartTv extends two_Tv {  // SmartTv는 Tv 캡션(자막)을 보여주는 기능을 추가
    boolean caption;        // 캡션상태 (on/off)
    void displayCAption(String text) {
        if (caption){       // 캡션 상태가 on(ture)일 때만 text를 보여준다.
            System.out.println(text);
        }
    }

}

class Ex7_1{
    public static void main(String args[]) {
        SmartTv stv = new SmartTv();
        stv.channl = 10;            // 조상 클래스로부터 상속받은 멤버
        stv.channlUp();             // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channl);

        stv.displayCAption("Hello, World");
        stv.caption = true; //캡션(자막) 기능을 켠다.
        stv.displayCAption("Hello, World");
    }
}

