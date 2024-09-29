package university.fifel;

public class ThreeSortedArrays {

    public static void main(String[] args) {
        int[] array1 = {-3, -2, 2, 4, 7};
        int[] array2 = {-3, -2, -1, 6, 7};
        int[] array3 = {-2, -1, 6, 7, 8, 9};
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        int lengthArray3 = array3.length;
        outerLoop: //метка нужна для того, чтобы выйти из вложенного цикла
            for (int i = 0; i < lengthArray1; i++) { //цикл, проходящий по array1
                for (int j = 0; j < lengthArray2; j++) { //цикл, проходящий по array2
                    if (array1[i] >= array2[j]) { //Небольшая оптимизация кода. Если элемент из 2 массива больше элемента из первого, то далее идти смысла нет, ибо во втором массиве элементы будут только возрастать
                        for (int k = 0; k < lengthArray3; k++) { //цикл, проходящий по array3
                            if (array2[j] >= array3[k]) { //оптимизация, аналогичная выше
                                if ((array1[i] == array2[j]) && (array2[j] == array3[k])) { //если элементы во всех 3ёх массивах равны, то такое число найдено
                                    System.out.println(array1[i]);
                                    break outerLoop; //прерываем работу метки, чтобы завершить вложенный цикл
                                }
                            }
                            else break;
                        }
                    }
                    else break;
                }
            }
    }
}
