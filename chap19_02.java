// 람다식 활용 에제
public class chap19_02 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run(){
                System.out.println("Annoymous Runable");
            }
        };

        Runnable r2 = () -> System.out.println("Lambda Runnable");

        r1.run();
        r2.run();
    }
}
