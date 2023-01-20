package day3.classTime3;
//변수의 종류
public class Time3_1 {
    int hour;
    int minute;
    int second;
}
class Time3_1Main {
    public static void main(String[] args) {
        // 총 3명 의 시간을 객체로 관리
        Time3_1 t1 = new Time3_1();
        Time3_1 t2 = new Time3_1();
        Time3_1 t3 = new Time3_1();

        // 총 3명 의 시간을 객체 배열로 관리
        Time3_1[] timeArr = new Time3_1[3];
        timeArr[0] = new Time3_1();
        timeArr[1] = new Time3_1();
        timeArr[2] = new Time3_1();
    }
}
/*

 */