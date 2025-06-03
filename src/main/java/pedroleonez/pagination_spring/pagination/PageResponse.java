package pedroleonez.pagination_spring.pagination;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PageResponse<T>(
        @JsonProperty("items") List<T> content,
        int page,
        int size,
        long totalPages,
        boolean hasNext) {
    public static <T> PageResponse<T> of(Page<T> page) {
        return new PageResponse<>(
                page.getContent(),
                page.getNumber(),
                page.getSize(),
                page.getTotalPages(),
                page.hasNext());
    }
}
