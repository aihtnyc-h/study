package day3.homework.report5;
//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
/*
public class report5_5 {

    class Marine {
        int x=0, y=0; //Marine의 위치좌표 (x,y)
        int hp = 60; //현재 체력
        static int weapon = 6; //공격력
        static int armor = 0; //방어력
        static void weaponUp() {
            weapon++;
        }
        static void armorUp() {
            armor++;
        }
        void move(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
*/

// weapon, armor 모든 Marine 인스턴스에 대해 동일한 값을 가져야함으로 static변수에 대한 작업을 하는 메서드!!
// 게임을 생각하면 병사를 일반 유저라고 했을 때, 많은 유저들을 같은 공간에 묶어 둘 수 없다,(단, 이벤트 행사 등을 제외하고 여기서도 참여안한 사람 존재)
//게임 안에서 다 같은 능력치에서 시작하기 때문에 공격력과 방어력은 static변수로 작업할 수 있지만, 레벨업을 위해 사냥을 할 때 각 유저마다 공격을 받는 횟수, 사냥시간,사냥위치가 모두 다르기 때문에
//hp와 위치는 static변수로 묶지 않는다!