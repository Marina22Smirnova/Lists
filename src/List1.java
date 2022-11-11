import java.util.ArrayList;

public class List1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);

        list.add(0,"1");
        list.add(1,"2");
        list.add(2,null);
        list.add(3,null);
        list.add(4,"1");
        list.add("3");

        System.out.println(list);

        list.remove(2);
        list.remove(3);
        list.remove("2");
        list.add(3,"4");

        System.out.println(list);

        System.out.println(list.size());

        ArrayList<String> insertedList = new ArrayList<>();
        insertedList.add("2");
        insertedList.add("3");
        insertedList.add("5");

        System.out.println(insertedList);

        list.addAll(2, insertedList);
        System.out.println(list);

        System.out.println(list.indexOf("5"));
        System.out.println(list.get(3));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("3"));
        System.out.println(list.contains("9"));

        for (String s: list) {
            System.out.println("element of list" + s);
        }
    }
}
