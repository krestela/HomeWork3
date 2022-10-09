public class DZ4 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total <=2_459_000){
            i++;
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");

        }
        System.out.println("Задание 2 ");
        int r = 0;
        while (r<10){
            r++;
            System.out.print(" "+r+ " ");
        }
        System.out.println(" ");
        int p = 10;
        for(;p>=1;p--){
            System.out.print(" "+p+ " ");}
        System.out.println(" ");

        System.out.println("Задание 3 ");
        int people = 12_000_000;
        int newPeople = 17;
        int deathPeople = 8;
        int newPeopleEveryYear = people * newPeople / 1000;
        int deathPeopleEveryYear = people * deathPeople / 1000;
        int discrepancy = newPeopleEveryYear - deathPeopleEveryYear;
        for (int year = 1; year <= 10; year++){
            people += discrepancy;
            System.out.printf("Год %d, численность %d населения составляет \n", year, people);
        }

    }
}
