import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры листа M и N:");
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Создаем массив, представляющий лист
        int[][] sheet = new int[M][N];

        System.out.println("Введите количество вырезанных клеток:");
        int k = scanner.nextInt();

        // Вводим координаты вырезанных клеток и помечаем их как вырезанные
        System.out.println("Введите координаты вырезанных клеток:");
        for (int i = 0; i < k; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            sheet[x][y] = 1; // Помечаем клетку как вырезанную
        }

        // Ищем число кусков, на которые распадется лист
        int count = findPieces(sheet, M, N);
        System.out.println("Количество кусков, на которые распадется лист: " + count);
    }

    // Метод для поиска числа кусков
    private static int findPieces(int[][] sheet, int M, int N) {
        boolean[][] visited = new boolean[M][N];
        int count = 0;

        // Обходим каждую клетку листа
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // Если клетка не вырезана и не была посещена, запускаем обход в глубину
                if (sheet[i][j] == 0 && !visited[i][j]) {
                    count++; // Увеличиваем счетчик кусков
                    dfs(sheet, visited, i, j, M, N);
                }
            }
        }
        return count;
    }

    // Обход в глубину для пометки кусков, которые связаны
    private static void dfs(int[][] sheet, boolean[][] visited, int x, int y, int M, int N) {
        // Помечаем текущую клетку как посещенную
        visited[x][y] = true;

        // Проверяем соседние клетки
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            // Проверяем, находится ли соседняя клетка в пределах листа
            if (newX >= 0 && newX < M && newY >= 0 && newY < N) {
                // Если соседняя клетка не вырезана и не была посещена, запускаем обход в глубину
                if (sheet[newX][newY] == 0 && !visited[newX][newY]) {
                    dfs(sheet, visited, newX, newY, M, N);
                }
            }
        }
    }
}