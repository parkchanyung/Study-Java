package ch06;

abstract class 공{
    abstract String getName();
}

class 농구공 extends 공{
    private String name = "농구공";

    // 자식이 부모의 메서드와 동일한 것을 들고 있으면,
    // 부모의 메서드가 오버라이드(무효화) 된다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 축구공 extends 공{
    private String name = "축구공";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class 가방<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericEx03 {

    // 제네릭 고급을 알기 위해선
    // 다형성, Object, 추상클래스, 오버라이드(무효화), 동적 바인딩  전반적인 모든것들을 이해하고 사용해야 한다.
    static 가방<? extends 공> 꺼내기(int time){  // 9시 = 축구, 12시 = 농구
        if(time == 9){
            System.out.println("가방에 축구공이 담겼어요.");
            축구공 g = new 축구공();

            가방<축구공> b = new 가방<>();
            b.setData(g);

            return b;
        }else{
            System.out.println("가방에 농구공이 담겼어요");
            농구공 g = new 농구공();

            가방<농구공> b = new 가방<>();
            b.setData(g);

            return b;
        }
    }

    public static void main(String[] args) {
        가방<? extends 공> r1 = 꺼내기(9);
        가방<? extends 공> r2 = 꺼내기(12);

        // 공은 getName 메서드가 없다.
        System.out.println(r1.getData().getName());
        System.out.println(r2.getData().getName());
    }
}
