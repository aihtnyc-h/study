package day3.Data6;
//기본형 매개변수
//변수의 값을 읽기만 할 수 있다.
public class Data6_1 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {

        Data6_1 data  = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
        // 영향을 받지 않습니다.
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
    }

    static void changeParameter(int x, int y) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}

/*
Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인
data 인스턴스 변수 x = 10
data 인스턴스 변수 y = 20

입력받은 매개변수의 값을 바꾸는 메서드 수행

changeParameter 메서드 시작
입력 받은 매개변수 x 와 y의 값 확인
입력 받은 매개변수 x = 10
입력 받은 매개변수 y = 20

입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인
변경 한 후 x = 100
변경 한 후 y = 200
changeParameter 메서드 끝

Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인
changeParameter 메서드 수행 후 data 인스턴스 변수 x = 10
changeParameter 메서드 수행 후 data 인스턴스 변수 y = 20
 */