package am.hgh.customer.service;

import am.hgh.customer.dto.CustomerDto;
import am.hgh.customer.entity.Customer;
import am.hgh.customer.mapper.CustomerMapper;
import am.hgh.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomer{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse("null");
    }

    @Override
    public Customer updateCustomer(CustomerDto customerDto) {
        Customer customer2Update = customerMapper.fromDto2Customer(customerDto);
        return customerRepository.save(customer2Update);
    }

    @Override
    public Customer createCustomer(CustomerDto customerDto) {
        Customer create2Update = customerMapper.fromDto2Customer(customerDto);
        return customerRepository.save(create2Update);;
    }

    @Override
    public void deleteCustomerById(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    public Customer getCustomerByName(String name) {
        return customerRepository.findCustomerByUserName(name);
    }
}
