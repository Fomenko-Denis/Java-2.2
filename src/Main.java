
public class Main {

    public static void main(String[] args) {
        int balance = 500;
        int refill = 3000;

        int bonus = refill >= 1000 ? refill / 100 : 0;
        int finish = balance + refill + bonus;
        System.out.println("Итоговый баланс = " + finish);
        System.out.println("Бонус =" + bonus);
    }
}
