package pl.javastart.task;

public class Product {

    private String name;
    private double price;
    private String productDescription;
    private Category category;

    public Product(String name, double price, String productDescription, Category category) {
        this(name, price, productDescription);
        this.category = category;
    }

    public Product(String name, double price, String productDescription) {
        this.name = name;
        this.price = price;
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productDescription='" + productDescription + '\'' +
                ", category=" + category +
                '}';
    }
}
