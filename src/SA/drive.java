package SA;

public abstract class drive {
    //    void board(int pass, String dest, int dis) {
//
//    }

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
