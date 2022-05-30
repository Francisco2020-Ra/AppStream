package StreamGuidedPractice;

import java.math.BigDecimal;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class ExerciseItem6 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("2000000.00");

    public static void main(String[] args) {
        List<Product2> listProduct2 = List.of(
                new Product2("LG", "tv", new BigDecimal("1999998.99")),
                new Product2("Hitachi", "tv", new BigDecimal("3000000.00")),
                new Product2("Samsung", "phone", new BigDecimal("1000000.00"))
        );

        List<Product2> filteredProductList = listProduct2.stream()
                .filter(product2 -> PRECIO_BUSQUEDA.compareTo(product2.getUnitPrice()) > 0)
                        .collect(toList());
        System.out.println("Product List: " + filteredProductList);
    }
}

class Product2 {
    private String name;
    private String type;
    private BigDecimal unitPrice;

    public Product2(String name, String type, BigDecimal unitPrice) {
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