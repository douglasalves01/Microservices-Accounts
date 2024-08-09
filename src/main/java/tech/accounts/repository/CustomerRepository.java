package tech.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.accounts.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
