package sia.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
