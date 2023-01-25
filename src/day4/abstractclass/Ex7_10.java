package day4.abstractclass;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship() };

        for (int i = 0; i < group.length; i++)
            group[i].move(100,200);
    }
}

abstract class Unit{
    int x, y;
    abstract void move(int x, int y);
    void stop() {/* 현재 위치에 정지 */}
}
class Marine extends Unit{
    void move(int x, int y){
        System.out.println();
    }
    void stimPack() {/* 현재 위치에 정지 */}
}
class Tank extends Unit{
    void move(int x, int y){
        System.out.println();
    }
    void changeMode() {/* 현재 위치에 정지 */}
}
class Dropship extends Unit{
    void move(int x, int y){
        System.out.println();
    }
    void load() {/* 현재 위치에 정지 */}
    void unload() {/* 현재 위치에 정지 */}

}