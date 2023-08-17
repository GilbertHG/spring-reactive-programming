package sg.com.fairtech.springreactivemongocrud.utils;

import org.springframework.beans.BeanUtils;
import sg.com.fairtech.springreactivemongocrud.dto.ProductDto;
import sg.com.fairtech.springreactivemongocrud.entity.Product;

public class AppUtils {

    public static ProductDto entityToDto(Product product) {

        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;

    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }

}
