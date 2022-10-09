public class DZ5_1 {
    public static void main(String[] args) {
        System.out.println("Задание 3 ");
        int money1 = 15000;
        int month1 = 1;
        while (month1 <= 108) {
            money1 *= 1.07;
            month1++;
            if (month1 % 6 == 0) {

                System.out.println("Месяц " + month1 + " сумма накоплений равна " + money1 + "рублей");
            }

        }
        System.out.println("Задание 4 ");
        for (int day = 1; day <= 31; day += 7) {

            System.out.println("Сегодня пятница" + day + " -e число. Необходимо подготовить отчет.");

        }

    }
}