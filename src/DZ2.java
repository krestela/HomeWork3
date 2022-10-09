public class DZ2 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        {
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println("Числа " + i);
            }
        }
        System.out.println("Задание 2 ");
        for (int y = 7; y < 98; y = y + 7) {
            System.out.println("Четные числа: " + y);
        }
        System.out.println("Задание 3 ");
        for (int u = 1; u <= 512; u = u * 2) {
            System.out.println("числа: " + u);
        }
    }
}
