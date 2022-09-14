public class Employee implements Loggable {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("id = " +  id + " name = " + name );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Emp Info: for " + id);
    }

    @Override
    public void log(String text) {
        System.out.println("Emp log: for " + id);
    }
}
