package day3.StaticMethod7;
/*
# **static 메서드(클래스 메서드)**

****객체 생성 없이 '클래스이름.메서드이름()'으로 호출 : ex) `Math.random()`**

****인스턴스 멤버(인스턴스 변수, 인스턴스 메서드) 와 관련없는 작업을 하는 메서드****

****메서드 내에서 인스턴스 변수 사용 불가합니다.****
 */
public class StaticMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언

    // 클래스 변수 선언
//    static int num1 = 10, num2 = 20;

    static int add(int num1, int num2) { // 메서드 반환타입 앞에 static 이 붙었기 때문에 static 메서드가 됩니다.

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 여기서 매개 변수에 있는 num1, num2 와 위에 인스턴스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 기본형 매개변수에서 배웠듯이 같지 않습니다. 서로 영향을 받지 않습니다.

        // 여기서의 num1 과 num2 는 단지 인스턴스 변수와 이름만 같은 지역변수일 뿐 메서드가 종료되면 사라집니다.
        // 인스턴스 변수는 클래스 메서드에서 사용하지 못합니다.

        // 그렇다면 추가로 StaticMethod7_1 에 선언한 변수를 사용하고 싶다면?
        // 인스턴스 변수가 아닌 클래스 변수를 선언해야합니다. static 타입 변수이름;

        // 위에 클래스 변수의 주석을 풀고 인스턴스 변수는 주석을 해주세요!

        // 자 그럼 이제 클래스 변수로 선언을 했으니까
        // 매개 변수에 있는 num1, num2 와 위에 클래스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 그렇지 않습니다. 위에서 말씀드렸듯이 num1, num2는 매개변수이자 클래스 변수와 이름만 같습니다.
        // 또한 클래스 변수 를 사용하려면 클래스명.클래스변수 로 만 접근 가능합니다.

        // 이렇게 클래스 메서드에서 클래스 변수를 사용할 수 있습니다. 아래 주석 풀어주세요!

//        System.out.println("클래스변수 확인");
//        System.out.println("StaticMethod7_1.num1 = " + StaticMethod7_1.num1);
//        System.out.println("StaticMethod7_1.num2 = " + StaticMethod7_1.num2);

        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2;
    }


}

class StaticMethod7_1Main {

    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        // methodTest.add(methodTest.num1, methodTest.num2); // add 는 static 메서드 이기 때문에 객체로 생성된 참조변수로는 접근할 수 없습니다.

        // 클래스이름.메서드이름() 방식으로 static 메서드를 호출
        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}
/*
매개변수로 입력 받은 num1, num2 확인
num1 = 10
num2 = 20
num1 + num2 = 30
 */