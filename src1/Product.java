public class Product implements IProduct{
    String Name;
    double Price;

    public Product(String name, double price) {
        Name = name;
        Price = price;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
