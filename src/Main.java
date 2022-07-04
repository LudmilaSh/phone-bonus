public class Main {
    public static void main(String[] args) {

        int count = 200; //начальный счет
        int payment = 900; //пополнение счета

        int bonus; //сумма бонусов
        int total; //итоговая сумма на счете клиента

        if (payment > 1000) {

            bonus = payment / 100;
            total = count + bonus + payment;
            System.out.println("Сумма на счете " + total + " рублей");
        } else {

            total = count + payment;
            System.out.println("Сумма на счете " + total + " рублей");
        }
    }
}
