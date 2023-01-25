package day4.interface_Ex;

import java.util.Arrays;

public interface Repository {
        public int[] getData(); // 데이터를 가져오는 추상 메서드
    }

    class DatabaseA implements Repository {
        @Override
        public int[] getData() {
            System.out.println("Mysql 연결");
            return new int[]{55, 44, 33, 22, 11, 77, 88};
        }
    }

    class DatabaseB implements Repository {
        @Override
        public int[] getData() {
            System.out.println("Oracle 연결");
            return new int[]{1, 2, 3, 4, 5, 6, 7};
        }
    }

    class DatabaseAdmin {
        Repository repository = new DatabaseA();
//    Repository repository = new DatabaseB();

        public String getData() {
            return Arrays.toString(repository.getData());
        }
    }

    class User {
        DatabaseAdmin databaseAdmin = new DatabaseAdmin();
    }

    class DatabaseMain {
        public static void main(String[] args) {
            User user = new User();
            System.out.println(user.databaseAdmin.getData());

            // user 사용자가 갑자기 데이터 반환 방식 교체를 요구했습니다
            // 그런데 그 방식이 기존의 Database 로는 불가능 하다면?
            // 그래서 DB 교체가 필요해 졌습니다.
            // 이럴 경우 Repository repository = new DatabaseA();
            // 를 Repository repository = new DatabaseB(); 로 교체하면 됩니다.

            // User 자체는 전혀 수정되지 않기때문에 이런걸 느슨한 결합이라 부릅니다.
        }
    }
/*
Mysql 연결
[55, 44, 33, 22, 11, 77, 88]
 */