package pl.javastart.task;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Category cars = new Category("cars", "the best cars");
        Category candy = new Category("candy", "candy for everyone");

        Product bar = new Product("bar", 2.5, "chocolate bar with nuts", candy);
        Product carBmw = new Product("carBMW", 100_000.0, "BMW M5 E60", cars);
        Product carMercedes = new Product("carMercedes", 100_000.0, "Mercedes W211 E55 AMG", cars);
        Product tangerine = new Product("tangerine", 0.5, "tangerine fruit from Spain");

        SpecialOffer specialOffer = new SpecialOffer(carBmw, "20 percent discount until"
                + " the end of January!", LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 31), 0.2);

        System.out.println(carBmw);
        System.out.println(carMercedes);
        System.out.println(tangerine);
        System.out.println(bar);

    }
}
