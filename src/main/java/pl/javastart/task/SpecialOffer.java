package pl.javastart.task;

import java.time.LocalDate;


public class SpecialOffer {

    private Product product;
    private String offerDescription;
    private LocalDate offerStart;
    private LocalDate offerEnd;
    private double discount;

    public SpecialOffer(Product product, String offerDescription, LocalDate offerStart, LocalDate offerEnd, double discount) {
        this.product = product;
        this.offerDescription = offerDescription;
        this.offerStart = offerStart;
        this.offerEnd = offerEnd;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "product=" + product +
                ", offerDescription='" + offerDescription + '\'' +
                ", offerStart=" + offerStart +
                ", offerEnd=" + offerEnd +
                ", discount=" + discount +
                '}';
    }
}
