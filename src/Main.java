public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(101, "BitCode");
        c1.info();
        c1.log("new customer created");

        System.out.println();

        Card card = new Card("1234123123", 33000);
        card.info();
        card.log("Card created");

    }
}
