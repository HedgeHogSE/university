package university.fifel;

import java.util.Scanner;

public class PloskostTochki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n]; //массив из n элементов, содержащий координаты точек по X
        int[] y = new int[n]; //массив из n элементов, содержащий координаты точек по Y
        for (int i = 0; i < n; i++){ //в цикле мы заносим значения в массив
            System.out.printf("Введите %d x: ", i + 1);
            Scanner scanner1 = new Scanner(System.in);
            int number1 = scanner1.nextInt();
            System.out.printf("Введите %d y: ", i + 1);
            Scanner scanner2 = new Scanner(System.in);
            int number2 = scanner2.nextInt();
            x[i] = number1;
            y[i] = number2;
        }
        //первый номер первой задачи
        double maxDistance = 0; //максимальное расстояние. Так как нужно найти максимальное расстояние между точками, то задаем переменной минимальное значение, которое может принять ответ
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                double distancePoint = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])); //расстояние от первой до второй точки (по формуле вычисления расстояния между двумя точками)
                if (maxDistance < distancePoint) maxDistance = distancePoint; //если дистанция оказывается меньше расстояния между точками, то результат изменяет свое значение
            }
        }
        System.out.println(maxDistance);
        //второй номер первой задачи
        double maxAreaTriangle = 0; //будущий ответ
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double distancePoint1 = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
                    double distancePoint2 = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
                    double distancePoint3 = Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]));
                    double p = (distancePoint1 + distancePoint2 + distancePoint3) / 2; //формула полупериметра
                    double area = Math.sqrt(p * (p - distancePoint1) * (p - distancePoint2) * (p - distancePoint3)); //нахождение площади треугольника по формуле
                    if (maxAreaTriangle < area) maxAreaTriangle = area;
                }
            }
        }
        System.out.println(maxAreaTriangle);
        //третий номер первой задачи
        double maxAreaSquare = 0; //будущий ответ
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        double areaSquare = 0; //потенциальная площадь квадрата, которая в будущем будет сравниваться с максимальной площадью, найденной ранее
                        double distancePoint1 = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2)); //та же формула нахождения расстояния от точки до точки, но с методом возведения в степень (чтобы долго не писать)
                        double distancePoint2 = Math.sqrt(Math.pow(x[i] - x[k], 2) + Math.pow(y[i] - y[k], 2));
                        double distancePoint3 = Math.sqrt(Math.pow(x[i] - x[l], 2) + Math.pow(y[i] - y[l], 2));
                        double distancePoint4 = Math.sqrt(Math.pow(x[j] - x[k], 2) + Math.pow(y[j] - y[k], 2));
                        double distancePoint5 = Math.sqrt(Math.pow(x[j] - x[l], 2) + Math.pow(y[j] - y[l], 2));
                        double distancePoint6 = Math.sqrt(Math.pow(x[k] - x[l], 2) + Math.pow(y[k] - y[l], 2));
                        double[] mass = {distancePoint1, distancePoint2, distancePoint3, distancePoint4, distancePoint5, distancePoint6}; //заносим в массив все возможные соединения точек
                        int length = 6; //длина равна 6, ибо именно столько соединений точек может быть у квадрата
                        boolean flag = false;
                        int counter = 0; //счетчик перемещений в массиве
                        while (flag == false){ //данный цикл осуществляет сортировку пузырьком. Цикл выполняется, пока перемещения переменных в массиве продолжаются
                            for (int m = 0; m < length - 1; m++) { //этот цикл нужен нам, чтобы по индексу m менять элементы
                                if (mass[m] > mass[m + 1]){ //если элемент меньше следующего, то происходит замена
                                    double z = mass[m]; //переменная, нужная для того, чтобы сохранить первый рассматриваемый элемент, который в следующем действии поменяется на следующий после него
                                    mass[m] = mass[m + 1];
                                    mass[m + 1] = z;
                                    counter++;
                                }
                                if (m == length - 1 - 1){ //если цикл for завершает свою работу, то ...
                                    if (counter == 0){ //проверяется, действительно ли перемещения элементов закончились
                                        flag = true; // если да, то и цикл, который сортировал массив, тоже заканчивается
                                    }
                                    else counter = 0; //иначе сортировка продолжается и цикл for снова считает кол-во перемещений
                                }
                            }
                        }
                        int subsequence = 1; //повторяющиеся подряд числа в массиве
                        int maxSubsequence = 0; //максимально повторяющиеся подряд числа в массиве (нужно для того, чтобы понять, действительно ли это квадрат. Если да, то данная переменная будет равна 4)
                        double maxElement = mass[0]; //потенциальная сторона квадрата
                        for (int u = 0; u < length - 1; u++) { //цикл определяет, сколько максимальных подряд идущих чисел есть в массиве
                            if (mass[u] == mass[u + 1]) {
                                subsequence++;
                                if (maxSubsequence < subsequence){
                                    maxSubsequence = subsequence;
                                    maxElement = mass[u];
                                }
                            }
                            else subsequence = 1;
                        }
                        if (maxSubsequence == 4){ //если 4 подряд идущих числа, то это квадрат и можно считать его площадь
                            areaSquare = maxElement * maxElement; //площадь квадрата
                            if (maxAreaSquare < areaSquare) maxAreaSquare = areaSquare; //если ранее тоже был квадрат, то мы сравниваем площадь прошлого и нынешнего
                        }
                    }
                }
            }
        }
        System.out.println(maxAreaSquare);
    }
}
