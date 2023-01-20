package day1.Operator;

class Operator3_2 {
    public static void main(String[] args) {
        // 큰 타입을 작은 타입에 저장!
        // int i = 3.14f; // Error 발생
        int i = (int)3.14f; // 형변환 필요!
        System.out.println("i = " + i);

        // 예외 경우 확인

        // 100 은 int 타입 따라서 아래 코드는 현재 큰 타입(int)을 작은 타입(byte)에 넣고 있음!
        // 컴퓨터는 byte의 범위가 -128 ~ 127 인 것을 알고 있다.
        // 따라서 100을 byte b 에 집어 넣어도 값 손실이 발생하지 않는 다는 것을 알기 때문에
        // 자동으로 형변환을 해준다.
        // byte b = (byte)100; -> 컴파일러가 자동 형변환
        byte b = 100; // OK
        System.out.println("b = " + b);

        // 위의 경우는 100 은 리터럴 즉, 상수이기 때문에 컴파일러가 값을 명확하게 알지만
        // 아래 num 은 변수, 따라서 확신할 수 없기 때문에 Error 발생
        int num = 100;
        // byte b2 = num; // Error 발생
        byte b2 = (byte) num; // byte 타입으로 형변환
        System.out.println("b2 = " + b2);

        //  byte b3 = 1000; // Error 발생, 범위를 넘어감
        byte b3 = (byte) 1000;
        // OK, 그러나 값 손실 발생, b3 에는 -24 가 저장됨
        // 즉, 상수여도 값 손실이 일어나면 자동 형변환 불가능!
        System.out.println("b3 = " + b3);
    }
}
