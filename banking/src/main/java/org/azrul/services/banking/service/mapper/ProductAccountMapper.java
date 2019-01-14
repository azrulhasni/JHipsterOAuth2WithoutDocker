package org.azrul.services.banking.service.mapper;

import org.azrul.services.banking.domain.*;
import org.azrul.services.banking.service.dto.ProductAccountDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity ProductAccount and its DTO ProductAccountDTO.
 */
@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface ProductAccountMapper extends EntityMapper<ProductAccountDTO, ProductAccount> {

    @Mapping(source = "customer.id", target = "customerId")
    ProductAccountDTO toDto(ProductAccount productAccount);

    @Mapping(source = "customerId", target = "customer")
    ProductAccount toEntity(ProductAccountDTO productAccountDTO);

    default ProductAccount fromId(Long id) {
        if (id == null) {
            return null;
        }
        ProductAccount productAccount = new ProductAccount();
        productAccount.setId(id);
        return productAccount;
    }
}
