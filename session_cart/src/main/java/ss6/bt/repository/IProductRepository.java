package ss6.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ss6.bt.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
}
