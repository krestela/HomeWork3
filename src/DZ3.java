public class DZ3 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        int money = 29000;
        int total = 0;
        int i = 0;
        while (total <=2390000){
                i++;
                total = total + total / 100;
                total = total + money;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
            }
            System.out.println("Задание 2 ");


    }
}