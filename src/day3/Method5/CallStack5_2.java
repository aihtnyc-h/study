package day3.Method5;
//호출 스택(call stack)
//메서드 수행에 필요한 메모리가 제공되는 공간메서드가 호출되면 호출 스택에 메모리가 할당, 종료되면 해제됩니다.
public class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

/*
finalMethod()
thirdMethod()
secondMethod()
firstMethod()
 */