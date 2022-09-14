//interfaces behave like base classes


public class Tool {
    public static void test(Loggable l) {
        l.info();
        l.log("this is log");
        System.out.println();
    }

   /* public static void test(Employee e) {
        e.info();
        e.log(e.getName());
        System.out.println();
    }

    public static void test(Card c) {
        c.info();
        c.log(c.getCardNumber());
        System.out.println();
    }

    public static void test(Customer c) {
        c.info();
        c.log(c.getName());
        System.out.println();
    }*/
}
