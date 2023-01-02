package pl.javastart.task;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Category samochody = new Category("samochody", "najlepsze samochody");
        Category slodycze = new Category("słodycze", "coś słodkiego dla każdego");

        Product baton = new Product("baton", 2.5, "baton czekoladowy z orzechami", slodycze);
        Product samochodBMW = new Product("samochódBMW", 100_000.0, "BMW M5 E60", samochody);
        Product samochodMercedes = new Product("samochódMercedes", 100_000.0, "Mercedes W211 E55 AMG", samochody);
        Product mandarynka = new Product("mandarynka", 0.5, "owoc mandarynka z Hiszpanii");


        SpecialOffer specjalnaOferta = new SpecialOffer(samochodBMW, "20 procent rabatu do końca stycznia!", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 31), 0.2);

        System.out.println(baton);
        System.out.println(samochodBMW);
        System.out.println(samochodMercedes);
        System.out.println(mandarynka);

    }
}
