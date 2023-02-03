package SA;

public abstract class bus_station {
    int currentGas;

    String status;


    //    void board(int pass, String dest, int dis) {
//
//    }
    // 주유량
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