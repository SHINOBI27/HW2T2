public class Main {
    public static void main(String[] args) {
        int account = 200;
        int replenishment = 3400;
        int bonus = replenishment / 100;
        if (replenishment > 1000) {
            System.out.println("Количесвто бонусных рублей:");
            System.out.println(bonus);
            System.out.println("На счету:");
            System.out.println(account + replenishment + bonus);
        } else {
            System.out.println("На счету:");
            System.out.println(account + replenishment);
        }
    }
}

