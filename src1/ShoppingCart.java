public interface ShoppingCart {
    void addProduct (Product prod);
    void removeProduct (Product prod);
    double getTotalPrice();
}
