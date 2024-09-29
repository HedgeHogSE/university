package university.fifel;

public class Fibo {
    public static boolean fibo(long n){
        long num1 = 1;
        long num2 = 1;
        while (true){
            if (num1 > n){
                return false;
            } else if (n == num1 || n == num2){
                return true;
            } else{
                long num1Copy = num1;
                num1 = num2;
                num2 = num1Copy + num2;
            }
        }
    }

    public static void main(String[] args) {
        long n = 2880067194370816120L;
        if (fibo(n)){
            System.out.printf("Число %d является членом последовательности Фибоначчи. \n", n);
        } else {
            System.out.printf("Число %d НЕ является членом последовательности Фибоначчи. \n", n);
        }
    }
}
