/*
오버라이딩의 조건
- 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
- 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

선언부가 조상 클래스의 메서드와 일치해야 합니다.
접근 제어자를 조상 클래스의 메서드 보다 좁은 범위로 변경할 수 없습니다.
예외는 조상 클래스의 메서드 보다 많이 선언할 수 없습니다.
 */
package day4.overriding;

import java.io.IOException;
import java.sql.SQLException;

public class four {
    class Parent {
        void parenMethod() throws IOException, SQLException {

        }
    }

    class Child extends Parent {
        @Override
        void parenMethod() throws IOException {

        }
    }
}
