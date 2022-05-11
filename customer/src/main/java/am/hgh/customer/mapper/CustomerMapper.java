package am.hgh.customer.mapper;

import am.hgh.customer.dto.CustomerDto;
import am.hgh.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "customerMachine", source = "customerMachine")
    Customer fromDto2Customer(CustomerDto customerDto);

    @Mapping(target = "customerMachine", source = "")
    CustomerDto toCustomerDto(Customer customer);


}
