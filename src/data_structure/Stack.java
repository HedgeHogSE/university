package data_structure;
import java.util.Random;
import java.util.Scanner;

public class Stack {
    private Integer[] arr = new Integer[10];
    private int size = 0;
    private int maxSize = 10;

    private void increasingArr (int size) {
        maxSize = size * 2;
        Integer[] newArr = new Integer[maxSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void push (int num) {
        if (size * 1.5 < maxSize) {
            arr[size] = num;
            size++;
        } else {
            increasingArr(size);
            arr[size] = num;
            size++;
        }
    }

    public int pop () {
        int num = arr[size - 1];
        arr[size - 1] = null;
        size--;
        return num;
    }

    public int peek () {
        return arr[size - 1];
    }

    public boolean isEmpty () {
        return (arr[0] == null);
    }

    private static void transEl (Stack stack1, Stack stack2, Stack stack3, int min) {
        while (!stack1.isEmpty()) {
            int peek = stack1.pop();
            if (min > peek) {
                stack2.push(min);
                min = peek;
            } else {
                stack2.push(peek);
            }
        }
        stack3.push(min);
    }

    public static void sortStack (Stack stack1, Stack stack2, Stack stack3) {
        int min = stack1.pop();
        while (true) {
            if ((!stack1.isEmpty()) && (stack2.isEmpty())) {
                transEl(stack1, stack2, stack3, min);
                min = stack2.pop();
            } else if ((stack1.isEmpty()) && (!stack2.isEmpty())) {
                transEl(stack2, stack1, stack3, min);
                min = stack1.pop();
            } else if (stack1.isEmpty() && stack2.isEmpty()) {
                break;
            }
        }
        stack3.push(min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();

        System.out.println("Введите количество значений, которое вы хотите отсортировать: \n");
        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            stack1.push(random.nextInt(-100,100)); // В стек 1 заносим рандомные значения от -100 до 100
            System.out.println("Начальные значения в стеке 1");
            System.out.println(stack1.peek());
        }

        System.out.println("___________________________________________");

        sortStack(stack1, stack2, stack3); // Сортировка стека

        for (int i = 0; i < len; i++) {
            int num = stack3.pop();
            System.out.println("Конечные значения в отсортированном стеке 3");
            System.out.println(num);
        }
    }
}

