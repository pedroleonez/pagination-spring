package pedroleonez.pagination_spring.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pedroleonez.pagination_spring.dto.ProductDto;
import pedroleonez.pagination_spring.pagination.PageResponse;
import pedroleonez.pagination_spring.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public PageResponse<ProductDto> list(Pageable pageable) {

        Pageable safe = PageRequest.of(
                pageable.getPageNumber(),
                Math.min(pageable.getPageSize(), 100));

        return PageResponse.of(
                productRepository.findAll(safe)
                        .map(ProductDto::from));
    }
}
