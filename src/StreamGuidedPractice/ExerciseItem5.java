package StreamGuidedPractice;

import java.math.BigDecimal;
import java.util.List;

public class ExerciseItem5 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("2000000.00");

    public static void main(String[] args) {
        List<Product2> listProduct2 = List.of(
                new Product2("LG", "tv", new BigDecimal("3999998.99")),
                new Product2("Hitachi", "tv", new BigDecimal("3000000.00")),
                new Product2("Samsung", "phone", new BigDecimal("20000000.00"))
        );

        Product2 filteredProductList = listProduct2.stream()
                .filter(product1 -> PRECIO_BUSQUEDA.compareTo(product1.getUnitPrice()) > 0)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Producto not found"));

            System.out.println("The first product found is " + filteredProductList);
    }
}

class Product1 {
    private String name;
    private String type;
    private BigDecimal unitPrice;

    public Product1(String name, String type, BigDecimal unitPrice) {
        this.name = name;
        this.type = type;
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + '\n' +
                "Type: " + this.type + '\n' +
                "Unit Price: " + this.unitPrice;
    }
}