package ch07;

// SubThread => Runnable (다형성)
class SubThread implements Runnable{

    // 자바의 서브 스레드
    @Override
    public void run() {
        for(int i=1; i<6; i++){
            try {
                System.out.println("서브 스레드 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx01 {

    // 자바의 메인 스레드
    public static void main(String[] args) {

        SubThread st = new SubThread();
        Thread t = new Thread(st);  // Target 선정
        t.start();                  // run 메서드 실행

        for(int i=1; i<6; i++){
            try {
                System.out.println("메인 스레드 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
