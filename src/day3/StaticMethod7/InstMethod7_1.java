package day3.StaticMethod7;
/*
# **인스턴스 메서드**

****인스턴스를 생성한 후, '참조변수.메서드이름()' 으로 호출****

****인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)와 관련된 작업을 하는 메서드메서드 내에서 인스턴스 변수 사용가능합니다.****
 */
public class InstMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언
    static int num3 = 100;

    int add(int num1, int num2) { // 메서드 반환타입 앞에 static 이 없기 때문에 인스턴스 메서드 입니다.

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 계속된 실습으로 우리는 위에 매개변수 num1, num2 와 InstMethod7_1 의 인스턴스 변수는 다르다는 것을 알았습니다.
        // 그럼 이런 의문이 듭니다. InstMethod7_1 클래스로 methodTest 객체를 생성했고
        // 참조변수를 통해 methodTest.num1 = 10;와 같이 인스턴스 변수에 값도 넣었는데
        // 저 값을 매개변수로 받는 의미가 있는 건가? 확인해 보겠습니다.

        // 인스턴스 변수 값 확인 : this 는 뒤에서 배우기 때문에 간단히 설명드리자면 인스턴스 변수와 매개변수를 구분하기 위한 것입니다.
        System.out.println("this.num1 = " + this.num1);
        // 10 이렇게 10이 출력될겁니다. 그럼 비교를 위해 아래 methodTest.add(methodTest.num1, methodTest.num2);
        // 주석 하고 methodTest.add(80,90); 주석을 푸세요!

        System.out.println("매개변수 이자 지역변수 num1 = " + num1);
        // 값이 달라졌을 겁니다. 이제 인스턴스 num1 과 매개변수 num1 은 이름만 같을 뿐이라는 것을 아셨을 겁니다.
        // 그래서 구분을 위해 변수의 이름을 다르게 하거나 this 를 사용해서 구분해야 합니다.

        // 그럼 지금 상황에서는 매개 변수를 받지 않고
        // return this.num1 + this.num2; // 이렇게 해도 됩니다.

        // 이번에는 그럼 일반 메서드니까 클래스 변수는 사용하지 못 할까? 아래 주석 제거하세요!
        //         System.out.println("InstMethod7_1.num3 = " + InstMethod7_1.num3); // 당연하게도 사용 가능합니다!

        return num1 + num2;
    }


}

class InstMethod7_1Main {

    public static void main(String[] args) {
        InstMethod7_1 methodTest = new InstMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

        // 참조변수를 사용하여 인스턴스 메서드 호출
        System.out.println("result : " + methodTest.add(methodTest.num1, methodTest.num2));
//         System.out.println("result : " + methodTest.add(80,90));

    }
}
/*
매개변수로 입력 받은 num1, num2 확인
num1 = 10
num2 = 20
this.num1 = 10
매개변수 이자 지역변수 num1 = 10
result : 30
 */