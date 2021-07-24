package br.com.mmt.delivery.repository;

import br.com.mmt.delivery.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
