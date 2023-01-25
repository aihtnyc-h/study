/*
오버로딩 vs 오버라이딩
오버로딩 : 기존에 없는 새로운 메서드를 정의하는 것 (new)
오버라이딩 : 상속받은 메서드의 내용을 변경하는 것 (change, modify)
 */
package day4.overriding;

public class five {
    class Parent {
        void parenMethod() {

        }
        class Child extends Parent{
            void parentMethod(){}   // 오버라이딩
            void parentMethod(int i){}  //오버로딩

            void childMethod(){}
            void childMethod(int i){} //오버로딩
            //void childMethod(){}      // 에러 중복정의 되었음

        }



    }
}
