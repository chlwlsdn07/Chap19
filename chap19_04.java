// 람다식 comporator 예제
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class chap19_04 {
    public static void main(String[] args) {
        chap19_03 value1 = new chap19_03();
        value1.setName("Yoo");
        value1.setUniqueId("20220913");

        chap19_03 value2 = new chap19_03();
        value2.setName("Kim");
        value2.setUniqueId("20220713");

        List<chap19_03> list = new ArrayList<chap19_03>();
        list.add(value1);
        list.add(value2);

        System.out.println(list);

        list.sort(new Comparator<chap19_03>() {
            @Override
            public int compare(chap19_03 p1, chap19_03 p2){
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println(list);

        list.clear();
        list.add(value1);
        list.add(value2);

        list.sort((chap19_03 p1, chap19_03 p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(list);
    }
}
