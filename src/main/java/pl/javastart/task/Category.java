package pl.javastart.task;

public class Category {
    private String name;
    private String categoryDesription;

    public Category(String name, String categoryDesription) {
        this.name = name;
        this.categoryDesription = categoryDesription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryDesription='" + categoryDesription + '\'' +
                '}';
    }
}
