package org.azrul.services.banking.repository;

import org.azrul.services.banking.domain.ProductAccount;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProductAccount entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductAccountRepository extends JpaRepository<ProductAccount, Long> {

}
