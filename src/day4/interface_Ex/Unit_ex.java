package day4.interface_Ex;

public class Unit_ex {
    public String name;

    public Unit_ex(String name){
        this.name = name;
    }
}

interface Fightable extends Movable, Attckable {
    String getName();
    Fightable getFighter(String name);    // 반환 타입이 인터페이스인 Fighter를 반환하는 추상 메서드
}

interface Movable {
    void move(int x, int y);
}

interface Attckable {
    void attack(Fightable fightable);
}

class Fighter extends Unit_ex implements Fightable {
    public Fighter(String name) {
        super(name);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Fighter 이동 " + x);
        System.out.println("Fighter 이동 " + y);
    }

    @Override
    public void attack(Fightable fightable) {
        System.out.println(super.name + "이 " + fightable.getName() + "를 공격합니다.");
    }

    @Override
    public String getName() { // 다형성을 통해 Unit 의 name 을 가져오기 위해 추상 메서드를 추가!
        return super.name;
    }

    @Override
    public Fightable getFighter(String name) {
        return new Fighter(name); // 여기서 Fightable 로 형변환 일어남! 생략된 것!
    }

    public void newMethod() {
        System.out.println("Fighter.newMethod");
    }
}

class InterPolyTest {
    public static void main(String[] args) {
        // 인터페이스의 다형성 반환 타입 확인
        Fightable fighter = new Fighter("파이터1");

        fighter.move(100,200);
        Fightable fightable = fighter.getFighter("파이터2");
        fighter.attack(fightable);

        // Fighter fighter3 = fighter.getFighter("파이터3"); // Error 발생 반환타입 과 저장하는 변수의 타입이 일치해야 합니다.
        Fighter fighter3 = (Fighter) fighter.getFighter("파이터3"); // 이렇게 형변환하면 됩니다.
        System.out.println(fighter3.getName());;
    }
}
/*
Fighter 이동 100
Fighter 이동 200
파이터1이 파이터2를 공격합니다.
파이터3
 */