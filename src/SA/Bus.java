package SA;

public class Bus extends bus_station {
    // 버스
    int maxP = 30; // 최대 승객수
    int currentP = 0;   // 현재 승객수
    int cost = 1500;    //4월부터 인상!!

    // 버스 번호 지정 [고유값]
    void busNum(int i) {
        if (i == 1) {
            System.out.println("버스번호 : 1");
        } else {
            System.out.println("버스번호 : 2");
        }
    }

    //버스 상태 변경 [운행, 차고지행]
    boolean bus_station(boolean change) {
        if (change == true) {
            status = "운행중";     // bus_station에 change가 true일 경우 운행중으로 표시하고 status에 저장한다.
        } else {
            status = "차고지행";      // 빨간줄은 abstract class에 적어주면 사라진다~
            currentP = 0;
            maxP = 30;
        }
        return change;
    }

    // 버스 현재 상태
    void currentBus() {
        System.out.println("상태 = " + status);
        System.out.println("주유량 = " + currentGas);

    }

    //    void board(int pass, String dest, int dis) {
//
//    }
    // 주유량 어려우어ㅜ어ㅜ어ㅜ어
    @Override
    void board(int pass, String dest, int dis) {

    }
    @Override
    void refuel() {

    }

    int refuel(int gas) {
        currentGas += gas;
        if (gascondition()) {   // 여기 오류를 뭐로 해결할 것인가!
            if (currentGas > 10) {
                status = "운행중";
            } else {
                status = "차고지행";
            }
            return currentGas;
        } else {
            return currentGas;
        }     // 빨간줄은 abstract class에 적어주면 사라진다~
    }

    private boolean gascondition() {
        return true;
    }

    // 승객 탑승
    @Override
    int board(int pass) {
        if (pass >= (maxP - currentP)) {
            System.out.println("최대 승객 수 초과");
        } else {
            if (available()) {      // 최대 승객 수가 초과하지 않았을 경우 저장해주기
                currentP += pass;
                System.out.println("탐승 승객 수 = " + pass + "명");
                System.out.println("잔여 승객 수 = " + (maxP - currentP) + "명");
                System.out.println("요금 확인 = " + (cost * pass)); // 요금 계산은 여기서!
            }
        }
        if (!available()) {     // 최대 승객 수가 초과했을 경우
            System.out.println("최대 승객 수 초과");
        }
        return currentP;
    }


    private boolean available() {
        //승객 탑승은 ‘최대 승객수’ 이하까지 가능
        return maxP >= currentP;
    }

    public static void main(String[] args) {
        // 버스 테스트
        // 1번
        // 1~2. 버스 2대 생성 & 출력
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        // 2번 (버스 1대로 진행)
        // 1 ~ 2. 승객 +2 & 출력
        bus1.busNum(1);
        bus2.busNum(2);
        bus1.board(2);
        // 3 ~ 4. 주유량 50
        bus1.refuel(40);        // 주유량에서 10 미만일 때 작동이 안되는 거 같다...
        System.out.println("주유량 = "+bus1.currentGas);
        // 5. 상태 변경 => 차고지행
        bus1.bus_station(false);
        // 6. 주유량 +10
        bus1.refuel(10);
        // 7. 버스 상태와 주유량 출력
        bus1.currentBus();
        // 8. 상태 변경 => 운행중
        bus1.bus_station(true);
        // 9 ~ 10. 승객 +45 => 최대 승객 수 초과
        bus1.board(45);
        // 11 ~ 12. 승객 +5 & 출력
        bus1.board(5);
        // 13. 주유량 -55
        bus1.refuel(-55);
        // 14. 버스 상태와 주유량 출력
        bus1.currentBus();



    }

}


// 1차 시도 확인 완료
// 2차 시도 주유량을 10으로 변경 => 차고지행 변경 안됨 다시 수정!
// @Override
//    boolean refuel() {
//
//        return false;
//    }
//
//    int refuel(int gas) {
//        currentGas += gas;
//        if (gascondition()) {   // 여기 오류를 뭐로 해결할 것인가!
//            if (currentGas > 10) {
//                status = "운행중";
//            } else {
//                status = "차고지행";
//            }
//            return currentGas;
//        } else {
//            return currentGas;
//        }     // 빨간줄은 abstract class에 적어주면 사라진다~
//    }
//
//    private boolean gascondition() {
//        return refuel();
//    }
// 넣어줬더니 차고지행으로 변환!
// 3차 시도 주유량 60 다시 수정  return refuel(); -> return ture
// 4차 시도 주유량 40, 60, 변경시 작동 완료!
