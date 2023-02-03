package SA;

public class BusTest extends Bus {
    public static void main(String[] args) {
        // 버스 테스트
        // 1번
        // 1~2. 버스 2대 생성 & 출력
        Bus bus1 = new Bus();
        // 2번 (버스 1대로 진행)
        // 1 ~ 2. 승객 +2 & 출력
        bus1.busNumber(1);

        bus1.board(2);

        // 3 ~ 4. 주유량 50
        bus1.refuel(40);        // 주유량에서 10 미만일 때 작동이 안되는 거 같다...

        System.out.println("주유량 = "+bus1.currentGas);

        // 5. 상태 변경 => 차고지행
        bus1.drive(false);

        // 6. 주유량 +10
        bus1.refuel(10);

        // 7. 버스 상태와 주유량 출력
        bus1.currentBus();

        // 8. 상태 변경 => 운행중
        bus1.drive(true);

        // 9 ~ 10. 승객 +45 => 최대 승객 수 초과
        bus1.board(45);

        // 11 ~ 12. 승객 +5 & 출력
        bus1.board(5);

        // 13. 주유량 -55
        bus1.refuel(-55);

        // 14. 버스 상태와 주유량 출력
        bus1.currentBus();



        Bus bus2 = new Bus();
        bus2.busNumber(2);
        bus2.board(2);
        bus2.refuel(30);
        System.out.println("주유량 = "+bus2.currentGas);
        bus2.drive(false);
        bus2.refuel(20);
        bus2.currentBus();
        bus2.drive(true);
        bus2.board(50);
        bus2.board(5);
        bus2.refuel(-65);
        bus2.currentBus();
    }
}
