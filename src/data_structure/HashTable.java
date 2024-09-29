package data_structure;
import java.util.Arrays;
public class HashTable {
    static int size = 5;

    static int[] tableValue = new int[size];
    static String[] tableKey = new String[size];
    static int counter = 0;


    public static int hashFunction(String key){
        return key.length() % size;
    }

    public static void findValue(String key){
        int hash = hashFunction(key);
        while (true){
            if (tableKey[hash].equals(key)){
                System.out.println(tableKey[hash]);
                System.out.println(tableValue[hash]);
                return;
            }
            else hash += 1;
        }
    }

    public static int exitCollision(int hash){
        while (tableValue[hash] > 0){
            hash += 1;
            if (hash >= size) hash = 0;
        }
        return hash;
    }

    /*public static void extensionTable(){
        int[] newTableValue = new int[size * 2];
        String[] newTableKey = new String[size * 2];
        for (int i = 0; i < size; i++) {
            String key = tableKey[i];
            int value = tableValue[i];
            addTable(key, value);
        }
        tableKey = newTableKey;
        tableValue = newTableValue;

    }*/

    public static void addTable(String key, int value){
        /*if (counter > ((size * 3) / 4)) {*/
            if (tableValue[hashFunction(key)] == 0) {
                tableKey[hashFunction(key)] = key;
                tableValue[hashFunction(key)] = value;
                counter++;
            } else {
                int index = exitCollision(hashFunction(key));
                tableValue[index] = value;
                tableKey[index] = key;
                counter++;
            }
        /*}
        else extensionTable();*/
    }

    public static void main(String[] args) {
        String[] key = {"A", "Iai", "Bob", "Olya", "Sasha"};
        int[] value = {39, 70, 18, 20, 53};
        for (int i = 0; i < key.length; i++) {
            addTable(key[i], value[i]);
        }
        findValue("Sasha");
        System.out.println(Arrays.toString(tableKey));
        System.out.println(Arrays.toString(tableValue));
    }
}
