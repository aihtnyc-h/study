package day2.Arrays;


import java.util.Arrays;

// 배열의 출력
class Arrays3_1 {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        //  배열을 가리키는 참조 변수 arr 을 출력
        System.out.println("arr = " + arr);
        // 메모리 주소와 비슷한 문자열이 출력 -> 실제 주소는 아닙니다.
        // [I@7a81197d -> [(배열을 뜻함), I(int 타입을 뜻함), @(위치를 뜻함)

        // 예외 확인 하기 - char[]
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); // abcd 가 출력되는데 이는 println 메서드의 기능 때문!

        // 배열의 요소 하나씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Arrays.toString(배열) : 배열의 모든 요소를 문자열로 만들어서 반환한다.
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}