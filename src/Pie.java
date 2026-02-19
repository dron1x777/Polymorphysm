public class Pie implements Baked {
    private String name;
    private double price;
    public Pie(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void bake(int temperature) {
        System.out.println("Baking " + name + " with temperature " + temperature);
    }

    @Override
    public String getPrice() {
        return "price: " + price;
    }

    @Override
    public void showInfo() {
        System.out.println("Baking " + name + " price: " + getPrice());
        System.out.println();
        System.out.println("------------------------------------------");
    }
}
