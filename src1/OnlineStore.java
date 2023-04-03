public
	class OnlineStore
    implements ShoppingCart{

    private Product[] products = new Product[20];
    private int productCounter = 0;

//TODO: implement missing methods from interface


    @Override
    public void addProduct(Product prod) {
        products[productCounter] = prod;
        productCounter++;
    }

    @Override
    public void removeProduct(Product prod) {
        for (int i = 0; i < productCounter; i++) {
            if (products[i]==prod){
                products[i]=null;
            }
        }
    }

    @Override
    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < productCounter; i++) {
            if (products[i]==null)continue;
            sum+=products[i].getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

//TODO: implement Book class
        Product book = new Book("The Catcher in the Rye", 10.99);
//TODO: implement Clothing class
        Product shirt = new Clothing("Blue Shirt", 25.99);
//TODO: implement Electronic class
        Product phone = new Electronics("iPhone 12", 999.99);

        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(phone);

        System.out.println("Total price: " + store.getTotalPrice());

        store.removeProduct(shirt);

        System.out.println("Total price: " + store.getTotalPrice());
    }
}
