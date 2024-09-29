public class Test {
    // Функция для сложения двух многочленов
    public static int[] sumPolynomials(int[] p1, int[] p2) {
        int maxLength = Math.max(p1.length, p2.length);
        int[] sum = new int[maxLength];

        // Складываем коэффициенты многочленов
        for (int i = 0; i < maxLength; i++) {
            int coeff1 = (i < p1.length) ? p1[i] : 0;
            int coeff2 = (i < p2.length) ? p2[i] : 0;
            sum[i] = coeff1 + coeff2;
        }

        return sum;
    }

    // Функция для умножения двух многочленов
    public static int[] multiplyPolynomials(int[] p1, int[] p2) {
        int[] product = new int[p1.length + p2.length - 1];

        // Умножаем каждый член первого многочлена на каждый член второго многочлена
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p2.length; j++) {
                product[i + j] += p1[i] * p2[j];
            }
        }

        return product;
    }

    public static void main(String[] args) {
        int[] p1 = {2, 1, 3}; // Коэффициенты первого многочлена: 2 + x + 3x^2
        int[] p2 = {1, -2, 1}; // Коэффициенты второго многочлена: 1 - 2x + x^2

        // Сложение многочленов
        int[] sum = sumPolynomials(p1, p2);
        System.out.print("Сумма многочленов: ");
        printPolynomial(sum);

        // Умножение многочленов
        int[] product = multiplyPolynomials(p1, p2);
        System.out.print("Произведение многочленов: ");
        printPolynomial(product);
    }

    // Функция для печати многочлена
    public static void printPolynomial(int[] polynomial) {
        for (int i = 0; i < polynomial.length; i++) {
            if (polynomial[i] != 0) {
                if (i > 0 && polynomial[i] > 0) {
                    System.out.print(" + ");
                } else if (i > 0 && polynomial[i] < 0){
                    System.out.print(" - ");
                }
                if (Math.abs(polynomial[i]) > 1){
                    System.out.print(Math.abs(polynomial[i]));
                }
                if (i > 0) {
                    System.out.print("x^" + i);
                }
            }
        }
        System.out.println();
    }
}
