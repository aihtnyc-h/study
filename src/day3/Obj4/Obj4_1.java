package day3.Obj4;
//변수의 종류
public class Obj4_1 {
    int iv;        // 인스턴스 변수
    static int cv; // 클래스 변수(static 변수, 공유 변수)

    void method() {
        int lv;
        lv = 30;
        // 지역변수는 자동으로 초기화가 되지 않기 때문에 사용하려면 반드시 초기화 필요
        System.out.println("lv 지역 변수 = " + lv);
    }
}


class Obj4_1Main {
    public static void main(String[] args) {

        // 클래스 변수 접근 및 사용
        // 접근방법 : 클래스명.클래스변수이름
        Obj4_1.cv = 10;
        System.out.println("ObjVar.cv 클래스 변수 = " + Obj4_1.cv);

        // 인스턴스 변수 생성 및 사용
        // Obj4_1.iv = 20; // Error, 인스턴스를 통해서만 생성 및 사용 가능
        Obj4_1 objVar = new Obj4_1();  // objvar 이라는 참조 변수를 만들어 obj4_1() 이라는 객체를 저장한다.
        objVar.iv = 20;                      // objvar에 iv는 20이다.!
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);
        // 생성자 메서드를 호출 -> new 연산자와 생성자를 사용하면 객체가 생성

        // 지역 변수 생성 및 사용
        // objVar.lv // Error, 인스턴스로 지역 변수 바로 접근 불가능
        objVar.method(); // 메서드 호출 시 지역 변수 생성
        // 메서드 종료시 지역 변수 삭제
    }
}

/*
ObjVar.cv 클래스 변수 = 10
objVar.iv 인스턴스 변수 = 20
lv 지역 변수 = 30
 */