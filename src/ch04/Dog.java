package ch04;

// 클래스      => 여러가지 특징(상태)을 가지고 있다.
// 기본 자료형  => 한가지의 상태만 가질 수 있다.
public class Dog {
    int age = 7;                 // 변경 되어야 한다.
    String name = "토토";         // 변경 되어야 한다.
    String color = "흰색";        // 변경 되어야 한다.
    final String type = "말티즈"; // 변경 불가능 하다.
}

// 필드, 전역변수(지역변수가 아니다. => 메서드 내부에서 만들어진 필드가 아니다)
