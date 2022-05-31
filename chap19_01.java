// 람다식 예제
public class chap19_01 {
    public static void main(String[] args) {
        FunctionalInterface funinterface = (s)->System.out.println(s);
        funinterface.print("Hello");
    }

  
    public interface FunctionalInterface {
        public void print(String str);
    }
}