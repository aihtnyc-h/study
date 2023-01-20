package Method5;
// 호출 스택
//메서드 수행에 필요한 메모리가 제공되는 공간메서드가 호출되면 호출 스택에 메모리가 할당, 종료되면 해제 됨
public class CallStack5_1 {

    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
/*
firstMethod()
secondMethod()
thirdMethod()
finalMethod()
 */