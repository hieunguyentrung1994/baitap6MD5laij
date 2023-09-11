package ss6.bt.service;

import ss6.bt.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void deleteById(Long id);
}
