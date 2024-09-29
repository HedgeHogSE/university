package new_oop.collection;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Alex");
        arrayList.add("Ivan");
        arrayList.add("Perry");
        System.out.println(arrayList.set(0));
        arrayList.delete("Alex");
        System.out.println(arrayList.set(0));
    }
}
