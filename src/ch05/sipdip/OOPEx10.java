package ch05.sipdip;

interface CanAble{
    void talk();
}

abstract class 홀직원 implements CanAble{
    abstract void 청소();

    @Override
    public void talk() {
        System.out.println("손님과 대화");
    }
}

abstract class 종업원 extends 홀직원{
    void 서빙하기(){
        System.out.println("서빙하기!");
    }

    // 주문 => 키오스크
//    void 주문받기(){
//        System.out.println("주문받기!");
//    }
}

abstract class 캐셔 extends 홀직원{
    void 정산하기(){
        System.out.println("정산하기!");
    }

    // 현금 => 카드
    void 계산하기(){
//        System.out.println("현금 계산하기!");
        System.out.println("카드 계산하기!");
    }
}

abstract class 요리사{
    abstract void 요리();
}

class 홍길동 extends 종업원{

    요리사 j;     // 의존성 역전 원칙
                // 추상 클래스에 의존

    @Override
    void 청소() {
        System.out.println("화장실 청소");
    }
}

class 임꺽정 extends 종업원{

    요리사 j;

    @Override
    void 청소() {
        System.out.println("주방 청소");
    }
}

class 김유신 extends 캐셔{

    @Override
    void 청소() {
        System.out.println("홀 청소");
    }
}

class 이몽룡 extends 캐셔{

    @Override
    void 청소() {
        System.out.println("테이블 청소");
    }
}

//class 장보고 extends 요리사{
//
//    @Override
//    void 요리() {
//        System.out.println("양식 만들기");
//    }
//}

class 정몽주 extends 요리사{

    @Override
    void 요리() {
        System.out.println("양식 만들기");
    }
}

class 이순신 extends 요리사{

    @Override
    void 요리() {
        System.out.println("한식 만들기");
    }
}

public class OOPEx10 {
}
