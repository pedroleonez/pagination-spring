package pedroleonez.pagination_spring.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pedroleonez.pagination_spring.dto.ProductDto;
import pedroleonez.pagination_spring.pagination.PageResponse;
import pedroleonez.pagination_spring.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public PageResponse<ProductDto> list(Pageable pageable) {
        return productService.list(pageable);
    }

}
