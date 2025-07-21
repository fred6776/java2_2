public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startBalance = 100;    // Начальный счёт
        int amount_deposit = 1100;    // Сумма пополнения
        int bonusUp = 1000;   // Сумма от которой капает бонус
        int bonus = 0;              // Сумма бонуса
        int Result_balance = 0;       // Итоговый баланс

        // превысила ли
        // сумма пополнения порог
        if (amount_deposit > bonusUp) {
            bonus = amount_deposit / 100;
        }

        // Рассчитываем итоговый счёт
        Result_balance = startBalance + amount_deposit + bonus;

        //Вывод результата
        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + Result_balance + " рублей");
    }
}