package tech.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.accounts.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
}
