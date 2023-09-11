package ss6.bt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    private Long id;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private Map<Product,Integer> items = new HashMap<>();
    private double total;


    public void copyCart(Map<Product, Integer> cartItems) {
        this.items = new HashMap<>(cartItems);
    }
}
