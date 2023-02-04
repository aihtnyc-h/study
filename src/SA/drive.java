package SA;

public abstract class drive {
    //    void board(int pass, String dest, int dis) {
//
//    }
    int maxPassenger;
    //현재 승객수
    int CurrentPassenger;
    // 버스 비용
    int cost; // 4월부터 1500원으로 인상

    int busNumber;
    // 현재 주유량
    int currentGas;
    //    void board(int pass, String dest, int dis) {
//
//    }
    // 주유량 어려우어ㅜ어ㅜ어ㅜ어
    abstract void board(int pass, String dest, int dis);

    abstract void refuel();

    //    void board(int pass, String dest, int dis) {
//
//    }
    // 주유량
    abstract int refuel(int gas);

    // 승객 탑승
    abstract int board(int pass);


}
