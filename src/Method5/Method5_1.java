package Method5;
//메서드 호출
public class Method5_1 {
    int add(int x, int y) {
        int result = x + y;
        return result; // 값을 반환
    }
}

class Method5_1Main {
    public static void main(String[] args) {
        Method5_1 method = new Method5_1(); // Method5_1 클래스에 만든 메서드 add 를 사용하기 위해 객체 생성

        int result = method.add(3, 5); // add 메서드를 사용해서 입력한 값(3,5)으로 처리된 값을 반환받아 result 변수에 저장
        System.out.println("result = " + result);
    }
}
/*
result = 8
 */