package day2.homework.report4;

public class report4_5 {
    //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.

    public static void main(String[] args) {
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            //(1)에는 변수 tmp를 이용해서 배열의 i번째 요소(ballArr[i])와 j번째 요소(ballArr[j])의 값을 서로 바꾸는 코드가 들어가야 한다.
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        for (int i = 0; i < 3; i++) {
            ball3[i] = ballArr[i];
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        // ballArr[0]에서 ball3[0]으로 3개의 데이터를 복사
        //System.out.println(ballArr,0, ball3,0,3);
        
        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }//end of main
}//end of class

//1~9의 숫자를 배열에 순서대로 담고, 반복해서 위치를 서로 바꿈으로써 숫자를 섞
// 는다. 그 다음에 배열의 세 요소를 차례대로 가져오면 중복되지 않은 세 개의 정수를 얻
// 을 수 있다.
// (1)에는 변수 tmp를 이용해서 배열의 i번째 요소(ballArr[i])와 j번째 요소(ballArr[j])
// 의 값을 서로 바꾸는 코드가 들어가야 한다. 배열의 크기인 ballArr.length의 값이 9이므
// 로, (int)(Math.random() * 9)가 되어 변수 i와 j는 0~8사이의 임의의 값이 저장된다.
// 처음에 배열이 생성되고 초기화되면 아래와 같이 1~9의 값이 순서대로 배열에 저장된다.
// 만일 i와 j의 값이 각각 0과 3이면, ballArr[0]과 ballArr[3]의 값을 서로 바꾼다.
// 두 변수에 저장된 값을 서로 바꾸려면, 별도의 저장공간이 필요하다. 두 컵에 담긴 내용
// 물을 서로 바꾸려면, 하나의 빈 컵이 필요한 것처럼. 여기서는 변수 tmp가 빈 컵의 역할
// 을 하게 된다. 아래의 그림은 'tmp = ballArr[0];'이 실행되어 ballArr[0]의 값인 1이 변
// 수 tmp에 저장된 것을 보여준다.
// 다음은 'ballArr[0] = ballArr[3];'이 실행되어 ballArr[3]의 값인 4가 ballArr[0]에
// 저장된 것을 보여준다.
// 마지막으로 'ballArr[3] = tmp;'가 실행되어 tmp의 값인 1이 ballArr[3]에 저장된다.
// 이런 작업을 반복적으로 수행하면, 배열 ballArr의 값들이 뒤섞이게 된다.(Math.random()
// 을 사용했기 때문에 실행할 때마다 다른 결과를 얻을 것이다.)
