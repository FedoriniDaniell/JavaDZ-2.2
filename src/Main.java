public class Main {

    public static void main(String[] args) {
        int x = 2100;
        int amount = 1500;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int balance = x + amount + bonus;
        System.out.println("Ваш баланс:" + balance + "руб.Ваш бонус:" + bonus + "руб.");
    }
}
