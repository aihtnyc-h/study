package SA;

public class Bus extends bus_station {
    // 버스
    private boolean gascondition() {
        return true;
    }

    private boolean available() {
        //승객 탑승은 ‘최대 승객수’ 이하까지 가능
        return maxP >= currentP;
    }

    int maxP = 30; // 최대 승객수
    int currentP = 0;   // 현재 승객수
    int cost = 1500;    //4월부터 인상!!


    // 버스 번호 지정 [고유값]
    void busNum(int i) {
        if (i == 1) {
            System.out.println("버스번호 : 1 ");
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
