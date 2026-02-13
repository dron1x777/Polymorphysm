public class Person {
    protected String name;
    protected int id;
    protected String email;

    public Person(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }


    public String getRole() {
        return name + " is person";
    }

    public String getAccessLevel() {
        return "basic level";
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Role: " + getRole());
    }
    public String getName() { return name; }
    public int getId() { return id; }
}
