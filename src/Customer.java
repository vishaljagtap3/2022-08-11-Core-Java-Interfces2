public class Customer implements Loggable{

    private int custId;
    private String name;

    public Customer(int custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("M1 : Author");
    }

    @Override
    public void log(String text) {
        System.out.println("Log of Cust " + custId + " --> " + text);
    }
}
