package StreamGuidedPractice;

import java.math.BigDecimal;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ExerciseItem9 {private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("2000000.00");

    public static void main(String[] args) {
        List<Product5> listProduct5 = List.of(
                new Product5("LG", "tv", new BigDecimal("999998.99")),
                new Product5("Hitachi", "tv", new BigDecimal("100000.00")),
                new Product5("Samsung", "phone", new BigDecimal("1000000.00"))
        );

        listProduct5.stream()
                .forEach(product5 -> product5.setUnitPrice(product5.getUnitPrice().multiply(new BigDecimal("1.15"))));
        listProduct5.forEach(newPriceUnited -> System.out.println(newPriceUnited));
    }
}

class Product5 {
    private String name;
    private String type;
    private BigDecimal unitPrice;

    public Product5(String name, String type, BigDecimal unitPrice) {
        this.name = name;
        this.type = type;
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + '\n' +
                "Type: " + this.type + '\n' +
                "Unit Price: " + this.unitPrice;
    }
}

