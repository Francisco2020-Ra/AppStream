package StreamGuidedPractice;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ExerciseItem4 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal("2000000.00");

    public static void main(String[] args) {
        List<Product2> listProduct2 = List.of(
                new Product2("LG", "tv", new BigDecimal("3999998.99")),
                new Product2("Hitachi", "tv", new BigDecimal("3000000.00")),
                new Product2("Samsung", "phone", new BigDecimal("200000.00"))
        );

        Optional<Product2> filteredProductList = listProduct2.stream()
                .filter(product -> PRECIO_BUSQUEDA.compareTo(product.getUnitPrice()) > 0)
                .findFirst();

        if(filteredProductList.isPresent()){
            System.out.println("The first product found is " + filteredProductList.get());
        }else{
            System.out.println("Product2 not found");
        }
    }
}

class Product {
    private String name;
    private String type;
    private BigDecimal unitPrice;

    public Product(String name, String type, BigDecimal unitPrice) {
        this.name = name;
        this.type = type;
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice (){
        return this.unitPrice;
    }

    @Override
    public String toString(){
        return "\nName: " + this.name +'\n'+
                "Type: " + this.type +'\n'+
                "Unit Price: " + this.unitPrice;
    }
}