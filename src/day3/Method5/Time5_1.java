package day3.Method5;
// 문장들의 묶음
// 코드의 중복을 하나의 묶음으로 만들어 코드의 가독성 및 효율을 높여줌
public class Time5_1 {
    int hour;
    int minute;
    int second;
}

class Method5_3 {
    static void initObj(Time5_1 time, int hour, int minute, int second) {
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}

class Method5_3Main {
    public static void main(String[] args) {
        Time5_1 t1 = new Time5_1();
        t1.hour = 100;
        t1.minute = 20;
        t1.second = 43;

        Time5_1 t2 = new Time5_1();
        t2.hour = 22;
        t2.minute = 30;
        t2.second = 23;

        Time5_1 t3 = new Time5_1();
        t3.hour = 45;
        t3.minute = 40;
        t3.second = 52;

        System.out.println("t1.hour = " + t1.hour);
        System.out.println("t2.hour = " + t2.hour);
        System.out.println("t3.hour = " + t3.hour);
        System.out.println();

        // 하나하나 인스턴스를 만들고 위처럼 인스턴스 변수를 초기화 하려니 매우 귀찮지 않나요?
        // 물론 '생성자' 라는 개념이 뒤에 나오지만 일단은 메서드를 사용하여 코드의 수를 확 줄여 보겠습니다.

        Time5_1 t4 = new Time5_1();
        Time5_1 t5 = new Time5_1();
        Time5_1 t6 = new Time5_1();

        Method5_3.initObj(t4, 100, 20, 43);
        Method5_3.initObj(t5, 22, 30, 23);
        Method5_3.initObj(t6, 45, 40, 52);

        System.out.println("t4.hour = " + t4.hour);
        System.out.println("t5.hour = " + t5.hour);
        System.out.println("t6.hour = " + t6.hour);

        // 이처럼 메서드를 사용하니 코드의 수가 굉장히 많이 줄어 가독성이 좋아졌습니다.
    }
}

/*
t1.hour = 100
t2.hour = 22
t3.hour = 45

t4.hour = 100
t5.hour = 22
t6.hour = 45
 */