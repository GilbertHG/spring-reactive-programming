package sg.com.fairtech.springreactivemongocrud.repository;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import sg.com.fairtech.springreactivemongocrud.dto.ProductDto;
import sg.com.fairtech.springreactivemongocrud.entity.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);
}
