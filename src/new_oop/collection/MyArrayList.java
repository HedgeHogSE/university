package new_oop.collection;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String element){
        array[size] = element;
        size++;
        if (size == array.length){
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void delete(int index){
        if(index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void delete(String element){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)){
                index = i;
                break;
            }
        }
        if(index != -1) delete(index);
    }


    public String set(int index){
        if(index >= 0 && index < size) {
            return array[index];
        }
        return "Элемента по данному индексу нет";
    }
}
