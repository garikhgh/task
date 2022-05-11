package am.hgh.customer.service;

import am.hgh.customer.dto.CustomerDto;
import am.hgh.customer.entity.Customer;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface ICustomer {
    @Secured({"ROLE_USER", "ROlE_ADMIN"})
    List<Customer> getAllCustomers();

    @Secured({"ROLE_USER", "ROlE_ADMIN"})
    Customer getCustomerById(Long customerId);

    @Secured({"ROLE_USER", "ROlE_ADMIN"})
    Customer updateCustomer(CustomerDto customerDto);

    @Secured({"ROLE_USER", "ROlE_ADMIN"})
    Customer createCustomer(CustomerDto customerDto);

    @Secured({"ROLE_USER", "ROlE_ADMIN"})
    void deleteCustomerById(Long customerId);




}
