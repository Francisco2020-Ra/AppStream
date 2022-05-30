package StreamGuidedPractice;

import java.math.BigDecimal;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ExerciseItem8 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("2000000.00");

    public static void main(String[] args) {
        List<Product4> listProduct4 = List.of(
                new Product4("LG", "tv", new BigDecimal("999998.99")),
                new Product4("Hitachi", "tv", new BigDecimal("000000.00")),
                new Product4("Samsung", "phone", new BigDecimal("1000000.00"))
        );

        listProduct4.forEach(s -> System.out.println(s.getUnitPrice()));
    }
}

class Product4 {
    private String name;
    private String type;
    private BigDecimal unitPrice;

    public Product4(String name, String type, BigDecimal unitPrice) {
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

    @Override
    public String toString() {
        return "\nName: " + this.name + '\n' +
                "Type: " + this.type + '\n' +
                "Unit Price: " + this.unitPrice;
    }
}

