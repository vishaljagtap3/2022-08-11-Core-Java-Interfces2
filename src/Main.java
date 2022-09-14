public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Customer 1");
        Employee e1 = new Employee(202, "Employee 1");
        Card crd1 = new Card("303", 10000);

        Tool.test(c1);
        Tool.test(e1);
        Tool.test(crd1);

        /*Customer c1 = new Customer(101, "BitCode");
        c1.info();
        c1.log("new customer created");

        System.out.println();

        Card card = new Card("1234123123", 33000);
        card.info();
        card.log("Card created");*/

    }
}
