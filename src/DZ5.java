public class DZ5 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        int money = 15000;
        int month = 1;
        while (money <= 12_000_000) {
            money *= 1.07;
            month++;
            if (month % 6 == 0) {

                System.out.println("Месяц " + month + " сумма накоплений равна " + money + "рублей");
            }
        }
    }
}
