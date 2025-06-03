package pedroleonez.pagination_spring.dto;

import java.math.BigDecimal;

import pedroleonez.pagination_spring.model.Product;

public record ProductDto(
        String name,
        BigDecimal price) {
    public static ProductDto from(Product p) {
        return new ProductDto(
                p.getName(),
                p.getPrice());
    }
}
