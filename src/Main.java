public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startBalance = 100;    // Начальный счёт
        int amountDeposit = 1100;    // Сумма пополнения
        int bonusUp = 1000;   // Сумма от которой капает бонус
        int bonus = 0;              // Сумма бонуса
        int resultBalance = 0;       // Итоговый баланс

        // превысила ли
        // сумма пополнения порог
        if (amountDeposit > bonusUp) {
            bonus = amountDeposit / 100;
        }

        // Рассчитываем итоговый счёт
        resultBalance = startBalance + amountDeposit + bonus;

        //Вывод результата
        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + resultBalance + " рублей");
    }
}